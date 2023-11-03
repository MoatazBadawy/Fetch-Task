package com.moataz.fetchtask.ui.viewmodel.mapper

import com.moataz.fetchtask.domain.entities.Fetch
import com.moataz.fetchtask.ui.viewmodel.model.FetchUI

internal fun List<Fetch>.toFetchsUI() = map { it.fetchUI() }

internal fun Fetch.fetchUI() = FetchUI(
    id = id,
    listId = listId,
    name = name,
)
