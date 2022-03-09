package com.fandiaspraja.core.data.local.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.fandiaspraja.core.data.local.entity.FollowersEntity
import com.fandiaspraja.core.data.local.entity.FollowingEntity
import com.fandiaspraja.core.data.local.entity.UserEntity


@Database(entities = [UserEntity::class, FollowersEntity::class, FollowingEntity::class], version = 1, exportSchema = false)
abstract class GithubDatabase : RoomDatabase() {

    abstract fun githubDao(): GithubDao
}