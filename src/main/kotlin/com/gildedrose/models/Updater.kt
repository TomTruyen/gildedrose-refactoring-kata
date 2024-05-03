package com.gildedrose.models

import com.gildedrose.Item

interface Updater {
    fun update(item: Item)
}