package com.moataz.fetchtask.data.repositories.mapper

import com.moataz.fetchtask.data.remote.dto.FetchDTO
import com.moataz.fetchtask.domain.entities.Fetch

internal fun List<FetchDTO>.toFetchs() = map { it.fetch() }

internal fun FetchDTO.fetch() = Fetch(
    id = id ?: 0,
    listId = listId ?: 0,
    name = name ?: "",
)
