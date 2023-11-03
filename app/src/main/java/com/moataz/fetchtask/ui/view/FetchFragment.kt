package com.moataz.fetchtask.ui.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.lifecycleScope
import com.moataz.fetchtask.R
import com.moataz.fetchtask.databinding.FragmentFetchBinding
import com.moataz.fetchtask.ui.view.adapter.FetchAdapter
import com.moataz.fetchtask.ui.viewmodel.FetchViewModel
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class FetchFragment : Fragment() {
    private val viewModel: FetchViewModel by viewModels()
    private lateinit var binding: FragmentFetchBinding
    private lateinit var fetchAdapter: FetchAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View {
        binding = DataBindingUtil.inflate(
            inflater,
            R.layout.fragment_fetch,
            container,
            false,
        )
        binding.lifecycleOwner = viewLifecycleOwner
        binding.viewModel = viewModel
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initRecyclerView()
        observeEvents()
    }

    private fun initRecyclerView() {
        fetchAdapter = FetchAdapter(emptyList())
        binding.recipesRecyclerView.adapter = fetchAdapter
    }

    private fun observeEvents() {
        lifecycleScope.launch {
            viewModel.fetchUiState.collect { fetchUIState ->
                fetchAdapter.setItems(fetchUIState.fetchs)
                binding.recipesRecyclerView.scrollToPosition(0)
            }
        }
    }
}
