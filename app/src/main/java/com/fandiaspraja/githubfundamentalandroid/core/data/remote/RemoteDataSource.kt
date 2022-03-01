package com.fandiaspraja.githubfundamentalandroid.core.data.remote

import android.util.Log
import com.fandiaspraja.githubfundamentalandroid.core.data.remote.network.ApiResponse
import com.fandiaspraja.githubfundamentalandroid.core.data.remote.network.ApiService
import com.fandiaspraja.githubfundamentalandroid.core.data.remote.response.DataFollowersResponse
import com.fandiaspraja.githubfundamentalandroid.core.data.remote.response.DataFollowingResponse
import com.fandiaspraja.githubfundamentalandroid.core.data.remote.response.DetailResponse
import com.fandiaspraja.githubfundamentalandroid.core.data.remote.response.UserResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.channelFlow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn

class RemoteDataSource(private val apiService: ApiService) {

    suspend fun searchUsers(search: String, page : String, token: String): Flow<ApiResponse<List<UserResponse>>> {
        return channelFlow {
            try {
                val response = apiService.searchUsers(search, page, token)

                if (response.totalCount != 0){
                    send(ApiResponse.Success(response.items))
                }else{
                    send(ApiResponse.Empty)
                }
            }catch (e: Exception){
                send(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }

        }.flowOn(Dispatchers.IO)
    }

    suspend fun getDetailUser(username: String, token: String): Flow<ApiResponse<DetailResponse>> {
        return channelFlow {
            try {
                val response = apiService.getDetailUser(username, token)
                val dataDetail = response
                if (dataDetail != null){
                    send(ApiResponse.Success(response))
                }else{
                    send(ApiResponse.Empty)
                }
            }catch (e: Exception){
                send(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }

        }.flowOn(Dispatchers.IO)
    }

    suspend fun getFollowers(search: String, page : String, token: String): Flow<ApiResponse<List<DataFollowersResponse>>> {
        return channelFlow {
            try {
                val response = apiService.getFollowers(search, page, token)

                if (response.size != 0){
                    Log.d("ada berapa", response.size.toString())

                    send(ApiResponse.Success(response))
                }else{
                    send(ApiResponse.Empty)
                }
            }catch (e: Exception){
                send(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }

        }.flowOn(Dispatchers.IO)
    }

    suspend fun getFollowings(search: String, page : String, token: String): Flow<ApiResponse<List<DataFollowingResponse>>> {
        return channelFlow {
            try {
                val response = apiService.getFollowings(search, page, token)
                Log.d("ada berapa", response.size.toString())

                if (response?.size != 0){

                    send(ApiResponse.Success(response))
                }else{
                    send(ApiResponse.Empty)
                }
            }catch (e: Exception){
                send(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }

        }.flowOn(Dispatchers.IO)
    }
}