package com.fandiaspraja.githubfundamentalandroid.di

import com.fandiaspraja.githubfundamentalandroid.core.domain.usecase.UserInteractor
import com.fandiaspraja.githubfundamentalandroid.core.domain.usecase.UserUseCase
import com.fandiaspraja.githubfundamentalandroid.ui.dashboard.ui.favorite.FavoriteViewModel
import com.fandiaspraja.githubfundamentalandroid.ui.dashboard.ui.search.SearchViewModel
import com.fandiaspraja.githubfundamentalandroid.ui.detailfavorite.DetailFavoriteViewModel
import com.fandiaspraja.githubfundamentalandroid.ui.followers.FollowersViewModel
import com.fandiaspraja.githubfundamentalandroid.ui.following.FollowingViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val userCaseModule = module {
    factory<UserUseCase> { UserInteractor(get()) }
}

val viewModelModule = module {
    viewModel { SearchViewModel(get()) }
    viewModel { DetailFavoriteViewModel(get()) }
    viewModel { FavoriteViewModel(get()) }
    viewModel { FollowersViewModel(get()) }
    viewModel { FollowingViewModel(get()) }
}