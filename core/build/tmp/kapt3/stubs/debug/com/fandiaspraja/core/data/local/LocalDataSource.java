package com.fandiaspraja.core.data.local;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001d\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0010J\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\r2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e0\r2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ%\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000e0\r2\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\u0016\u001a\u00020\u00062\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00130\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u001f\u0010\u0019\u001a\u00020\u00062\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u000eH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0018J\u0019\u0010\u001b\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u000fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001dR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001e"}, d2 = {"Lcom/fandiaspraja/core/data/local/LocalDataSource;", "", "githubDao", "Lcom/fandiaspraja/core/data/local/room/GithubDao;", "(Lcom/fandiaspraja/core/data/local/room/GithubDao;)V", "deleteFollowers", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFollowing", "deleteUsergithubByid", "findAllUsergithub", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/fandiaspraja/core/data/local/entity/UserEntity;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findUsergithub", "getAllFollowers", "Lcom/fandiaspraja/core/data/local/entity/FollowersEntity;", "getAllFollowing", "Lcom/fandiaspraja/core/data/local/entity/FollowingEntity;", "insertFollowers", "followers", "(Ljava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFollowing", "following", "insertUserFavorite", "userEntity", "(Lcom/fandiaspraja/core/data/local/entity/UserEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "core_debug"})
public final class LocalDataSource {
    private final com.fandiaspraja.core.data.local.room.GithubDao githubDao = null;
    
    public LocalDataSource(@org.jetbrains.annotations.NotNull()
    com.fandiaspraja.core.data.local.room.GithubDao githubDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object findAllUsergithub(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.fandiaspraja.core.data.local.entity.UserEntity>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object findUsergithub(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.fandiaspraja.core.data.local.entity.UserEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertUserFavorite(@org.jetbrains.annotations.NotNull()
    com.fandiaspraja.core.data.local.entity.UserEntity userEntity, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteUsergithubByid(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertFollowers(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fandiaspraja.core.data.local.entity.FollowersEntity> followers, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertFollowing(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fandiaspraja.core.data.local.entity.FollowingEntity> following, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteFollowers(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object deleteFollowing(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllFollowers(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.fandiaspraja.core.data.local.entity.FollowersEntity>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getAllFollowing(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<com.fandiaspraja.core.data.local.entity.FollowingEntity>>> continuation) {
        return null;
    }
}