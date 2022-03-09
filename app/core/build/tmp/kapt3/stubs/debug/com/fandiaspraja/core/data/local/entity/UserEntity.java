package com.fandiaspraja.core.data.local.entity;

import java.lang.System;

@androidx.room.Entity(tableName = "user")
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b>\b\u0007\u0018\u00002\u00020\u0001B\u008b\u0003\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010%\u001a\u00020\u000f\u00a2\u0006\u0002\u0010&R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010(R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010(R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b*\u0010(R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010(R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b,\u0010(R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010(R\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010(R\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b/\u00100R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b2\u0010(R\u0015\u0010!\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\b3\u00100R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b4\u0010(R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b5\u0010(R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b6\u0010(R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b7\u0010(R\u0013\u0010 \u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b8\u0010(R\u0016\u0010\u0011\u001a\u00020\u00128\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b9\u0010:R\u001a\u0010%\u001a\u00020\u000fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010;\"\u0004\b<\u0010=R\u0013\u0010#\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b>\u0010(R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b?\u0010(R\u0013\u0010\"\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b@\u0010(R\u0013\u0010$\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bA\u0010(R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bB\u0010(R\u0015\u0010\u001a\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\bC\u00100R\u0015\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\n\n\u0002\u00101\u001a\u0004\bD\u00100R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bE\u0010(R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bF\u0010(R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010I\u001a\u0004\bG\u0010HR\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bJ\u0010(R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bK\u0010(R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bL\u0010(R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bM\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bN\u0010(R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\bO\u0010(\u00a8\u0006P"}, d2 = {"Lcom/fandiaspraja/core/data/local/entity/UserEntity;", "Ljava/io/Serializable;", "gists_url", "", "repos_url", "following_url", "twitter_username", "bio", "created_at", "login", "type", "blog", "subscriptions_url", "update_at", "site_admin", "", "company", "id", "", "public_repos", "gravatar_id", "email", "organizations_url", "hireable", "starred_url", "followers_url", "public_gists", "url", "received_events_url", "followers", "avatar_url", "events_url", "html_url", "following", "name", "location", "node_id", "isFav", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getAvatar_url", "()Ljava/lang/String;", "getBio", "getBlog", "getCompany", "getCreated_at", "getEmail", "getEvents_url", "getFollowers", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getFollowers_url", "getFollowing", "getFollowing_url", "getGists_url", "getGravatar_id", "getHireable", "getHtml_url", "getId", "()I", "()Z", "setFav", "(Z)V", "getLocation", "getLogin", "getName", "getNode_id", "getOrganizations_url", "getPublic_gists", "getPublic_repos", "getReceived_events_url", "getRepos_url", "getSite_admin", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getStarred_url", "getSubscriptions_url", "getTwitter_username", "getType", "getUpdate_at", "getUrl", "core_debug"})
public final class UserEntity implements java.io.Serializable {
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String gists_url = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String repos_url = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String following_url = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String twitter_username = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String bio = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String created_at = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String login = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String type = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String blog = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String subscriptions_url = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String update_at = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Boolean site_admin = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String company = null;
    @androidx.room.PrimaryKey(autoGenerate = false)
    private final int id = 0;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer public_repos = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String gravatar_id = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String email = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String organizations_url = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String hireable = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String starred_url = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String followers_url = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer public_gists = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String url = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String received_events_url = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer followers = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String avatar_url = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String events_url = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String html_url = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.Integer following = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String name = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String location = null;
    @org.jetbrains.annotations.Nullable()
    private final java.lang.String node_id = null;
    private boolean isFav;
    
    public UserEntity(@org.jetbrains.annotations.Nullable()
    java.lang.String gists_url, @org.jetbrains.annotations.Nullable()
    java.lang.String repos_url, @org.jetbrains.annotations.Nullable()
    java.lang.String following_url, @org.jetbrains.annotations.Nullable()
    java.lang.String twitter_username, @org.jetbrains.annotations.Nullable()
    java.lang.String bio, @org.jetbrains.annotations.Nullable()
    java.lang.String created_at, @org.jetbrains.annotations.Nullable()
    java.lang.String login, @org.jetbrains.annotations.Nullable()
    java.lang.String type, @org.jetbrains.annotations.Nullable()
    java.lang.String blog, @org.jetbrains.annotations.Nullable()
    java.lang.String subscriptions_url, @org.jetbrains.annotations.Nullable()
    java.lang.String update_at, @org.jetbrains.annotations.Nullable()
    java.lang.Boolean site_admin, @org.jetbrains.annotations.Nullable()
    java.lang.String company, int id, @org.jetbrains.annotations.Nullable()
    java.lang.Integer public_repos, @org.jetbrains.annotations.Nullable()
    java.lang.String gravatar_id, @org.jetbrains.annotations.Nullable()
    java.lang.String email, @org.jetbrains.annotations.Nullable()
    java.lang.String organizations_url, @org.jetbrains.annotations.Nullable()
    java.lang.String hireable, @org.jetbrains.annotations.Nullable()
    java.lang.String starred_url, @org.jetbrains.annotations.Nullable()
    java.lang.String followers_url, @org.jetbrains.annotations.Nullable()
    java.lang.Integer public_gists, @org.jetbrains.annotations.Nullable()
    java.lang.String url, @org.jetbrains.annotations.Nullable()
    java.lang.String received_events_url, @org.jetbrains.annotations.Nullable()
    java.lang.Integer followers, @org.jetbrains.annotations.Nullable()
    java.lang.String avatar_url, @org.jetbrains.annotations.Nullable()
    java.lang.String events_url, @org.jetbrains.annotations.Nullable()
    java.lang.String html_url, @org.jetbrains.annotations.Nullable()
    java.lang.Integer following, @org.jetbrains.annotations.Nullable()
    java.lang.String name, @org.jetbrains.annotations.Nullable()
    java.lang.String location, @org.jetbrains.annotations.Nullable()
    java.lang.String node_id, boolean isFav) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGists_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getRepos_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFollowing_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getTwitter_username() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBio() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCreated_at() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getBlog() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getSubscriptions_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUpdate_at() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Boolean getSite_admin() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getCompany() {
        return null;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPublic_repos() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getGravatar_id() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEmail() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getOrganizations_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHireable() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getStarred_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getFollowers_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getPublic_gists() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getReceived_events_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFollowers() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getAvatar_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getEvents_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getHtml_url() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Integer getFollowing() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getName() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getLocation() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getNode_id() {
        return null;
    }
    
    public final boolean isFav() {
        return false;
    }
    
    public final void setFav(boolean p0) {
    }
}