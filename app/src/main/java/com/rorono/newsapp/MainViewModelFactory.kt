package com.rorono.newsapp

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rorono.newsapp.data.testRepo.TestRepo

class MainViewModelFactory(private val repository:TestRepo):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
       return MainViewModel(repository) as T
    }
}