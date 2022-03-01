package com.fandiaspraja.githubfundamentalandroid.core.data.local

import com.fandiaspraja.githubfundamentalandroid.core.data.local.entity.FollowersEntity
import com.fandiaspraja.githubfundamentalandroid.core.data.local.entity.FollowingEntity
import com.fandiaspraja.githubfundamentalandroid.core.data.local.entity.UserEntity
import com.fandiaspraja.githubfundamentalandroid.core.data.local.room.GithubDao
import kotlinx.coroutines.flow.Flow

class LocalDataSource(private val githubDao: GithubDao) {

    suspend fun findAllUsergithub(): Flow<List<UserEntity>> =
        githubDao.findAllUsergithub()

    suspend fun findUsergithub(id: Int): Flow<UserEntity> =
        githubDao.findUserByid(id)

    suspend fun insertUserFavorite(userEntity: UserEntity) =
        githubDao.insertUserFavorite(userEntity)

    suspend fun deleteUsergithubByid(id : Int) =
        githubDao.deleteUsergithubByid(id)

    suspend fun insertFollowers(followers: List<FollowersEntity>) =
        githubDao.insertFollowers(followers)

    suspend fun insertFollowing(following: List<FollowingEntity>) =
        githubDao.insertFollowing(following)

    suspend fun deleteFollowers(id : Int) =
        githubDao.deleteFollowers(id)

    suspend fun deleteFollowing(id : Int) =
        githubDao.deleteFollowing(id)

    suspend fun getAllFollowers(id: Int): Flow<List<FollowersEntity>> =
        githubDao.getAllFollowers(id)

    suspend fun getAllFollowing(id: Int): Flow<List<FollowingEntity>> =
        githubDao.getAllFollowing(id)
}