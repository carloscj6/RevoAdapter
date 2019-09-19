package com.revosleap.revoadapter

import com.drakeet.multitype.MultiTypeAdapter

class RevoAdapter : MultiTypeAdapter() {

    private val adapterItems = items.toMutableList()

    fun addNewItems(itemList: MutableList<Any>) {
        adapterItems.clear()
        adapterItems.addAll(itemList)
        items = adapterItems
        notifyDataSetChanged()
    }

    fun appendItems(itemList: MutableList<Any>) {
        adapterItems.addAll(itemList)
        items = adapterItems
        notifyDataSetChanged()
    }

    fun clearAdapter() {
        adapterItems.clear()
        notifyDataSetChanged()
    }

    fun addItemToTop(item: Any) {
        adapterItems.add(0, item)
        items = adapterItems
        notifyItemInserted(0)
    }

    fun addItemToBottom(item: Any) {
        adapterItems.add(adapterItems.size + 1, item)
        items = adapterItems
        notifyItemInserted(adapterItems.size + 1)
    }
}