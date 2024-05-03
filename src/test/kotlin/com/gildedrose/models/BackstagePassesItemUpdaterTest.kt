package com.gildedrose.models

import com.gildedrose.Item
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class BackstagePassesItemUpdaterTest {
    @Test
    fun `test quality increases by 1 when sellIn is greater than 10`() {
        // Given
        val item = Item("Backstage passes to a TAFKAL80ETC concert", 15, 10)
        val backstackPassesItemUpdater = BackstagePassesItemUpdater()

        // When
        backstackPassesItemUpdater.update(item)

        // Then
        assertEquals(11, item.quality)
    }

    @Test
    fun `test quality increases by 2 when sellIn is between 5 and 10`() {
        // Given
        val item = Item("Backstage passes to a TAFKAL80ETC concert", 10, 10)
        val backstackPassesItemUpdater = BackstagePassesItemUpdater()

        // When
        backstackPassesItemUpdater.update(item)

        // Then
        assertEquals(12, item.quality)
    }

    @Test
    fun `test quality increases by 3 when sellIn is between 0 and 5`() {
        // Given
        val item = Item("Backstage passes to a TAFKAL80ETC concert", 5, 10)
        val backstackPassesItemUpdater = BackstagePassesItemUpdater()

        // When
        backstackPassesItemUpdater.update(item)

        // Then
        assertEquals(13, item.quality)
    }

    @Test
    fun `test quality drops to 0 when sellIn is less than 0`() {
        // Given
        val item = Item("Backstage passes to a TAFKAL80ETC concert", 0, 10)
        val backstackPassesItemUpdater = BackstagePassesItemUpdater()

        // When
        backstackPassesItemUpdater.update(item)

        // Then
        assertEquals(0, item.quality)
    }

    @Test
    fun `test should decrease sellIn by 1`() {
        // Given
        val item = Item("Backstage passes to a TAFKAL80ETC concert", 10, 10)
        val backstackPassesItemUpdater = BackstagePassesItemUpdater()

        // When
        backstackPassesItemUpdater.update(item)

        // Then
        assertEquals(9, item.sellIn)
    }

    @Test
    fun `test quality of an item is never more than 50`() {
        // Given
        val item = Item("Backstage passes to a TAFKAL80ETC concert", 10, 50)
        val backstackPassesItemUpdater = BackstagePassesItemUpdater()

        // When
        backstackPassesItemUpdater.update(item)

        // Then
        assertEquals(50, item.quality)
    }
}