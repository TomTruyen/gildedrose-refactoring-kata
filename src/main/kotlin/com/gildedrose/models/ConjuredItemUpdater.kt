package com.gildedrose.models

import com.gildedrose.Item
import com.gildedrose.extensions.updateQuality

class ConjuredItemUpdater: ItemUpdater() {
    override fun update(item: Item) {
        super.update(item)

        val decrease = if (item.sellIn < 0) 4 else 2

        item.updateQuality(item.quality - decrease)
    }
}
