package com.fandiaspraja.core.data.remote.network;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J%\u0010\u0002\u001a\u00020\u00032\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0007J5\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ5\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\t2\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ/\u0010\u000f\u001a\u00020\u00102\b\b\u0001\u0010\u0004\u001a\u00020\u00052\b\b\u0001\u0010\u000b\u001a\u00020\u00052\b\b\u0001\u0010\u0006\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\f\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0011"}, d2 = {"Lcom/fandiaspraja/core/data/remote/network/ApiService;", "", "getDetailUser", "Lcom/fandiaspraja/core/data/remote/response/DetailResponse;", "username", "", "token", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFollowers", "", "Lcom/fandiaspraja/core/data/remote/response/DataFollowersResponse;", "page", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFollowings", "Lcom/fandiaspraja/core/data/remote/response/DataFollowingResponse;", "searchUsers", "Lcom/fandiaspraja/core/data/remote/response/SearchResponse;", "core_debug"})
public abstract interface ApiService {
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "search/users")
    public abstract java.lang.Object searchUsers(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "q")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "page")
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fandiaspraja.core.data.remote.response.SearchResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users/{username}")
    public abstract java.lang.Object getDetailUser(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.fandiaspraja.core.data.remote.response.DetailResponse> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users/{username}/followers")
    public abstract java.lang.Object getFollowers(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "page")
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.fandiaspraja.core.data.remote.response.DataFollowersResponse>> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @retrofit2.http.GET(value = "users/{username}/following")
    public abstract java.lang.Object getFollowings(@org.jetbrains.annotations.NotNull()
    @retrofit2.http.Path(value = "username")
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Query(value = "page")
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    @retrofit2.http.Header(value = "Authorization")
    java.lang.String token, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.fandiaspraja.core.data.remote.response.DataFollowingResponse>> continuation);
}