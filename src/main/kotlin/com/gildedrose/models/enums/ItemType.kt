package com.gildedrose.models.enums

enum class ItemType(val value: String? = null) {
    AGED_BRIE("Aged Brie"),
    BACKSTAGE_PASSES("Backstage passes to a TAFKAL80ETC concert"),
    SULFURAS("Sulfuras, Hand of Ragnaros"),
    CONJURED("Conjured"),
    NORMAL;

    companion object {
        fun fromValue(value: String): ItemType {
            return entries.find { it.value == value } ?: NORMAL
        }
    }
}