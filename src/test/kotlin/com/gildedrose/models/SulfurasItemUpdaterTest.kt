package com.gildedrose.models

import com.gildedrose.Item
import org.junit.jupiter.api.Test

internal class SulfurasItemUpdaterTest {
    @Test
    fun `test update should not change quality`() {
        // Given
        val item = Item("Sulfuras, Hand of Ragnaros", 10, 80)
        val sulfurasItemUpdater = SulfurasItemUpdater()

        // When
        sulfurasItemUpdater.update(item)

        // Then
        assert(item.quality == 80)
    }

    @Test
    fun `test update should not change sellIn`() {
        // Given
        val item = Item("Sulfuras, Hand of Ragnaros", 10, 80)
        val sulfurasItemUpdater = SulfurasItemUpdater()

        // When
        sulfurasItemUpdater.update(item)

        // Then
        assert(item.sellIn == 10)
    }
}