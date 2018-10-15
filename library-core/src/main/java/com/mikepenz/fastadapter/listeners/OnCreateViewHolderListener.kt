package com.mikepenz.fastadapter.listeners

import androidx.recyclerview.widget.RecyclerView
import android.view.ViewGroup

import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.IItem

interface OnCreateViewHolderListener<Item : IItem<out RecyclerView.ViewHolder>> {
    /**
     * is called inside the onCreateViewHolder method and creates the viewHolder based on the provided viewTyp
     *
     * @param fastAdapter the fastAdapter which handles the creation of this viewHolder
     * @param parent   the parent which will host the View
     * @param viewType the type of the ViewHolder we want to create
     * @return the generated ViewHolder based on the given viewType
     */
    fun onPreCreateViewHolder(
        fastAdapter: FastAdapter<Item>,
        parent: ViewGroup,
        viewType: Int
    ): RecyclerView.ViewHolder

    /**
     * is called after the viewHolder was created and the default listeners were added
     *
     * @param fastAdapter the fastAdapter which handles the creation of this viewHolder
     * @param viewHolder the created viewHolder after all listeners were set
     * @return the viewHolder given as param
     */
    fun onPostCreateViewHolder(
        fastAdapter: FastAdapter<Item>,
        viewHolder: RecyclerView.ViewHolder
    ): RecyclerView.ViewHolder
}