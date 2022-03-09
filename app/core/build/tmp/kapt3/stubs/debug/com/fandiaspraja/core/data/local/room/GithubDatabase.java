package com.fandiaspraja.core.data.local.room;

import java.lang.System;

@androidx.room.Database(entities = {com.fandiaspraja.core.data.local.entity.UserEntity.class, com.fandiaspraja.core.data.local.entity.FollowersEntity.class, com.fandiaspraja.core.data.local.entity.FollowingEntity.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/fandiaspraja/core/data/local/room/GithubDatabase;", "Landroidx/room/RoomDatabase;", "()V", "githubDao", "Lcom/fandiaspraja/core/data/local/room/GithubDao;", "core_debug"})
public abstract class GithubDatabase extends androidx.room.RoomDatabase {
    
    public GithubDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.fandiaspraja.core.data.local.room.GithubDao githubDao();
}