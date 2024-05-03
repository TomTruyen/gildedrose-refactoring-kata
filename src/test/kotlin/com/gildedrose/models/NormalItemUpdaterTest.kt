package com.gildedrose.models

import com.gildedrose.Item
import org.junit.jupiter.api.Test

internal class NormalItemUpdaterTest {
    @Test
    fun `test quality decreases by 1 when sellIn is greater than 0`() {
        // Given
        val item = Item("+5 Dexterity Vest", 10, 20)
        val normalItemUpdater = NormalItemUpdater()

        // When
        normalItemUpdater.update(item)

        // Then
        assert(item.quality == 19)
        assert(item.sellIn == 9)
    }

    @Test
    fun `test quality decreases by 2 when sellIn is less than 0`() {
        // Given
        val item = Item("+5 Dexterity Vest", 0, 20)
        val normalItemUpdater = NormalItemUpdater()

        // When
        normalItemUpdater.update(item)

        // Then
        assert(item.quality == 18)
        assert(item.sellIn == -1)
    }

    @Test
    fun `test quality of an item is never negative`() {
        // Given
        val item = Item("+5 Dexterity Vest", 10, 0)
        val normalItemUpdater = NormalItemUpdater()

        // When
        normalItemUpdater.update(item)

        // Then
        assert(item.quality == 0)
        assert(item.sellIn == 9)
    }

    @Test
    fun `test sellIn decreases by 1`() {
        // Given
        val item = Item("+5 Dexterity Vest", 10, 20)
        val normalItemUpdater = NormalItemUpdater()

        // When
        normalItemUpdater.update(item)

        // Then
        assert(item.sellIn == 9)
    }
}