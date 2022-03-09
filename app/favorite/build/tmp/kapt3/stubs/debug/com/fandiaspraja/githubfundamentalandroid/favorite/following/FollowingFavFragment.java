package com.fandiaspraja.githubfundamentalandroid.favorite.following;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aJ\u000e\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001dJ\u0006\u0010\u001e\u001a\u00020\u0018J\u0006\u0010\u001f\u001a\u00020\u0018J\u0012\u0010 \u001a\u00020\u00182\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J&\u0010#\u001a\u0004\u0018\u00010$2\u0006\u0010%\u001a\u00020&2\b\u0010\'\u001a\u0004\u0018\u00010(2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\u001a\u0010)\u001a\u00020\u00182\u0006\u0010*\u001a\u00020$2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00048BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR \u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016\u00a8\u0006+"}, d2 = {"Lcom/fandiaspraja/githubfundamentalandroid/favorite/following/FollowingFavFragment;", "Landroidx/fragment/app/Fragment;", "()V", "_binding", "Lcom/fandiaspraja/githubfundamentalandroid/favorite/databinding/FragmentFollowingFavBinding;", "binding", "getBinding", "()Lcom/fandiaspraja/githubfundamentalandroid/favorite/databinding/FragmentFollowingFavBinding;", "followingAdapter", "Lcom/fandiaspraja/core/ui/FollowingAdapter;", "followingFavViewModel", "Lcom/fandiaspraja/githubfundamentalandroid/favorite/following/FollowingFavViewModel;", "getFollowingFavViewModel", "()Lcom/fandiaspraja/githubfundamentalandroid/favorite/following/FollowingFavViewModel;", "followingFavViewModel$delegate", "Lkotlin/Lazy;", "followingList", "Ljava/util/ArrayList;", "Lcom/fandiaspraja/core/domain/model/Following;", "getFollowingList", "()Ljava/util/ArrayList;", "setFollowingList", "(Ljava/util/ArrayList;)V", "getAllFollowing", "", "id", "", "getFollowings", "user", "", "observeAllFollowing", "observeFollowingUser", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateView", "Landroid/view/View;", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onViewCreated", "view", "favorite_debug"})
public final class FollowingFavFragment extends androidx.fragment.app.Fragment {
    private com.fandiaspraja.githubfundamentalandroid.favorite.databinding.FragmentFollowingFavBinding _binding;
    private final kotlin.Lazy followingFavViewModel$delegate = null;
    private final com.fandiaspraja.core.ui.FollowingAdapter followingAdapter = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<com.fandiaspraja.core.domain.model.Following> followingList;
    private java.util.HashMap _$_findViewCache;
    
    public FollowingFavFragment() {
        super();
    }
    
    private final com.fandiaspraja.githubfundamentalandroid.favorite.databinding.FragmentFollowingFavBinding getBinding() {
        return null;
    }
    
    private final com.fandiaspraja.githubfundamentalandroid.favorite.following.FollowingFavViewModel getFollowingFavViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<com.fandiaspraja.core.domain.model.Following> getFollowingList() {
        return null;
    }
    
    public final void setFollowingList(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<com.fandiaspraja.core.domain.model.Following> p0) {
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
    
    public final void getFollowings(@org.jetbrains.annotations.NotNull()
    java.lang.String user) {
    }
    
    public final void observeFollowingUser() {
    }
    
    public final void getAllFollowing(int id) {
    }
    
    public final void observeAllFollowing() {
    }
}