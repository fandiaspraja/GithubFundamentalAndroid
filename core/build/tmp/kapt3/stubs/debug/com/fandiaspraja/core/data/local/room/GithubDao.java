package com.fandiaspraja.core.data.local.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\'J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\b\u0010\u000b\u001a\u00020\fH\'J\u0014\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\u000f0\u000eH\'J\u0010\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001c\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000f0\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u001c\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0\u000e2\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0016\u0010\u0016\u001a\u00020\u00032\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u000fH\'J\u0016\u0010\u0018\u001a\u00020\u00032\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fH\'J\u0010\u0010\u001a\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\'\u00a8\u0006\u001b"}, d2 = {"Lcom/fandiaspraja/core/data/local/room/GithubDao;", "", "deleteFollowers", "", "id", "", "deleteFollowing", "deleteUsergithub", "userGithub", "Lcom/fandiaspraja/core/data/local/entity/UserEntity;", "deleteUsergithubByid", "findAll", "Landroid/database/Cursor;", "findAllUsergithub", "Lkotlinx/coroutines/flow/Flow;", "", "findByid", "findUserByid", "getAllFollowers", "Lcom/fandiaspraja/core/data/local/entity/FollowersEntity;", "getAllFollowing", "Lcom/fandiaspraja/core/data/local/entity/FollowingEntity;", "insertFollowers", "followers", "insertFollowing", "following", "insertUserFavorite", "core_debug"})
public abstract interface GithubDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertUserFavorite(@org.jetbrains.annotations.NotNull()
    com.fandiaspraja.core.data.local.entity.UserEntity userGithub);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fandiaspraja.core.data.local.entity.UserEntity>> findAllUsergithub();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user")
    public abstract android.database.Cursor findAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user WHERE id = :id")
    public abstract android.database.Cursor findByid(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM user WHERE id = :id")
    public abstract kotlinx.coroutines.flow.Flow<com.fandiaspraja.core.data.local.entity.UserEntity> findUserByid(int id);
    
    @androidx.room.Delete()
    public abstract void deleteUsergithub(@org.jetbrains.annotations.NotNull()
    com.fandiaspraja.core.data.local.entity.UserEntity userGithub);
    
    @androidx.room.Query(value = "DELETE FROM user WHERE id = :id")
    public abstract void deleteUsergithubByid(int id);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertFollowers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fandiaspraja.core.data.local.entity.FollowersEntity> followers);
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void insertFollowing(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fandiaspraja.core.data.local.entity.FollowingEntity> following);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM followers WHERE user_id = :id")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fandiaspraja.core.data.local.entity.FollowersEntity>> getAllFollowers(int id);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM following WHERE user_id = :id")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.fandiaspraja.core.data.local.entity.FollowingEntity>> getAllFollowing(int id);
    
    @androidx.room.Query(value = "DELETE FROM followers WHERE user_id = :id")
    public abstract void deleteFollowers(int id);
    
    @androidx.room.Query(value = "DELETE FROM following WHERE user_id = :id")
    public abstract void deleteFollowing(int id);
}