package com.moataz.fetchtask.ui.viewmodel.model

data class FetchUIState(
    val isLoading: Boolean = true,
    val isSuccessful: Boolean = false,
    val isError: Boolean? = false,
    val fetchs: List<FetchUI> = emptyList(),
)
