package com.fandiaspraja.githubfundamentalandroid.ui.dashboard.ui.search

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.fandiaspraja.core.data.Resource
import com.fandiaspraja.core.domain.model.User
import com.fandiaspraja.core.domain.usecase.UserUseCase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch

class SearchViewModel(private val userUseCase: UserUseCase) : ViewModel() {


    private val _response: MutableLiveData<Resource<List<User>>> = MutableLiveData()
    val response: LiveData<Resource<List<User>>> = _response

    fun searchUsers(search: String, page : String, token: String) = viewModelScope.launch(Dispatchers.IO) {
        userUseCase.searchUsers(search, page, token).collect {
            _response.postValue(it)
        }
    }
}