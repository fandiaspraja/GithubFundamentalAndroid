package com.fandiaspraja.githubfundamentalandroid.ui.dashboard.ui.favorite

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fandiaspraja.githubfundamentalandroid.core.data.Resource
import com.fandiaspraja.githubfundamentalandroid.core.domain.model.User
import com.fandiaspraja.githubfundamentalandroid.core.domain.usecase.UserUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class FavoriteViewModel(private val userUseCase: UserUseCase) : ViewModel() {

    private val _response: MutableLiveData<Resource<List<User>>> = MutableLiveData()
    val response: LiveData<Resource<List<User>>> = _response

    fun findAllUsergithub() = viewModelScope.launch(
        Dispatchers.IO) {
        userUseCase.findAllUsergithub().collect {
            _response.postValue(it)
        }
    }

}