package com.moataz.fetchtask.data.repositories

import com.moataz.fetchtask.data.remote.FetchService
import com.moataz.fetchtask.data.repositories.mapper.toFetchs
import com.moataz.fetchtask.domain.entities.Fetch
import com.moataz.fetchtask.domain.repository.FetchRepository
import javax.inject.Inject

class FetchRepositoryImpl @Inject constructor(
    private val fetchRemoteService: FetchService,
) : FetchRepository {
    override suspend fun getFetchItems(): List<Fetch> {
        return fetchRemoteService.getFetchItems().toFetchs()
    }
}
