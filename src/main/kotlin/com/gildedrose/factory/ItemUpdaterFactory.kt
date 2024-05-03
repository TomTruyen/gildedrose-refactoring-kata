package com.gildedrose.factory

import com.gildedrose.models.ItemUpdater

interface ItemUpdaterFactory {
    fun createItemUpdater(name: String): ItemUpdater
}