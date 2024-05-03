package com.gildedrose

import com.gildedrose.factory.ItemUpdaterFactory
import com.gildedrose.factory.ItemUpdaterFactoryImpl

class GildedRose(
    private var items: List<Item>
) {
    private val factory: ItemUpdaterFactory by lazy {
        ItemUpdaterFactoryImpl()
    }

    fun updateQuality() {
        items.forEach {
            factory.createItemUpdater(it.name).update(it)
        }
    }
}

