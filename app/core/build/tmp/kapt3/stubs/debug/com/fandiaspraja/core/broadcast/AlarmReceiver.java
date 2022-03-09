package com.fandiaspraja.core.broadcast;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u0005\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\nJ\u0018\u0010\u000b\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002J\u0018\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J.\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nJ&\u0010\u0014\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nJ(\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\"\u0010\u0019\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0016\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0002\u00a8\u0006\u001b"}, d2 = {"Lcom/fandiaspraja/core/broadcast/AlarmReceiver;", "Landroid/content/BroadcastReceiver;", "()V", "deleteRepeatingAlarm", "", "context", "Landroid/content/Context;", "isAlarmSet", "", "type", "", "isDateInvalid", "date", "format", "onReceive", "intent", "Landroid/content/Intent;", "setOneTimeAlarm", "time", "message", "setRepeatingAlarm", "showAlarmNotification", "title", "notifId", "", "showToast", "Companion", "core_debug"})
public final class AlarmReceiver extends android.content.BroadcastReceiver {
    @org.jetbrains.annotations.NotNull()
    public static final com.fandiaspraja.core.broadcast.AlarmReceiver.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_ONE_TIME = "OneTimeAlarm";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TYPE_REPEATING = "Github App";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_MESSAGE = "message";
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String EXTRA_TYPE = "type";
    private static final int ID_ONETIME = 100;
    private static final int ID_REPEATING = 101;
    private static final java.lang.String DATE_FORMAT = "yyyy-MM-dd";
    private static final java.lang.String TIME_FORMAT = "HH:mm";
    
    public AlarmReceiver() {
        super();
    }
    
    @java.lang.Override()
    public void onReceive(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    android.content.Intent intent) {
    }
    
    private final void showToast(android.content.Context context, java.lang.String title, java.lang.String message) {
    }
    
    private final void showAlarmNotification(android.content.Context context, java.lang.String title, java.lang.String message, int notifId) {
    }
    
    public final void setOneTimeAlarm(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final void deleteRepeatingAlarm(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
    }
    
    public final void setRepeatingAlarm(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String type, @org.jetbrains.annotations.NotNull()
    java.lang.String time, @org.jetbrains.annotations.NotNull()
    java.lang.String message) {
    }
    
    public final boolean isAlarmSet(@org.jetbrains.annotations.NotNull()
    android.content.Context context, @org.jetbrains.annotations.NotNull()
    java.lang.String type) {
        return false;
    }
    
    private final boolean isDateInvalid(java.lang.String date, java.lang.String format) {
        return false;
    }
    
    @kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\r"}, d2 = {"Lcom/fandiaspraja/core/broadcast/AlarmReceiver$Companion;", "", "()V", "DATE_FORMAT", "", "EXTRA_MESSAGE", "EXTRA_TYPE", "ID_ONETIME", "", "ID_REPEATING", "TIME_FORMAT", "TYPE_ONE_TIME", "TYPE_REPEATING", "core_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}