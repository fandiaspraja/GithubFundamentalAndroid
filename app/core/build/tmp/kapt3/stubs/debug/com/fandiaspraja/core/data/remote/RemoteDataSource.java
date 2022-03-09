package com.fandiaspraja.core.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J-\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ;\u0010\r\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\u00070\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J;\u0010\u0013\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\u000e0\u00070\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J;\u0010\u0015\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u000e0\u00070\u00062\u0006\u0010\u0010\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0017"}, d2 = {"Lcom/fandiaspraja/core/data/remote/RemoteDataSource;", "", "apiService", "Lcom/fandiaspraja/core/data/remote/network/ApiService;", "(Lcom/fandiaspraja/core/data/remote/network/ApiService;)V", "getDetailUser", "Lkotlinx/coroutines/flow/Flow;", "Lcom/fandiaspraja/core/data/remote/network/ApiResponse;", "Lcom/fandiaspraja/core/data/remote/response/DetailResponse;", "username", "", "token", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFollowers", "", "Lcom/fandiaspraja/core/data/remote/response/DataFollowersResponse;", "search", "page", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFollowings", "Lcom/fandiaspraja/core/data/remote/response/DataFollowingResponse;", "searchUsers", "Lcom/fandiaspraja/core/data/remote/response/UserResponse;", "core_debug"})
public final class RemoteDataSource {
    private final com.fandiaspraja.core.data.remote.network.ApiService apiService = null;
    
    public RemoteDataSource(@org.jetbrains.annotations.NotNull()
    com.fandiaspraja.core.data.remote.network.ApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object searchUsers(@org.jetbrains.annotations.NotNull()
    java.lang.String search, @org.jetbrains.annotations.NotNull()
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.fandiaspraja.core.data.remote.network.ApiResponse<? extends java.util.List<com.fandiaspraja.core.data.remote.response.UserResponse>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getDetailUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.fandiaspraja.core.data.remote.network.ApiResponse<com.fandiaspraja.core.data.remote.response.DetailResponse>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFollowers(@org.jetbrains.annotations.NotNull()
    java.lang.String search, @org.jetbrains.annotations.NotNull()
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.fandiaspraja.core.data.remote.network.ApiResponse<? extends java.util.List<com.fandiaspraja.core.data.remote.response.DataFollowersResponse>>>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object getFollowings(@org.jetbrains.annotations.NotNull()
    java.lang.String search, @org.jetbrains.annotations.NotNull()
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends com.fandiaspraja.core.data.remote.network.ApiResponse<? extends java.util.List<com.fandiaspraja.core.data.remote.response.DataFollowingResponse>>>> continuation) {
        return null;
    }
}