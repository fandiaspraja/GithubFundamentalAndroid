package com.fandiaspraja.githubfundamentalandroid.favorite.followers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fandiaspraja.core.data.Resource
import com.fandiaspraja.core.domain.model.Followers
import com.fandiaspraja.core.domain.usecase.UserUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class FollowersFavViewModel(private val userUseCase: UserUseCase): ViewModel() {

    private val _response: MutableLiveData<Resource<List<Followers>>> = MutableLiveData()
    val response: LiveData<Resource<List<Followers>>> = _response

    fun getFollowers(search: String, page : String, token: String) = viewModelScope.launch(
        Dispatchers.IO) {
        userUseCase.getFollowers(search, page, token).collect {
            _response.postValue(it)
        }
    }

    private val _responseFollowersEntity: MutableLiveData<Resource<List<Followers>>> = MutableLiveData()
    val responseFollowersEntity: LiveData<Resource<List<Followers>>> = _responseFollowersEntity

    fun getAllFollowers(id: Int) = viewModelScope.launch(
        Dispatchers.IO) {
        userUseCase.getAllFollowers(id).collect {
            _responseFollowersEntity.postValue(it)
        }
    }



}