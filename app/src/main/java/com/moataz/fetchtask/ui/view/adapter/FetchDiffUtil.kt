package com.moataz.fetchtask.ui.view.adapter

import androidx.recyclerview.widget.DiffUtil
import com.moataz.fetchtask.ui.viewmodel.model.FetchUI

class FetchDiffUtil(
    private val oldList: List<FetchUI>,
    private val newList: List<FetchUI>,
    private val areContentsTheSame: (FetchUI, FetchUI) -> Boolean,
) : DiffUtil.Callback() {

    override fun getOldListSize(): Int {
        return oldList.size
    }

    override fun getNewListSize(): Int {
        return newList.size
    }

    override fun areItemsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return oldList[oldItemPosition] == newList[newItemPosition]
    }

    override fun areContentsTheSame(oldItemPosition: Int, newItemPosition: Int): Boolean {
        return areContentsTheSame(oldList[oldItemPosition], newList[newItemPosition])
    }
}
