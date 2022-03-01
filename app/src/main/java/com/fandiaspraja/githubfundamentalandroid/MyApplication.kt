package com.fandiaspraja.githubfundamentalandroid

import android.app.Application
import com.fandiaspraja.githubfundamentalandroid.core.di.databaseModule
import com.fandiaspraja.githubfundamentalandroid.core.di.networkModule
import com.fandiaspraja.githubfundamentalandroid.core.di.repositoryModule
import com.fandiaspraja.githubfundamentalandroid.di.userCaseModule
import com.fandiaspraja.githubfundamentalandroid.di.viewModelModule
import org.koin.android.ext.koin.androidContext
import org.koin.android.ext.koin.androidLogger
import org.koin.core.context.startKoin
import org.koin.core.logger.Level

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()

        startKoin {
            androidLogger(Level.NONE)
            androidContext(this@MyApplication)
            val modules = modules(
                listOf(
                    databaseModule,
                    networkModule,
                    repositoryModule,
                    userCaseModule,
                    viewModelModule
                )
            )
        }
    }
}