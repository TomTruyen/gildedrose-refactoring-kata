package com.gildedrose.models

import com.gildedrose.Item
import com.gildedrose.extensions.updateQuality

class NormalItemUpdater: ItemUpdater() {
    override fun update(item: Item) {
        super.update(item)

        val decrease = if (item.sellIn < 0) 2 else 1

        item.updateQuality(item.quality - decrease)
    }
}