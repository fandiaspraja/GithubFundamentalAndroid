package com.fandiaspraja.githubfundamentalandroid.favorite.di

import com.fandiaspraja.githubfundamentalandroid.favorite.detailfavorite.DetailFavoriteViewModel
import com.fandiaspraja.githubfundamentalandroid.favorite.favoritelist.FavoriteViewModel
import com.fandiaspraja.githubfundamentalandroid.favorite.followers.FollowersFavViewModel
import com.fandiaspraja.githubfundamentalandroid.favorite.following.FollowingFavViewModel
//import com.fandiaspraja.githubfundamentalandroid.favorite.followers.FollowersViewModel
//import com.fandiaspraja.githubfundamentalandroid.favorite.following.FollowingViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val favoriteModule = module {
    viewModel { DetailFavoriteViewModel(get()) }
    viewModel { FavoriteViewModel(get()) }
    viewModel { FollowersFavViewModel(get()) }
    viewModel { FollowingFavViewModel(get()) }

}