package com.fandiaspraja.core.utils;

import java.lang.System;

@kotlin.Metadata(mv = {1, 6, 0}, k = 1, d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\"\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0004J\"\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00042\u0006\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\f0\u0004J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u000fJ\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004J\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004J\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00130\u0004J\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\f0\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00150\u0004J\u000e\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u0017J\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0004J\u000e\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\b\u001a\u00020\u000eJ\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00190\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0004\u00a8\u0006\u001d"}, d2 = {"Lcom/fandiaspraja/core/utils/DataMapper;", "", "()V", "mapDomainToFollowersEntity", "", "Lcom/fandiaspraja/core/data/local/entity/FollowersEntity;", "id", "", "it", "Lcom/fandiaspraja/core/domain/model/Followers;", "mapDomainToFollowingEntity", "Lcom/fandiaspraja/core/data/local/entity/FollowingEntity;", "Lcom/fandiaspraja/core/domain/model/Following;", "mapDomainToUserDetailEntity", "Lcom/fandiaspraja/core/data/local/entity/UserEntity;", "Lcom/fandiaspraja/core/domain/model/UserDetail;", "mapFollowersEntityToDomain", "mapFollowingEntityToDomain", "mapResponseFollowersToDomain", "Lcom/fandiaspraja/core/data/remote/response/DataFollowersResponse;", "mapResponseFollowingToDomain", "Lcom/fandiaspraja/core/data/remote/response/DataFollowingResponse;", "mapResponseUserDetailToDomain", "Lcom/fandiaspraja/core/data/remote/response/DetailResponse;", "mapResponseUserToDomain", "Lcom/fandiaspraja/core/domain/model/User;", "Lcom/fandiaspraja/core/data/remote/response/UserResponse;", "mapUserDetailEntityToDomain", "mapUserEntityToDomain", "core_debug"})
public final class DataMapper {
    @org.jetbrains.annotations.NotNull()
    public static final com.fandiaspraja.core.utils.DataMapper INSTANCE = null;
    
    private DataMapper() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fandiaspraja.core.domain.model.User> mapResponseUserToDomain(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fandiaspraja.core.data.remote.response.UserResponse> it) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fandiaspraja.core.domain.model.UserDetail mapResponseUserDetailToDomain(@org.jetbrains.annotations.NotNull()
    com.fandiaspraja.core.data.remote.response.DetailResponse it) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fandiaspraja.core.domain.model.User> mapUserEntityToDomain(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fandiaspraja.core.data.local.entity.UserEntity> it) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fandiaspraja.core.domain.model.UserDetail mapUserDetailEntityToDomain(@org.jetbrains.annotations.NotNull()
    com.fandiaspraja.core.data.local.entity.UserEntity it) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.fandiaspraja.core.data.local.entity.UserEntity mapDomainToUserDetailEntity(@org.jetbrains.annotations.NotNull()
    com.fandiaspraja.core.domain.model.UserDetail it) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fandiaspraja.core.domain.model.Followers> mapResponseFollowersToDomain(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fandiaspraja.core.data.remote.response.DataFollowersResponse> it) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fandiaspraja.core.domain.model.Following> mapResponseFollowingToDomain(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fandiaspraja.core.data.remote.response.DataFollowingResponse> it) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fandiaspraja.core.domain.model.Followers> mapFollowersEntityToDomain(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fandiaspraja.core.data.local.entity.FollowersEntity> it) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fandiaspraja.core.domain.model.Following> mapFollowingEntityToDomain(@org.jetbrains.annotations.NotNull()
    java.util.List<com.fandiaspraja.core.data.local.entity.FollowingEntity> it) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fandiaspraja.core.data.local.entity.FollowersEntity> mapDomainToFollowersEntity(int id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.fandiaspraja.core.domain.model.Followers> it) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<com.fandiaspraja.core.data.local.entity.FollowingEntity> mapDomainToFollowingEntity(int id, @org.jetbrains.annotations.NotNull()
    java.util.List<com.fandiaspraja.core.domain.model.Following> it) {
        return null;
    }
}