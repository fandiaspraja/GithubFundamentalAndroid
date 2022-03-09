package com.fandiaspraja.githubfundamentalandroid.favorite.detailfavorite;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0004J\u000e\u0010-\u001a\u00020+2\u0006\u0010.\u001a\u00020\u0016J\u0006\u0010/\u001a\u00020+J\u0006\u00100\u001a\u00020+J\u0012\u00101\u001a\u00020+2\b\u00102\u001a\u0004\u0018\u000103H\u0014J\u0010\u00104\u001a\u00020+2\u0006\u00105\u001a\u00020\u0006H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\t\u001a\u00020\n8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u000f\u001a\u00020\u0010X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0086\u000e\u00a2\u0006\u0010\n\u0002\u0010\u001b\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001c\u001a\u00020\u001dX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001c\u0010\'\u001a\u0004\u0018\u00010\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010$\"\u0004\b)\u0010&\u00a8\u00066"}, d2 = {"Lcom/fandiaspraja/githubfundamentalandroid/favorite/detailfavorite/DetailFavoriteActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "TAG", "", "USE_BUNDLED_EMOJI", "", "binding", "Lcom/fandiaspraja/githubfundamentalandroid/favorite/databinding/ActivityDetailFavoriteBinding;", "detailFavoriteViewModel", "Lcom/fandiaspraja/githubfundamentalandroid/favorite/detailfavorite/DetailFavoriteViewModel;", "getDetailFavoriteViewModel", "()Lcom/fandiaspraja/githubfundamentalandroid/favorite/detailfavorite/DetailFavoriteViewModel;", "detailFavoriteViewModel$delegate", "Lkotlin/Lazy;", "followPagerAdapter", "Lcom/fandiaspraja/core/ui/FollowPagerAdapter;", "getFollowPagerAdapter", "()Lcom/fandiaspraja/core/ui/FollowPagerAdapter;", "setFollowPagerAdapter", "(Lcom/fandiaspraja/core/ui/FollowPagerAdapter;)V", "id", "", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "preferenceUtils", "Lcom/fandiaspraja/core/utils/PreferenceUtils;", "getPreferenceUtils", "()Lcom/fandiaspraja/core/utils/PreferenceUtils;", "setPreferenceUtils", "(Lcom/fandiaspraja/core/utils/PreferenceUtils;)V", "type", "getType", "()Ljava/lang/String;", "setType", "(Ljava/lang/String;)V", "username", "getUsername", "setUsername", "getDetailFavorite", "", "user", "getDetailFavoriteOffline", "idFav", "observeDetailUser", "observeDetailUserOffline", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "setStatusFavorite", "statusFavorite", "favorite_debug"})
public final class DetailFavoriteActivity extends androidx.appcompat.app.AppCompatActivity {
    private final java.lang.String TAG = "DetailFavoriteActivity";
    private final boolean USE_BUNDLED_EMOJI = true;
    private final kotlin.Lazy detailFavoriteViewModel$delegate = null;
    private com.fandiaspraja.githubfundamentalandroid.favorite.databinding.ActivityDetailFavoriteBinding binding;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String username;
    @org.jetbrains.annotations.Nullable()
    private java.lang.String type;
    @org.jetbrains.annotations.Nullable()
    private java.lang.Integer id;
    public com.fandiaspraja.core.utils.PreferenceUtils preferenceUtils;
    public com.fandiaspraja.core.ui.FollowPagerAdapter followPagerAdapter;
    private java.util.HashMap _$_findViewCache;
    
    public DetailFavoriteActivity() {
        super();
    }
    
    private final com.fandiaspraja.githubfundamentalandroid.favorite.detailfavorite.DetailFavoriteViewModel getDetailFavoriteViewModel() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUsername() {
        return null;
    }
    
    public final void setUsername(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    public final void setType(@org.jetbrains.annotations.Nullable()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.Nullable()
    java.lang.Integer p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fandiaspraja.core.utils.PreferenceUtils getPreferenceUtils() {
        return null;
    }
    
    public final void setPreferenceUtils(@org.jetbrains.annotations.NotNull()
    com.fandiaspraja.core.utils.PreferenceUtils p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fandiaspraja.core.ui.FollowPagerAdapter getFollowPagerAdapter() {
        return null;
    }
    
    public final void setFollowPagerAdapter(@org.jetbrains.annotations.NotNull()
    com.fandiaspraja.core.ui.FollowPagerAdapter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void getDetailFavoriteOffline(int idFav) {
    }
    
    public final void observeDetailUserOffline() {
    }
    
    public final void getDetailFavorite(@org.jetbrains.annotations.NotNull()
    java.lang.String user) {
    }
    
    public final void observeDetailUser() {
    }
    
    private final void setStatusFavorite(boolean statusFavorite) {
    }
}