package com.fandiaspraja.core.data.remote.response;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J-\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00d6\u0001J\t\u0010\u0017\u001a\u00020\u0018H\u00d6\u0001R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001c\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0019"}, d2 = {"Lcom/fandiaspraja/core/data/remote/response/SearchResponse;", "", "totalCount", "", "incompleteResults", "", "items", "", "Lcom/fandiaspraja/core/data/remote/response/UserResponse;", "(IZLjava/util/List;)V", "getIncompleteResults", "()Z", "getItems", "()Ljava/util/List;", "getTotalCount", "()I", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "toString", "", "core_debug"})
public final class SearchResponse {
    @com.google.gson.annotations.SerializedName(value = "total_count")
    private final int totalCount = 0;
    @com.google.gson.annotations.SerializedName(value = "incomplete_results")
    private final boolean incompleteResults = false;
    @org.jetbrains.annotations.NotNull()
    @com.google.gson.annotations.SerializedName(value = "items")
    private final java.util.List<com.fandiaspraja.core.data.remote.response.UserResponse> items = null;
    
    @org.jetbrains.annotations.NotNull()
    public final com.fandiaspraja.core.data.remote.response.SearchResponse copy(int totalCount, boolean incompleteResults, @org.jetbrains.annotations.NotNull()
    java.util.List<com.fandiaspraja.core.data.remote.response.UserResponse> items) {
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
    
    public SearchResponse(int totalCount, boolean incompleteResults, @org.jetbrains.annotations.NotNull()
    java.util.List<com.fandiaspraja.core.data.remote.response.UserResponse> items) {
        super();
    }
    
    public final int component1() {
        return 0;
    }
    
    public final int getTotalCount() {
        return 0;
    }
    
    public final boolean component2() {
        return false;
    }
    
    public final boolean getIncompleteResults() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fandiaspraja.core.data.remote.response.UserResponse> component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fandiaspraja.core.data.remote.response.UserResponse> getItems() {
        return null;
    }
}