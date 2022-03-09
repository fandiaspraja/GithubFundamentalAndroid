package com.fandiaspraja.githubfundamentalandroid.ui.following

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fandiaspraja.core.data.Resource
import com.fandiaspraja.core.domain.model.Following
import com.fandiaspraja.core.domain.usecase.UserUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class FollowingViewModel(private val userUseCase: UserUseCase): ViewModel() {

    private val _response: MutableLiveData<Resource<List<Following>>> = MutableLiveData()
    val response: LiveData<Resource<List<Following>>> = _response

    fun getFollowings(search: String, page : String, token: String) = viewModelScope.launch(
        Dispatchers.IO) {
        userUseCase.getFollowings(search, page, token).collect {
            _response.postValue(it)
        }
    }

    private val _responseFollowingEntity: MutableLiveData<Resource<List<Following>>> = MutableLiveData()
    val responseFollowingEntity: LiveData<Resource<List<Following>>> = _responseFollowingEntity

    fun getAllFollowing(id: Int) = viewModelScope.launch(
        Dispatchers.IO) {
        userUseCase.getAllFollowing(id).collect {
            _responseFollowingEntity.postValue(it)
        }
    }

}