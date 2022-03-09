package com.fandiaspraja.core.data.remote.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b4\b\u0086\b\u0018\u00002\u00020\u0001B\u009d\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003\u0012\u0006\u0010\u0010\u001a\u00020\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0003\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0003\u0012\u0006\u0010\u0017\u001a\u00020\u0003\u0012\u0006\u0010\u0018\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0019J\t\u00101\u001a\u00020\u0003H\u00c6\u0003J\t\u00102\u001a\u00020\rH\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\u0003H\u00c6\u0003J\t\u00105\u001a\u00020\u0003H\u00c6\u0003J\t\u00106\u001a\u00020\u0003H\u00c6\u0003J\t\u00107\u001a\u00020\u0013H\u00c6\u0003J\t\u00108\u001a\u00020\u0015H\u00c6\u0003J\t\u00109\u001a\u00020\u0003H\u00c6\u0003J\t\u0010:\u001a\u00020\u0003H\u00c6\u0003J\t\u0010;\u001a\u00020\u0003H\u00c6\u0003J\t\u0010<\u001a\u00020\u0003H\u00c6\u0003J\t\u0010=\u001a\u00020\u0003H\u00c6\u0003J\t\u0010>\u001a\u00020\u0003H\u00c6\u0003J\t\u0010?\u001a\u00020\u0003H\u00c6\u0003J\t\u0010@\u001a\u00020\u0003H\u00c6\u0003J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0003H\u00c6\u0003J\u00c7\u0001\u0010D\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u00032\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u00032\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00032\b\b\u0002\u0010\u000f\u001a\u00020\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00032\b\b\u0002\u0010\u0012\u001a\u00020\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00032\b\b\u0002\u0010\u0017\u001a\u00020\u00032\b\b\u0002\u0010\u0018\u001a\u00020\u0003H\u00c6\u0001J\u0013\u0010E\u001a\u00020\u00132\b\u0010F\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010G\u001a\u00020\u0015H\u00d6\u0001J\t\u0010H\u001a\u00020\u0003H\u00d6\u0001R\u0016\u0010\u000f\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0010\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0016\u0010\b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001bR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u001bR\u0016\u0010\u0016\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b \u0010\u001bR\u0016\u0010\u0011\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b!\u0010\u001bR\u0016\u0010\u0014\u001a\u00020\u00158\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b$\u0010\u001bR\u0016\u0010\u0017\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b%\u0010\u001bR\u0016\u0010\u0018\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b&\u0010\u001bR\u0016\u0010\u000e\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\'\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b(\u0010\u001bR\u0016\u0010\f\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0016\u0010\u0012\u001a\u00020\u00138\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b+\u0010,R\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b-\u0010\u001bR\u0016\u0010\u000b\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b.\u0010\u001bR\u0016\u0010\t\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b/\u0010\u001bR\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b0\u0010\u001b\u00a8\u0006I"}, d2 = {"Lcom/fandiaspraja/core/data/remote/response/UserResponse;", "", "gistsUrl", "", "reposUrl", "followingUrl", "starredUrl", "login", "followersUrl", "type", "url", "subscriptionsUrl", "score", "", "receivedEventsUrl", "avatarUrl", "eventsUrl", "htmlUrl", "siteAdmin", "", "id", "", "gravatarId", "nodeId", "organizationsUrl", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;DLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAvatarUrl", "()Ljava/lang/String;", "getEventsUrl", "getFollowersUrl", "getFollowingUrl", "getGistsUrl", "getGravatarId", "getHtmlUrl", "getId", "()I", "getLogin", "getNodeId", "getOrganizationsUrl", "getReceivedEventsUrl", "getReposUrl", "getScore", "()D", "getSiteAdmin", "()Z", "getStarredUrl", "getSubscriptionsUrl", "getType", "getUrl", "component1", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "other", "hashCode", "toString", "core_debug"})
public final class UserResponse {
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "gists_url")
    private final java.lang.String gistsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "repos_url")
    private final java.lang.String reposUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "following_url")
    private final java.lang.String followingUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "starred_url")
    private final java.lang.String starredUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "login")
    private final java.lang.String login = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "followers_url")
    private final java.lang.String followersUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "type")
    private final java.lang.String type = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "url")
    private final java.lang.String url = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "subscriptions_url")
    private final java.lang.String subscriptionsUrl = null;
    @com.google.gson.annotations.SerializedName(value = "score")
    private final double score = 0.0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "received_events_url")
    private final java.lang.String receivedEventsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "avatar_url")
    private final java.lang.String avatarUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "events_url")
    private final java.lang.String eventsUrl = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "html_url")
    private final java.lang.String htmlUrl = null;
    @com.google.gson.annotations.SerializedName(value = "site_admin")
    private final boolean siteAdmin = false;
    @com.google.gson.annotations.SerializedName(value = "id")
    private final int id = 0;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "gravatar_id")
    private final java.lang.String gravatarId = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "node_id")
    private final java.lang.String nodeId = null;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "organizations_url")
    private final java.lang.String organizationsUrl = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fandiaspraja.core.data.remote.response.UserResponse copy(@org.jetbrains.annotations.NotNull()
    java.lang.String gistsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String reposUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String followingUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String starredUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String followersUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String subscriptionsUrl, double score, @org.jetbrains.annotations.NotNull()
    java.lang.String receivedEventsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String avatarUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String eventsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String htmlUrl, boolean siteAdmin, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String gravatarId, @org.jetbrains.annotations.NotNull()
    java.lang.String nodeId, @org.jetbrains.annotations.NotNull()
    java.lang.String organizationsUrl) {
        return null;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    public UserResponse(@org.jetbrains.annotations.NotNull()
    java.lang.String gistsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String reposUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String followingUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String starredUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String login, @org.jetbrains.annotations.NotNull()
    java.lang.String followersUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String url, @org.jetbrains.annotations.NotNull()
    java.lang.String subscriptionsUrl, double score, @org.jetbrains.annotations.NotNull()
    java.lang.String receivedEventsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String avatarUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String eventsUrl, @org.jetbrains.annotations.NotNull()
    java.lang.String htmlUrl, boolean siteAdmin, int id, @org.jetbrains.annotations.NotNull()
    java.lang.String gravatarId, @org.jetbrains.annotations.NotNull()
    java.lang.String nodeId, @org.jetbrains.annotations.NotNull()
    java.lang.String organizationsUrl) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGistsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReposUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFollowingUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getStarredUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component5() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLogin() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFollowersUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getType() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component8() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubscriptionsUrl() {
        return null;
    }
    
    public final double component10() {
        return 0.0;
    }
    
    public final double getScore() {
        return 0.0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getReceivedEventsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component12() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAvatarUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component13() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEventsUrl() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component14() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getHtmlUrl() {
        return null;
    }
    
    public final boolean component15() {
        return false;
    }
    
    public final boolean getSiteAdmin() {
        return false;
    }
    
    public final int component16() {
        return 0;
    }
    
    public final int getId() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component17() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGravatarId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component18() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNodeId() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component19() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getOrganizationsUrl() {
        return null;
    }
}