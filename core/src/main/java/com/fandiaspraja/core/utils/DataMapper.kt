package com.fandiaspraja.core.utils

import com.fandiaspraja.core.data.local.entity.FollowersEntity
import com.fandiaspraja.core.data.local.entity.FollowingEntity
import com.fandiaspraja.core.data.local.entity.UserEntity
import com.fandiaspraja.core.data.remote.response.DataFollowersResponse
import com.fandiaspraja.core.data.remote.response.DataFollowingResponse
import com.fandiaspraja.core.data.remote.response.DetailResponse
import com.fandiaspraja.core.data.remote.response.UserResponse
import com.fandiaspraja.core.domain.model.Followers
import com.fandiaspraja.core.domain.model.Following
import com.fandiaspraja.core.domain.model.User
import com.fandiaspraja.core.domain.model.UserDetail


object DataMapper {

    fun mapResponseUserToDomain(it: List<UserResponse>): List<User> {

        val userList = ArrayList<User>()

        it.map {
            val user = User(
                it.gistsUrl,
                it.reposUrl,
                it.followingUrl,
                it.starredUrl,
                it.login,
                it.followersUrl,
                it.type,
                it.url,
                it.subscriptionsUrl,
                it.score,
                it.receivedEventsUrl,
                it.avatarUrl,
                it.eventsUrl,
                it.htmlUrl,
                it.siteAdmin,
                it.id,
                it.gravatarId,
                it.nodeId,
                it.organizationsUrl
            )
            userList.add(user)
        }




        return userList
    }

    fun mapResponseUserDetailToDomain(it: DetailResponse): UserDetail {


            val user = UserDetail(
                it.gists_url,
                it.repos_url,
                it.following_url,
                it.twitter_username,
                it.bio,
                it.created_at,
                it.login,
                it.type,
                it.blog,
                it.subscriptions_url,
                it.update_at,
                it.site_admin,
                it.company,
                it.id,
                it.public_repos,
                it.gravatar_id,
                it.email,
                it.organizations_url,
                it.hireable,
                it.starred_url,
                it.followers_url,
                it.public_gists,
                it.url,
                it.received_events_url,
                it.followers,
                it.avatar_url,
                it.events_url,
                it.html_url,
                it.following,
                it.name,
                it.location,
                it.node_id
            )




        return user
    }

    fun mapUserEntityToDomain(it: List<UserEntity>): List<User> {

        val userList = ArrayList<User>()

        it.map {
            val user = User(
                it.gists_url,
                it.repos_url,
                it.following_url,
                it.starred_url,
                it.login,
                it.followers_url,
                it.type,
                it.url,
                it.subscriptions_url,
                0.0,
                it.received_events_url,
                it.avatar_url,
                it.events_url,
                it.html_url,
                it.site_admin,
                it.id,
                it.gravatar_id,
                it.node_id,
                it.organizations_url
            )
            userList.add(user)
        }
        return userList
    }


    fun mapUserDetailEntityToDomain(it: UserEntity): UserDetail {

        val user = UserDetail(
            it.gists_url,
            it.repos_url,
            it.following_url,
            it.twitter_username,
            it.bio,
            it.created_at,
            it.login,
            it.type,
            it.blog,
            it.subscriptions_url,
            it.update_at,
            it.site_admin,
            it.company,
            it.id,
            it.public_repos,
            it.gravatar_id,
            it.email,
            it.organizations_url,
            it.hireable,
            it.starred_url,
            it.followers_url,
            it.public_gists,
            it.url,
            it.received_events_url,
            it.followers,
            it.avatar_url,
            it.events_url,
            it.html_url,
            it.following,
            it.name,
            it.location,
            it.node_id
        )

        return user
    }


    fun mapDomainToUserDetailEntity(it: UserDetail): UserEntity {

        val user = UserEntity(
            it.gists_url,
            it.repos_url,
            it.following_url,
            it.twitter_username,
            it.bio,
            it.created_at,
            it.login,
            it.type,
            it.blog,
            it.subscriptions_url,
            it.update_at,
            it.site_admin,
            it.company.toString(),
            it.id!!,
            it.public_repos,
            it.gravatar_id,
            it.email,
            it.organizations_url,
            it.hireable.toString(),
            it.starred_url,
            it.followers_url,
            it.public_gists,
            it.url,
            it.received_events_url,
            it.followers,
            it.avatar_url,
            it.events_url,
            it.html_url,
            it.following,
            it.name,
            it.location.toString(),
            it.node_id
        )

        return user
    }

    fun mapResponseFollowersToDomain(it: List<DataFollowersResponse>): List<Followers> {

        val userList = ArrayList<Followers>()

        it.map {
            val user = Followers(
                it.gists_url,
                it.repos_url,
                it.following_url,
                it.starred_url,
                it.login,
                it.followers_url,
                it.type,
                it.url,
                it.subscriptions_url,
                it.receivedEvents_url,
                it.avatar_url,
                it.events_url,
                it.html_url,
                it.site_admin,
                it.id,
                it.gravatar_id,
                it.node_id,
                it.organizations_url
            )

            userList.add(user)
        }




        return userList
    }

    fun mapResponseFollowingToDomain(it: List<DataFollowingResponse>): List<Following> {

        val userList = ArrayList<Following>()

        it.map {
            val user = Following(
                it.gists_url,
                it.repos_url,
                it.following_url,
                it.starred_url,
                it.login,
                it.followers_url,
                it.type,
                it.url,
                it.subscriptions_url,
                it.receivedEvents_url,
                it.avatar_url,
                it.events_url,
                it.html_url,
                it.site_admin,
                it.id,
                it.gravatar_id,
                it.node_id,
                it.organizations_url
            )

            userList.add(user)
        }




        return userList
    }

    fun mapFollowersEntityToDomain(it: List<FollowersEntity>): List<Followers> {

        val userList = ArrayList<Followers>()

        it.map {
            val user = Followers(
                it.gists_url,
                it.repos_url,
                it.following_url,
                it.starred_url,
                it.login,
                it.followers_url,
                it.type,
                it.url,
                it.subscriptions_url,
                it.receivedEvents_url,
                it.avatar_url,
                it.events_url,
                it.html_url,
                it.site_admin,
                it.id,
                it.gravatar_id,
                it.node_id,
                it.organizations_url
            )
            userList.add(user)
        }
        return userList
    }

    fun mapFollowingEntityToDomain(it: List<FollowingEntity>): List<Following> {

        val userList = ArrayList<Following>()

        it.map {
            val user = Following(
                it.gists_url,
                it.repos_url,
                it.following_url,
                it.starred_url,
                it.login,
                it.followers_url,
                it.type,
                it.url,
                it.subscriptions_url,
                it.receivedEvents_url,
                it.avatar_url,
                it.events_url,
                it.html_url,
                it.site_admin,
                it.id,
                it.gravatar_id,
                it.node_id,
                it.organizations_url
            )
            userList.add(user)
        }
        return userList
    }


    fun mapDomainToFollowersEntity(id: Int, it: List<Followers>): List<FollowersEntity> {

        val userList = ArrayList<FollowersEntity>()

        it.map {
            val user = FollowersEntity(
                id,
                it.gists_url,
                it.repos_url,
                it.following_url,
                it.starred_url,
                it.login,
                it.followers_url,
                it.type,
                it.url,
                it.subscriptions_url,
                it.receivedEvents_url,
                it.avatar_url,
                it.events_url,
                it.html_url,
                it.site_admin,
                it.id,
                it.gravatar_id,
                it.node_id,
                it.organizations_url
            )
            userList.add(user)
        }
        return userList
    }

    fun mapDomainToFollowingEntity(id: Int, it: List<Following>): List<FollowingEntity> {

        val userList = ArrayList<FollowingEntity>()

        it.map {
            val user = FollowingEntity(
                id,
                it.gists_url,
                it.repos_url,
                it.following_url,
                it.starred_url,
                it.login,
                it.followers_url,
                it.type,
                it.url,
                it.subscriptions_url,
                it.receivedEvents_url,
                it.avatar_url,
                it.events_url,
                it.html_url,
                it.site_admin,
                it.id,
                it.gravatar_id,
                it.node_id,
                it.organizations_url
            )
            userList.add(user)
        }
        return userList
    }

}