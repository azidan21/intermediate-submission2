package com.dicoding.mystoryapp.Map

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.dicoding.mystoryapp.data.Response.ListStoryItem
import com.dicoding.mystoryapp.data.UserRepository
import kotlinx.coroutines.launch

class MapsViewModel(private val userRepository: UserRepository): ViewModel() {

    private val _storiesResponse = MutableLiveData<List<ListStoryItem>>()
    val storiesResponse: LiveData<List<ListStoryItem>> = _storiesResponse

    fun getStoriesWithLocation(){
        viewModelScope.launch {
            _storiesResponse.value = userRepository.getStoriesWithLocation().listStory
        }
    }
}