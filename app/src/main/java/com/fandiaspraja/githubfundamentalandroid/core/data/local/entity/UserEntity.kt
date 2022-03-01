package com.fandiaspraja.githubfundamentalandroid.core.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable

@Entity(tableName = "user")
class UserEntity(
    val gists_url: String? = null,
    val repos_url: String? = null,
    val following_url: String? = null,
    val twitter_username: String? = null,
    val bio: String? = null,
    val created_at: String? = null,
    val login: String? = null,
    val type: String? = null,
    val blog: String? = null,
    val subscriptions_url: String? = null,
    val update_at: String? = null,
    val site_admin: Boolean? = null,
    val company: String? = null,
    @PrimaryKey(autoGenerate = false)
    val id: Int,
    val public_repos: Int? = null,
    val gravatar_id: String? = null,
    val email: String? = null,
    val organizations_url: String? = null,
    val hireable: String? = null,
    val starred_url: String? = null,
    val followers_url: String? = null,
    val public_gists: Int? = null,
    val url: String? = null,
    val received_events_url: String? = null,
    val followers: Int? = null,
    val avatar_url: String? = null,
    val events_url: String? = null,
    val html_url: String? = null,
    val following: Int? = null,
    val name: String? = null,
    val location: String? = null,
    val node_id: String? = null,
    var isFav: Boolean = false
): Serializable