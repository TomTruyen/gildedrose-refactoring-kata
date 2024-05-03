package com.gildedrose.models

import com.gildedrose.Item
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class AgedBrieItemUpdaterTest {
    @Test
    fun `test should increase quality by 1 when sellIn is greater than 0`() {
        // Given
        val item = Item("Aged Brie", 10, 10)
        val agedBrieItemUpdater = AgedBrieItemUpdater()

        // When
        agedBrieItemUpdater.update(item)

        // Then
        assertEquals(11, item.quality)
    }

    @Test
    fun `test should increase quality by 2 when sellIn is less than 0`() {
        // Given
        val item = Item("Aged Brie", -1, 10)
        val agedBrieItemUpdater = AgedBrieItemUpdater()

        // When
        agedBrieItemUpdater.update(item)

        // Then
        assertEquals(12, item.quality)
    }

    @Test
    fun `test should decrease sellIn by 1`() {
        // Given
        val item = Item("Aged Brie", 10, 10)
        val agedBrieItemUpdater = AgedBrieItemUpdater()

        // When
        agedBrieItemUpdater.update(item)

        // Then
        assertEquals(9, item.sellIn)
    }
}