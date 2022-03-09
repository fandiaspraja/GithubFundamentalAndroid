package com.fandiaspraja.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u0016J\u000e\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0006J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0017\u001a\u00020\u0006J\u0006\u0010\u001c\u001a\u00020\u0014J\u000e\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0006J\u0016\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u0016J\u0016\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010 \u001a\u00020\u001aJ\u0016\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00062\u0006\u0010!\u001a\u00020\u0006R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012\u00a8\u0006\""}, d2 = {"Lcom/fandiaspraja/core/utils/PreferenceUtils;", "", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "GITHUB_CONFIG", "", "getGITHUB_CONFIG", "()Ljava/lang/String;", "getContext", "()Landroid/content/Context;", "editor", "Landroid/content/SharedPreferences$Editor;", "getEditor", "()Landroid/content/SharedPreferences$Editor;", "sharedPref", "Landroid/content/SharedPreferences;", "getSharedPref", "()Landroid/content/SharedPreferences;", "clearSharedPreference", "", "getValueBoolean", "", "KEY_NAME", "defaultValue", "getValueInt", "", "getValueString", "removeUser", "removeValue", "save", "status", "value", "text", "core_debug"})
public final class PreferenceUtils {
    @org.jetbrains.annotations.Nullable()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String GITHUB_CONFIG = "zat_config";
    @org.jetbrains.annotations.Nullable()
    private final android.content.SharedPreferences sharedPref = null;
    @org.jetbrains.annotations.Nullable()
    private final android.content.SharedPreferences.Editor editor = null;
    
    public PreferenceUtils(@org.jetbrains.annotations.Nullable()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGITHUB_CONFIG() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.SharedPreferences getSharedPref() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.content.SharedPreferences.Editor getEditor() {
        return null;
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    java.lang.String KEY_NAME, @org.jetbrains.annotations.NotNull()
    java.lang.String text) {
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    java.lang.String KEY_NAME, int value) {
    }
    
    public final void save(@org.jetbrains.annotations.NotNull()
    java.lang.String KEY_NAME, boolean status) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.String getValueString(@org.jetbrains.annotations.NotNull()
    java.lang.String KEY_NAME) {
        return null;
    }
    
    public final int getValueInt(@org.jetbrains.annotations.NotNull()
    java.lang.String KEY_NAME) {
        return 0;
    }
    
    public final boolean getValueBoolean(@org.jetbrains.annotations.NotNull()
    java.lang.String KEY_NAME, boolean defaultValue) {
        return false;
    }
    
    public final void removeUser() {
    }
    
    public final void clearSharedPreference() {
    }
    
    public final void removeValue(@org.jetbrains.annotations.NotNull()
    java.lang.String KEY_NAME) {
    }
}