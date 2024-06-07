package com.dicoding.mystoryapp

import com.dicoding.mystoryapp.data.Response.ListStoryItem

object DataDummy {

    fun generateDummyQuoteResponse(): List<ListStoryItem> {
        val items: MutableList<ListStoryItem> = arrayListOf()
        for (i in 0..100) {
            val quote = ListStoryItem(
                i.toString(),
                "createdAt + $i",
                "name $i",
                "desc $i",
            )
            items.add(quote)
        }
        return items
    }
}