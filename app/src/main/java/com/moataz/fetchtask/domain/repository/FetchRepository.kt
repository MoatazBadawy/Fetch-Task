package com.moataz.fetchtask.domain.repository

import com.moataz.fetchtask.domain.entities.Fetch

interface FetchRepository {
    suspend fun getFetchItems(): List<Fetch>
}
