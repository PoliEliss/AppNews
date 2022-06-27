package com.rorono.newsapp.data.testRepo

import com.rorono.newsapp.data.api.RetrofitInstance

class TestRepo(private val retrofit:RetrofitInstance ) {

    suspend fun getTestData() = retrofit.api.getTopHeadlines()
}