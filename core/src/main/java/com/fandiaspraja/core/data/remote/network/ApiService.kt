package com.fandiaspraja.core.data.remote.network

import com.fandiaspraja.core.data.remote.response.DataFollowersResponse
import com.fandiaspraja.core.data.remote.response.DataFollowingResponse
import com.fandiaspraja.core.data.remote.response.DetailResponse
import com.fandiaspraja.core.data.remote.response.SearchResponse
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("search/users")
    suspend fun searchUsers(@Query("q") username : String, @Query("page") page : String, @Header("Authorization") token: String): SearchResponse

    @GET("users/{username}")
    suspend fun getDetailUser(@Path("username") username : String, @Header("Authorization") token: String): DetailResponse

    @GET("users/{username}/followers")
    suspend fun getFollowers(@Path("username") username : String, @Query("page") page : String, @Header("Authorization") token: String): List<DataFollowersResponse>

    @GET("users/{username}/following")
    suspend fun getFollowings(@Path("username") username : String, @Query("page") page : String, @Header("Authorization") token: String): List<DataFollowingResponse>
}