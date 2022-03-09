package com.fandiaspraja.githubfundamentalandroid.favorite.followers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014J\u001e\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0017R \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR#\u0010\u000f\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001a"}, d2 = {"Lcom/fandiaspraja/githubfundamentalandroid/favorite/followers/FollowersFavViewModel;", "Landroidx/lifecycle/ViewModel;", "userUseCase", "Lcom/fandiaspraja/core/domain/usecase/UserUseCase;", "(Lcom/fandiaspraja/core/domain/usecase/UserUseCase;)V", "_response", "Landroidx/lifecycle/MutableLiveData;", "Lcom/fandiaspraja/core/data/Resource;", "", "Lcom/fandiaspraja/core/domain/model/Followers;", "_responseFollowersEntity", "response", "Landroidx/lifecycle/LiveData;", "getResponse", "()Landroidx/lifecycle/LiveData;", "responseFollowersEntity", "getResponseFollowersEntity", "getAllFollowers", "Lkotlinx/coroutines/Job;", "id", "", "getFollowers", "search", "", "page", "token", "favorite_debug"})
public final class FollowersFavViewModel extends androidx.lifecycle.ViewModel {
    private final com.fandiaspraja.core.domain.usecase.UserUseCase userUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.fandiaspraja.core.data.Resource<java.util.List<com.fandiaspraja.core.domain.model.Followers>>> _response = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.fandiaspraja.core.data.Resource<java.util.List<com.fandiaspraja.core.domain.model.Followers>>> response = null;
    private final androidx.lifecycle.MutableLiveData<com.fandiaspraja.core.data.Resource<java.util.List<com.fandiaspraja.core.domain.model.Followers>>> _responseFollowersEntity = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.fandiaspraja.core.data.Resource<java.util.List<com.fandiaspraja.core.domain.model.Followers>>> responseFollowersEntity = null;
    
    public FollowersFavViewModel(@org.jetbrains.annotations.NotNull()
    com.fandiaspraja.core.domain.usecase.UserUseCase userUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fandiaspraja.core.data.Resource<java.util.List<com.fandiaspraja.core.domain.model.Followers>>> getResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getFollowers(@org.jetbrains.annotations.NotNull()
    java.lang.String search, @org.jetbrains.annotations.NotNull()
    java.lang.String page, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fandiaspraja.core.data.Resource<java.util.List<com.fandiaspraja.core.domain.model.Followers>>> getResponseFollowersEntity() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getAllFollowers(int id) {
        return null;
    }
}