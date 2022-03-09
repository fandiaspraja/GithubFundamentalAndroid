package com.fandiaspraja.core.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "followers")
data class FollowersEntity(
    val user_id: Int? = null,
    val gists_url: String? = null,
    val repos_url: String? = null,
    val following_url: String? = null,
    val starred_url: String? = null,
    val login: String? = null,
    val followers_url: String? = null,
    val type: String? = null,
    val url: String? = null,
    val subscriptions_url: String? = null,
    val receivedEvents_url: String? = null,
    val avatar_url: String? = null,
    val events_url: String? = null,
    val html_url: String? = null,
    val site_admin: Boolean? = null,
    @PrimaryKey(autoGenerate = false)
    val id: Int? = null,
    val gravatar_id: String? = null,
    val node_id: String? = null,
    val organizations_url: String? = null
)
