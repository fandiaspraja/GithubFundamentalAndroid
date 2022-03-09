package com.fandiaspraja.githubfundamentalandroid.favorite.detailfavorite

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fandiaspraja.core.data.Resource
import com.fandiaspraja.core.domain.model.Followers
import com.fandiaspraja.core.domain.model.Following
import com.fandiaspraja.core.domain.model.UserDetail
import com.fandiaspraja.core.domain.usecase.UserUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class DetailFavoriteViewModel(private val userUseCase: UserUseCase): ViewModel() {

    private val _response: MutableLiveData<Resource<UserDetail>> = MutableLiveData()
    val response: LiveData<Resource<UserDetail>> = _response

    fun getDetailUser(username: String, token: String) = viewModelScope.launch(
        Dispatchers.IO) {
        userUseCase.getDetailUser(username, token).collect {
            _response.postValue(it)
        }
    }

    private val _responseFavorite: MutableLiveData<Resource<UserDetail>> = MutableLiveData()
    val responseFavorite: LiveData<Resource<UserDetail>> = _responseFavorite

    fun findUsergithub(id: Int) = viewModelScope.launch(
        Dispatchers.IO) {
        userUseCase.findUsergithub(id).collect {
            _responseFavorite.postValue(it)
        }
    }

    fun insertUserFavorite(userDetail: UserDetail) = viewModelScope.launch(
        Dispatchers.IO) {
        userUseCase.insertUserFavorite(userDetail)
    }

    fun deleteUsergithubByid(id: Int) = viewModelScope.launch(
        Dispatchers.IO) {
        userUseCase.deleteUsergithubByid(id)
    }

    fun insertFollowers(id: Int, followers: List<Followers>) = viewModelScope.launch(
        Dispatchers.IO) {
        userUseCase.insertFollowers(id, followers)
    }

    fun deleteFollowers(id: Int) = viewModelScope.launch(
        Dispatchers.IO) {
        userUseCase.deleteFollowers(id)
    }

    fun insertFollowing(id: Int, followings: List<Following>) = viewModelScope.launch(
        Dispatchers.IO) {
        userUseCase.insertFollowing(id, followings)
    }

    fun deleteFollowings(id: Int) = viewModelScope.launch(
        Dispatchers.IO) {
        userUseCase.deleteFollowing(id)
    }

}