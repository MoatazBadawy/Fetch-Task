package com.moataz.fetchtask.ui.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.moataz.fetchtask.domain.usecases.GetFetchItemsUseCse
import com.moataz.fetchtask.ui.viewmodel.mapper.toFetchsUI
import com.moataz.fetchtask.ui.viewmodel.model.FetchUIState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class FetchViewModel @Inject constructor(
    private val getFetchItemsUseCse: GetFetchItemsUseCse,
) : ViewModel() {

    private val _fetchUiState = MutableStateFlow(FetchUIState())
    val fetchUiState get() = _fetchUiState.asStateFlow()

    init {
        getFetchItems()
    }

    private fun getFetchItems() {
        viewModelScope.launch {
            try {
                _fetchUiState.update { fetchUIState ->
                    fetchUIState.copy(
                        isLoading = false,
                        isSuccessful = true,
                        isError = false,
                        fetchs = getFetchItemsUseCse().toFetchsUI(),
                    )
                }
            } catch (e: Exception) {
                _fetchUiState.update { fetchUIState ->
                    fetchUIState.copy(
                        isLoading = false,
                        isSuccessful = false,
                        isError = true,
                        fetchs = emptyList(),
                    )
                }
            }
        }
    }
}
