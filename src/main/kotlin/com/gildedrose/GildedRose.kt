package com.gildedrose

import com.gildedrose.factory.ItemUpdaterFactory

class GildedRose(
    private var items: List<Item>
) {
    private val factory by lazy {
        ItemUpdaterFactory()
    }

    fun updateQuality() {
        items.forEach {
            factory.createItemUpdater(it.name).update(it)
        }
    }
}

