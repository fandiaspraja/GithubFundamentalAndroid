package com.fandiaspraja.githubfundamentalandroid.di


import com.fandiaspraja.core.domain.usecase.UserInteractor
import com.fandiaspraja.core.domain.usecase.UserUseCase
//import com.fandiaspraja.githubfundamentalandroid.favorite.favoritelist.FavoriteViewModel
import com.fandiaspraja.githubfundamentalandroid.ui.dashboard.ui.search.SearchViewModel
import com.fandiaspraja.githubfundamentalandroid.ui.detail.DetailUserViewModel
//import com.fandiaspraja.githubfundamentalandroid.favorite.DetailFavoriteViewModel
import com.fandiaspraja.githubfundamentalandroid.ui.followers.FollowersViewModel
import com.fandiaspraja.githubfundamentalandroid.ui.following.FollowingViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module


val userCaseModule = module {
    factory<UserUseCase> { UserInteractor(get()) }
}

val viewModelModule = module {
    viewModel { SearchViewModel(get()) }
//    viewModel { com.fandiaspraja.githubfundamentalandroid.favorite.DetailFavoriteViewModel(get()) }
//    viewModel {
//        com.fandiaspraja.githubfundamentalandroid.favorite.favoritelist.FavoriteViewModel(
//            get()
//        )
//    }
    viewModel { FollowersViewModel(get()) }
    viewModel { FollowingViewModel(get()) }
    viewModel { DetailUserViewModel(get()) }
}