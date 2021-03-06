package com.fandiaspraja.githubfundamentalandroid.ui.followers

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fandiaspraja.githubfundamentalandroid.core.data.Resource
import com.fandiaspraja.githubfundamentalandroid.core.domain.model.Followers
import com.fandiaspraja.githubfundamentalandroid.core.domain.usecase.UserUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class FollowersViewModel(private val userUseCase: UserUseCase): ViewModel() {

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