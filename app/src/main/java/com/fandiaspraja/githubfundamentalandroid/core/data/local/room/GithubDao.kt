package com.fandiaspraja.githubfundamentalandroid.core.data.local.room

import android.database.Cursor
import androidx.room.*
import com.fandiaspraja.githubfundamentalandroid.core.data.local.entity.FollowersEntity
import com.fandiaspraja.githubfundamentalandroid.core.data.local.entity.FollowingEntity
import com.fandiaspraja.githubfundamentalandroid.core.data.local.entity.UserEntity
import kotlinx.coroutines.flow.Flow

@Dao
interface GithubDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertUserFavorite(userGithub: UserEntity)

    @Query("SELECT * FROM user")
    fun findAllUsergithub(): Flow<List<UserEntity>>

    @Query("SELECT * FROM user")
    fun findAll(): Cursor

    @Query("SELECT * FROM user WHERE id = :id")
    fun findByid(id: Int): Cursor

    @Query("SELECT * FROM user WHERE id = :id")
    fun findUserByid(id: Int): Flow<UserEntity>

    @Delete
    fun deleteUsergithub(userGithub: UserEntity)

    @Query("DELETE FROM user WHERE id = :id")
    fun deleteUsergithubByid(id: Int)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFollowers(followers: List<FollowersEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertFollowing(following: List<FollowingEntity>)

    @Query("SELECT * FROM followers WHERE user_id = :id")
    fun getAllFollowers(id: Int): Flow<List<FollowersEntity>>

    @Query("SELECT * FROM following WHERE user_id = :id")
    fun getAllFollowing(id: Int): Flow<List<FollowingEntity>>

    @Query("DELETE FROM followers WHERE user_id = :id")
    fun deleteFollowers(id: Int)

    @Query("DELETE FROM following WHERE user_id = :id")
    fun deleteFollowing(id: Int)
}