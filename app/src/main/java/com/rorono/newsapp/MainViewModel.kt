package com.rorono.newsapp

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.rorono.newsapp.data.testRepo.TestRepo
import com.rorono.newsapp.model.Article
import com.rorono.newsapp.model.News
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Response

class MainViewModel(private val repository: TestRepo) : ViewModel() {

    private val _data = MutableLiveData<News>()
    val data: LiveData<News>
        get() = _data


    fun test() {
        viewModelScope.launch {
            withContext(Dispatchers.IO){
               val response = repository.getTestData()
                withContext(Dispatchers.Main){
                    _data.postValue(response.body()!!)
                }
            }
        }
    }
}