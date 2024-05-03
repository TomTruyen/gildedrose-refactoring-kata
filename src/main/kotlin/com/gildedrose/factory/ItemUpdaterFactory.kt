package com.gildedrose.factory

import com.gildedrose.models.*
import com.gildedrose.models.enums.ItemType

class ItemUpdaterFactory {
    fun createItemUpdater(name: String): ItemUpdater {
        val itemType = ItemType.fromValue(name)

        return when(itemType) {
            ItemType.AGED_BRIE -> AgedBrieItemUpdater()
            ItemType.BACKSTAGE_PASSES -> BackstagePassesItemUpdater()
            ItemType.SULFURAS -> SulfurasItemUpdater()
            ItemType.CONJURED -> ConjuredItemUpdater()
            ItemType.NORMAL -> NormalItemUpdater()
        }
    }
}