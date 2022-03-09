package com.fandiaspraja.core.di

import android.app.Application
import androidx.room.Room
import com.chuckerteam.chucker.api.ChuckerCollector
import com.chuckerteam.chucker.api.ChuckerInterceptor
import com.chuckerteam.chucker.api.RetentionManager
import com.fandiaspraja.core.data.local.LocalDataSource
import com.fandiaspraja.core.data.local.room.GithubDatabase
import com.fandiaspraja.core.data.remote.RemoteDataSource
import com.fandiaspraja.core.data.remote.network.ApiService
import com.fandiaspraja.core.data.repository.GithubRepository
import com.fandiaspraja.core.domain.repository.IUserRepository
import com.fandiaspraja.core.utils.AppExecutors
import com.fandiaspraja.core.utils.Constants
import com.fandiaspraja.core.utils.PreferenceUtils
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.ext.koin.androidApplication
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.security.SecureRandom
import java.security.cert.X509Certificate
import java.util.concurrent.TimeUnit
import javax.net.ssl.HostnameVerifier
import javax.net.ssl.SSLContext
import javax.net.ssl.TrustManager
import javax.net.ssl.X509TrustManager


val databaseModule = module {
    factory { get<GithubDatabase>().githubDao() }
    single {
        Room.databaseBuilder(
            androidContext(),
            GithubDatabase::class.java, "Github.db"
        ).fallbackToDestructiveMigration().build()
    }
}

val networkModule = module {
    single {
        createOkHttpClientpClient(androidApplication())
    }


    single {


        val retrofit = Retrofit.Builder()

            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .client(get())
            .build()
        retrofit.create(ApiService::class.java)
    }
}

fun createOkHttpClientpClient(context: Application): OkHttpClient {
    val httpLoggingInterceptor = HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY)
    val clientBuilder = OkHttpClient.Builder()
    val preferenceUtils = PreferenceUtils(context)


    return try {
        // Create a trust manager that does not validate certificate chains
        val trustAllCerts =
            arrayOf<TrustManager>(
                object : X509TrustManager {
                    override fun checkClientTrusted(
                        chain: Array<X509Certificate>,
                        authType: String
                    ) {
                    }
                    override fun checkServerTrusted(
                        chain: Array<X509Certificate>,
                        authType: String
                    ) {
                    }
                    override fun getAcceptedIssuers(): Array<X509Certificate> {
                        return arrayOf()
                    }
                }
            )

        val sslContext = SSLContext.getInstance("SSL")
        sslContext.init(null, trustAllCerts, SecureRandom())
        val sslSocketFactory = sslContext.socketFactory
        clientBuilder.sslSocketFactory(
            sslSocketFactory,
            (trustAllCerts[0] as X509TrustManager)
        )
        clientBuilder.hostnameVerifier(HostnameVerifier { hostname, session -> true
        })
        clientBuilder.connectTimeout(120, TimeUnit.SECONDS)
        clientBuilder.readTimeout(120, TimeUnit.SECONDS)

        clientBuilder.cache(Cache(context.cacheDir, (5 * 1024 * 1024).toLong()))
            .addInterceptor { chain ->
                var request = chain.request()
//                request =
//                    if (!preferenceUtils.getValueString(Constants.API_KEY).isNullOrEmpty()){
//                        request.newBuilder()
//                            .header("Content-Type", "application/json")
//                            .header("Authorization","Bearer " + preferenceUtils.getValueString(Constants.API_KEY))
//                            .build()
//                    }else{
//                        request.newBuilder()
//                            .header("Content-Type", "application/json")
//                            .build()
//                    }

                request = request.newBuilder()
                    .header("Content-Type", "application/json")
                    .build()
                chain.proceed(request)
            }
//        if (BuildConfig.DEBUG) {
//
//        }

        // Create the Collector
        val chuckerCollector = ChuckerCollector(
            context = context,
            // Toggles visibility of the push notification
            showNotification = true,
            // Allows to customize the retention period of collected data
            retentionPeriod = RetentionManager.Period.ONE_HOUR
        )

// Create the Interceptor
        val chuckerInterceptor = ChuckerInterceptor.Builder(context)
            // The previously created Collector
            .collector(chuckerCollector)
            // The max body content length in bytes, after this responses will be truncated.
            .maxContentLength(250_000L)
            // List of headers to replace with ** in the Chucker UI
            .redactHeaders("Auth-Token", "Bearer")
            // Read the whole response body even when the client does not consume the response completely.
            // This is useful in case of parsing errors or when the response body
            // is closed before being read like in Retrofit with Void and Unit types.
            .alwaysReadResponseBody(true)
            // Use decoder when processing request and response bodies. When multiple decoders are installed they
            // are applied in an order they were added.
//                .addBodyDecoder(decoder)
            // Controls Android shortcut creation. Available in SNAPSHOTS versions only at the moment
//                .createShortcut(true)
            .build()

        httpLoggingInterceptor.level = HttpLoggingInterceptor.Level.BODY
        clientBuilder.addInterceptor(httpLoggingInterceptor)
        clientBuilder.addInterceptor(chuckerInterceptor)

        return clientBuilder.build()
    } catch (e: Exception) {
        throw RuntimeException(e)
    }
}

val repositoryModule = module {
    factory { AppExecutors() }
    single { RemoteDataSource(get()) }
    single { LocalDataSource(get()) }
    single<IUserRepository> { GithubRepository(get(), get(), get()) }
//    single<IServiceRepository> { ServiceRepository(get(), get()) }
//    single<IFamiliesRepository> { FamiliesRepository(get(), get()) }
//    single<INotificationRepository> { NotificationRepository(get(), get()) }

}