package com.fandiaspraja.githubfundamentalandroid.favorite.detailfavorite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0014\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0016\u0010\u0017\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019J\u001c\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001dJ\u001c\u0010\u001f\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\f\u0010 \u001a\b\u0012\u0004\u0012\u00020!0\u001dJ\u000e\u0010\"\u001a\u00020\u00112\u0006\u0010#\u001a\u00020\bR\u001a\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001d\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006$"}, d2 = {"Lcom/fandiaspraja/githubfundamentalandroid/favorite/detailfavorite/DetailFavoriteViewModel;", "Landroidx/lifecycle/ViewModel;", "userUseCase", "Lcom/fandiaspraja/core/domain/usecase/UserUseCase;", "(Lcom/fandiaspraja/core/domain/usecase/UserUseCase;)V", "_response", "Landroidx/lifecycle/MutableLiveData;", "Lcom/fandiaspraja/core/data/Resource;", "Lcom/fandiaspraja/core/domain/model/UserDetail;", "_responseFavorite", "response", "Landroidx/lifecycle/LiveData;", "getResponse", "()Landroidx/lifecycle/LiveData;", "responseFavorite", "getResponseFavorite", "deleteFollowers", "Lkotlinx/coroutines/Job;", "id", "", "deleteFollowings", "deleteUsergithubByid", "findUsergithub", "getDetailUser", "username", "", "token", "insertFollowers", "followers", "", "Lcom/fandiaspraja/core/domain/model/Followers;", "insertFollowing", "followings", "Lcom/fandiaspraja/core/domain/model/Following;", "insertUserFavorite", "userDetail", "favorite_debug"})
public final class DetailFavoriteViewModel extends androidx.lifecycle.ViewModel {
    private final com.fandiaspraja.core.domain.usecase.UserUseCase userUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.fandiaspraja.core.data.Resource<com.fandiaspraja.core.domain.model.UserDetail>> _response = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.fandiaspraja.core.data.Resource<com.fandiaspraja.core.domain.model.UserDetail>> response = null;
    private final androidx.lifecycle.MutableLiveData<com.fandiaspraja.core.data.Resource<com.fandiaspraja.core.domain.model.UserDetail>> _responseFavorite = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.fandiaspraja.core.data.Resource<com.fandiaspraja.core.domain.model.UserDetail>> responseFavorite = null;
    
    public DetailFavoriteViewModel(@org.jetbrains.annotations.NotNull()
    com.fandiaspraja.core.domain.usecase.UserUseCase userUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fandiaspraja.core.data.Resource<com.fandiaspraja.core.domain.model.UserDetail>> getResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getDetailUser(@org.jetbrains.annotations.NotNull()
    java.lang.String username, @org.jetbrains.annotations.NotNull()
    java.lang.String token) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fandiaspraja.core.data.Resource<com.fandiaspraja.core.domain.model.UserDetail>> getResponseFavorite() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job findUsergithub(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertUserFavorite(@org.jetbrains.annotations.NotNull()
    com.fandiaspraja.core.domain.model.UserDetail userDetail) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteUsergithubByid(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertFollowers(int id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.fandiaspraja.core.domain.model.Followers> followers) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteFollowers(int id) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job insertFollowing(int id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.fandiaspraja.core.domain.model.Following> followings) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job deleteFollowings(int id) {
        return null;
    }
}