package com.gildedrose.factory

import com.gildedrose.models.*
import org.junit.jupiter.api.Test

internal class ItemUpdaterFactoryTest {
    @Test
    fun `test should return NormalItemUpdater when item name is not Aged Brie, Sulfuras, Backstage passes or Conjured`() {
        // Given
        val itemName = "+5 Dexterity Vest"
        val itemUpdaterFactory = ItemUpdaterFactory()

        // When
        val itemUpdater = itemUpdaterFactory.createItemUpdater(itemName)

        // Then
        assert(itemUpdater is NormalItemUpdater)
    }

    @Test
    fun `test should return AgedBrieItemUpdater when item name is Aged Brie`() {
        // Given
        val itemName = "Aged Brie"
        val itemUpdaterFactory = ItemUpdaterFactory()

        // When
        val itemUpdater = itemUpdaterFactory.createItemUpdater(itemName)

        // Then
        assert(itemUpdater is AgedBrieItemUpdater)
    }

    @Test
    fun `test should return BackstagePassesItemUpdater when item name is Backstage passes`() {
        // Given
        val itemName = "Backstage passes to a TAFKAL80ETC concert"
        val itemUpdaterFactory = ItemUpdaterFactory()

        // When
        val itemUpdater = itemUpdaterFactory.createItemUpdater(itemName)

        // Then
        assert(itemUpdater is BackstagePassesItemUpdater)
    }

    @Test
    fun `test should return SulfurasItemUpdater when item name is Sulfuras, Hand of Ragnaros`() {
        // Given
        val itemName = "Sulfuras, Hand of Ragnaros"
        val itemUpdaterFactory = ItemUpdaterFactory()

        // When
        val itemUpdater = itemUpdaterFactory.createItemUpdater(itemName)

        // Then
        assert(itemUpdater is SulfurasItemUpdater)
    }

    @Test
    fun `test should return ConjuredItemUpdater when item name is Conjured`() {
        // Given
        val itemName = "Conjured Mana Cake"
        val itemUpdaterFactory = ItemUpdaterFactory()

        // When
        val itemUpdater = itemUpdaterFactory.createItemUpdater(itemName)

        // Then
        assert(itemUpdater is ConjuredItemUpdater)
    }
}