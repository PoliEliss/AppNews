package com.rorono.newsapp.data.api

import com.rorono.newsapp.BuildConfig
import com.rorono.newsapp.model.News

import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api {
    @GET("/v2/everything")
    suspend fun getEverything(
        @Query("apiKey") apiKey: String = BuildConfig.API_KEY,
        @Query("q") q: String,
        @Query("page") page: Int = 1
    )

    @GET("v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("apiKey") apiKey: String = BuildConfig.API_KEY,
        @Query("country") country: String = "ru",
        @Query("page") page: Int = 1
    ):Response<News>
}