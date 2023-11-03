package com.moataz.fetchtask.ui.view.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.moataz.fetchtask.R
import com.moataz.fetchtask.databinding.ItemFetchBinding
import com.moataz.fetchtask.ui.viewmodel.model.FetchUI

class FetchAdapter(
    private var fetchs: List<FetchUI>,
) : RecyclerView.Adapter<FetchAdapter.RecipesViewHolder>() {

    fun setItems(newItems: List<FetchUI>) {
        val diffUtilResult =
            DiffUtil.calculateDiff(FetchDiffUtil(fetchs, newItems, ::areContentsTheSame))
        fetchs = newItems
        diffUtilResult.dispatchUpdatesTo(this)
    }

    private fun areContentsTheSame(oldItem: FetchUI, newItem: FetchUI): Boolean {
        return oldItem == newItem
    }

    override fun getItemCount(): Int = fetchs.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecipesViewHolder {
        return RecipesViewHolder(
            DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.item_fetch,
                parent,
                false,
            ),
        )
    }

    override fun onBindViewHolder(holder: RecipesViewHolder, position: Int) {
        holder.binding.run {
            fetch = fetchs[position]
        }
    }

    inner class RecipesViewHolder(val binding: ItemFetchBinding) :
        RecyclerView.ViewHolder(binding.root)
}
