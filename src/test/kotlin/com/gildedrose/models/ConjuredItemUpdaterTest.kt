package com.gildedrose.models

import com.gildedrose.Item
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class ConjuredItemUpdaterTest {
    @Test
    fun `test quality decreases by 2 when sellIn is greater than 0`() {
        // Given
        val item = Item("Conjured Mana Cake", 10, 10)
        val conjuredItemUpdater = ConjuredItemUpdater()

        // When
        conjuredItemUpdater.update(item)

        // Then
        assertEquals(8, item.quality)
    }

    @Test
    fun `test quality decreases by 4 when sellIn is less than 0`() {
        // Given
        val item = Item("Conjured Mana Cake", -1, 10)
        val conjuredItemUpdater = ConjuredItemUpdater()

        // When
        conjuredItemUpdater.update(item)

        // Then
        assertEquals(6, item.quality)
    }

    @Test
    fun `test should decrease sellIn by 1`() {
        // Given
        val item = Item("Conjured Mana Cake", 10, 10)
        val conjuredItemUpdater = ConjuredItemUpdater()

        // When
        conjuredItemUpdater.update(item)

        // Then
        assertEquals(9, item.sellIn)
    }
}