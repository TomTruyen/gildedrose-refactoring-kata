package com.gildedrose.models

import com.gildedrose.Item
import com.gildedrose.extensions.updateQuality

class BackstagePassesItemUpdater: ItemUpdater() {
    override fun update(item: Item) {
        super.update(item)

        val increase = when(item.sellIn) {
            in 0..5 -> 3
            in 6..10 -> 2
            in 11..Int.MAX_VALUE -> 1
            else -> -item.quality
        }

        item.updateQuality(item.quality + increase)
    }
}