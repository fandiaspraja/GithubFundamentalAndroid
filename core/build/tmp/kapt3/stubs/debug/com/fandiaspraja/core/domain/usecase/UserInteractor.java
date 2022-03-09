package com.fandiaspraja.core.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ#\u0010\f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e0\rH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J%\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e0\r2\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ+\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0\u000e0\r2\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ+\u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000f0\u000e0\r2\u0006\u0010\u0007\u001a\u00020\bH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ-\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00130\u000e0\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001cJ;\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u000f0\u000e0\r2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J;\u0010!\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00170\u000f0\u000e0\r2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 J\'\u0010\"\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00150\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\'\u0010%\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00170\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010$J\u0019\u0010\'\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u0013H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010)J;\u0010*\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e0\r2\u0006\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001aH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010 R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006+"}, d2 = {"Lcom/fandiaspraja/core/domain/usecase/UserInteractor;", "Lcom/fandiaspraja/core/domain/usecase/UserUseCase;", "iUserRepository", "Lcom/fandiaspraja/core/domain/repository/IUserRepository;", "(Lcom/fandiaspraja/core/domain/repository/IUserRepository;)V", "deleteFollowers", "", "id", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteFollowing", "deleteUsergithubByid", "findAllUsergithub", "Lkotlinx/coroutines/flow/Flow;", "Lcom/fandiaspraja/core/data/Resource;", "", "Lcom/fandiaspraja/core/domain/model/User;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "findUsergithub", "Lcom/fandiaspraja/core/domain/model/UserDetail;", "getAllFollowers", "Lcom/fandiaspraja/core/domain/model/Followers;", "getAllFollowing", "Lcom/fandiaspraja/core/domain/model/Following;", "getDetailUser", "username", "", "token", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFollowers", "search", "page", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFollowings", "insertFollowers", "followers", "(ILjava/util/List;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insertFollowing", "following", "insertUserFavorite", "userDetail", "(Lcom/fandiaspraja/core/domain/model/UserDetail;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchUsers", "core_debug"})
public final class UserInteractor implements com.fandiaspraja.core.domain.usecase.UserUseCase {
    private final com.fandiaspraja.core.domain.repository.IUserRepository iUserRepository = null;
    
    public UserInteractor(@org.jetbrains.annotations.NotNull()
    com.fandiaspraja.core.domain.repository.IUserRepository iUserRepository) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object searchUsers(@org.jetbrains.annotations.NotNull()
    java.lang.String search, @org.jetbrains.annotations.NotNull()
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.fandiaspraja.core.data.Resource<java.util.List<com.fandiaspraja.core.domain.model.User>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getDetailUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.fandiaspraja.core.data.Resource<com.fandiaspraja.core.domain.model.UserDetail>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object findAllUsergithub(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.fandiaspraja.core.data.Resource<java.util.List<com.fandiaspraja.core.domain.model.User>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object findUsergithub(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.fandiaspraja.core.data.Resource<com.fandiaspraja.core.domain.model.UserDetail>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertUserFavorite(@org.jetbrains.annotations.NotNull()
    com.fandiaspraja.core.domain.model.UserDetail userDetail, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteUsergithubByid(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFollowers(@org.jetbrains.annotations.NotNull()
    java.lang.String search, @org.jetbrains.annotations.NotNull()
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.fandiaspraja.core.data.Resource<java.util.List<com.fandiaspraja.core.domain.model.Followers>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getFollowings(@org.jetbrains.annotations.NotNull()
    java.lang.String search, @org.jetbrains.annotations.NotNull()
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.fandiaspraja.core.data.Resource<java.util.List<com.fandiaspraja.core.domain.model.Following>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllFollowers(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.fandiaspraja.core.data.Resource<java.util.List<com.fandiaspraja.core.domain.model.Followers>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getAllFollowing(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.fandiaspraja.core.data.Resource<java.util.List<com.fandiaspraja.core.domain.model.Following>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteFollowers(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteFollowing(int id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertFollowers(int id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.fandiaspraja.core.domain.model.Followers> followers, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object insertFollowing(int id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.fandiaspraja.core.domain.model.Following> following, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}