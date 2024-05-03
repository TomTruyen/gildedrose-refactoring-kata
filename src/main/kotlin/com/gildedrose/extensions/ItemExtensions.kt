package com.gildedrose.extensions

import com.gildedrose.Item
import com.gildedrose.models.ItemUpdater

fun Item.updateQuality(quality: Int) {
    this.quality = quality.coerceIn(ItemUpdater.QUALITY_RANGE)
}