package com.moataz.fetchtask.data.remote

import com.moataz.fetchtask.data.remote.dto.FetchDTO
import retrofit2.http.GET

interface FetchService {
    @GET("hiring.json")
    suspend fun getFetchItems(): List<FetchDTO>
}
