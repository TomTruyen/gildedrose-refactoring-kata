package com.gildedrose.models

import com.gildedrose.Item
import com.gildedrose.extensions.updateQuality

class AgedBrieItemUpdater: ItemUpdater() {
    override fun update(item: Item) {
        super.update(item)

        val increase = if (item.sellIn < 0) 2 else 1

        item.updateQuality(item.quality + increase)
    }
}