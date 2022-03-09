package com.fandiaspraja.githubfundamentalandroid.favorite.favoritelist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u000e\u001a\u00020\u000fR \u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R#\u0010\n\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00070\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/fandiaspraja/githubfundamentalandroid/favorite/favoritelist/FavoriteViewModel;", "Landroidx/lifecycle/ViewModel;", "userUseCase", "Lcom/fandiaspraja/core/domain/usecase/UserUseCase;", "(Lcom/fandiaspraja/core/domain/usecase/UserUseCase;)V", "_response", "Landroidx/lifecycle/MutableLiveData;", "Lcom/fandiaspraja/core/data/Resource;", "", "Lcom/fandiaspraja/core/domain/model/User;", "response", "Landroidx/lifecycle/LiveData;", "getResponse", "()Landroidx/lifecycle/LiveData;", "findAllUsergithub", "Lkotlinx/coroutines/Job;", "favorite_debug"})
public final class FavoriteViewModel extends androidx.lifecycle.ViewModel {
    private final com.fandiaspraja.core.domain.usecase.UserUseCase userUseCase = null;
    private final androidx.lifecycle.MutableLiveData<com.fandiaspraja.core.data.Resource<java.util.List<com.fandiaspraja.core.domain.model.User>>> _response = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.LiveData<com.fandiaspraja.core.data.Resource<java.util.List<com.fandiaspraja.core.domain.model.User>>> response = null;
    
    public FavoriteViewModel(@org.jetbrains.annotations.NotNull()
    com.fandiaspraja.core.domain.usecase.UserUseCase userUseCase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.fandiaspraja.core.data.Resource<java.util.List<com.fandiaspraja.core.domain.model.User>>> getResponse() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job findAllUsergithub() {
        return null;
    }
}