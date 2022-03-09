package com.fandiaspraja.core.domain.repository

import com.fandiaspraja.core.data.Resource
import com.fandiaspraja.core.domain.model.Followers
import com.fandiaspraja.core.domain.model.Following
import com.fandiaspraja.core.domain.model.User
import com.fandiaspraja.core.domain.model.UserDetail
import kotlinx.coroutines.flow.Flow

interface IUserRepository {

    suspend fun searchUsers(search: String, page : String, token: String): Flow<Resource<List<User>>>

    suspend fun getDetailUser(username: String, token: String): Flow<Resource<UserDetail>>

    suspend fun findAllUsergithub(): Flow<Resource<List<User>>>

    suspend fun findUsergithub(id: Int): Flow<Resource<UserDetail>>

    suspend fun insertUserFavorite(userDetail : UserDetail)

    suspend fun deleteUsergithubByid(id: Int)

    suspend fun getFollowers(search: String, page : String, token: String): Flow<Resource<List<Followers>>>

    suspend fun getFollowings(search: String, page : String, token: String): Flow<Resource<List<Following>>>

    suspend fun getAllFollowers(id: Int): Flow<Resource<List<Followers>>>

    suspend fun getAllFollowing(id: Int): Flow<Resource<List<Following>>>

    suspend fun deleteFollowers(id: Int)

    suspend fun deleteFollowing(id: Int)

    suspend fun insertFollowers(id: Int, followers: List<Followers>)

    suspend fun insertFollowing(id: Int, following: List<Following>)

}