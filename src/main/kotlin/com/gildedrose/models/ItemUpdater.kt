package com.gildedrose.models

import com.gildedrose.Item

abstract class ItemUpdater: Updater {
    override fun update(item: Item) {
        item.sellIn--
    }

    companion object {
        val QUALITY_RANGE = 0..50
    }
}