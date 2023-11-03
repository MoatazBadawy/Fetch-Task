package com.moataz.fetchtask.domain.usecases

import com.moataz.fetchtask.domain.entities.Fetch
import com.moataz.fetchtask.domain.repository.FetchRepository
import javax.inject.Inject

class GetFetchItemsUseCse @Inject constructor(
    private val fetchRepository: FetchRepository,
) {
    suspend operator fun invoke(): List<Fetch> {
        return fetchRepository.getFetchItems()
    }
}
