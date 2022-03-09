package com.fandiaspraja.githubfundamentalandroid.favorite.followers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001cJ\u000e\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001e\u001a\u00020\u001fJ\u0006\u0010 \u001a\u00020\u001aJ\u0006\u0010!\u001a\u00020\u001aJ\u0012\u0010\"\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J&\u0010%\u001a\u0004\u0018\u00010&2\u0006\u0010\'\u001a\u00020(2\b\u0010)\u001a\u0004\u0018\u00010*2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u001a\u0010+\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020&2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018\u00a8\u0006-"}, d2 = {"Lcom/fandiaspraja/githubfundamentalandroid/favorite/followers/FollowersFavFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/fandiaspraja/githubfundamentalandroid/favorite/databinding/FragmentFollowersFavBinding;", "binding", "getBinding", "()Lcom/fandiaspraja/githubfundamentalandroid/favorite/databinding/FragmentFollowersFavBinding;", "followersAdapter", "Lcom/fandiaspraja/core/ui/FollowersAdapter;", "getFollowersAdapter", "()Lcom/fandiaspraja/core/ui/FollowersAdapter;", "followersFavViewModel", "Lcom/fandiaspraja/githubfundamentalandroid/favorite/followers/FollowersFavViewModel;", "getFollowersFavViewModel", "()Lcom/fandiaspraja/githubfundamentalandroid/favorite/followers/FollowersFavViewModel;", "followersFavViewModel$delegate", "Lkotlin/Lazy;", "followersList", "Ljava/util/ArrayList;", "Lcom/fandiaspraja/core/domain/model/Followers;", "getFollowersList", "()Ljava/util/ArrayList;", "setFollowersList", "(Ljava/util/ArrayList;)V", "getAllFollowers", "", "id", "", "getFollowers", "user", "", "observeFollowersUser", "observegetAllFollowers", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "favorite_debug"})
public final class FollowersFavFragment extends androidx.fragment.app.Fragment {
    private com.fandiaspraja.githubfundamentalandroid.favorite.databinding.FragmentFollowersFavBinding _binding;
    private final kotlin.Lazy followersFavViewModel$delegate = null;
    @org.jetbrains.annotations.NotNull()
    private final com.fandiaspraja.core.ui.FollowersAdapter followersAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.fandiaspraja.core.domain.model.Followers> followersList;
    private java.util.HashMap _$_findViewCache;
    
    public FollowersFavFragment() {
        super();
    }
    
    private final com.fandiaspraja.githubfundamentalandroid.favorite.databinding.FragmentFollowersFavBinding getBinding() {
        return null;
    }
    
    private final com.fandiaspraja.githubfundamentalandroid.favorite.followers.FollowersFavViewModel getFollowersFavViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fandiaspraja.core.ui.FollowersAdapter getFollowersAdapter() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fandiaspraja.core.domain.model.Followers> getFollowersList() {
        return null;
    }
    
    public final void setFollowersList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fandiaspraja.core.domain.model.Followers> p0) {
    }
    
    @java.lang.Override()
    public void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public android.view.View onCreateView(@org.jetbrains.annotations.NotNull()
    android.view.LayoutInflater inflater, @org.jetbrains.annotations.Nullable()
    android.view.ViewGroup container, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void getFollowers(@org.jetbrains.annotations.NotNull()
    java.lang.String user) {
    }
    
    public final void observeFollowersUser() {
    }
    
    public final void getAllFollowers(int id) {
    }
    
    public final void observegetAllFollowers() {
    }
}