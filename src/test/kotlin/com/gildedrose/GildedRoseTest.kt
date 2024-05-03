package com.gildedrose

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class GildedRoseTest {

    @Test
    fun `test normal item quality degrades`() {
        val items = listOf(Item("+5 Dexterity Vest", 10, 20))
        val app = GildedRose(items)
        app.updateQuality()
        val updatedItem = items[0]

        assertEquals(19, updatedItem.quality)
        assertEquals(9, updatedItem.sellIn)
    }

    @Test
    fun `test normal item quality degrades twice as fast after sellIn`() {
        val items = listOf(Item("+5 Dexterity Vest", 0, 20))
        val app = GildedRose(items)
        app.updateQuality()
        val updatedItem = items[0]

        assertEquals(18, updatedItem.quality)
        assertEquals(-1, updatedItem.sellIn)
    }

    @Test
    fun `test quality of an item is never negative`() {
        val items = listOf(Item("+5 Dexterity Vest", 10, 0))
        val app = GildedRose(items)
        app.updateQuality()
        val updatedItem = items[0]

        assertEquals(0, updatedItem.quality)
        assertEquals(9, updatedItem.sellIn)
    }

    @Test
    fun `test quality of an item is never more than 50`() {
        val items = listOf(Item("Aged Brie", 10, 50))
        val app = GildedRose(items)
        app.updateQuality()
        val updatedItem = items[0]

        assertEquals(50, updatedItem.quality)
        assertEquals(9, updatedItem.sellIn)
    }

    @Test
    fun `test aged brie quality increases the older it gets`() {
        val items = listOf(Item("Aged Brie", 2, 0))
        val app = GildedRose(items)
        app.updateQuality()
        val updatedItem = items[0]

        assertEquals(1, updatedItem.quality)
        assertEquals(1, updatedItem.sellIn)
    }

    @Test
    fun `test sulfuras never has to be sold or decreases in quality`() {
        val items = listOf(Item("Sulfuras, Hand of Ragnaros", 0, 80))
        val app = GildedRose(items)
        app.updateQuality()
        val updatedItem = items[0]

        assertEquals(80, updatedItem.quality)
        assertEquals(0, updatedItem.sellIn)
    }

    @Test
    fun `test backstage passes quality increases by 1 when sellIn is more than 10 days`() {
        val items = listOf(Item("Backstage passes to a TAFKAL80ETC concert", 15, 20))
        val app = GildedRose(items)
        app.updateQuality()
        val updatedItem = items[0]

        assertEquals(21, updatedItem.quality)
        assertEquals(14, updatedItem.sellIn)
    }

    @Test
    fun `test backstage passes quality increases by 2 when sellIn is 10 days or less`() {
        val items = listOf(Item("Backstage passes to a TAFKAL80ETC concert", 10, 20))
        val app = GildedRose(items)
        app.updateQuality()
        val updatedItem = items[0]

        assertEquals(22, updatedItem.quality)
        assertEquals(9, updatedItem.sellIn)
    }

    @Test
    fun `test backstack passes quality increases by 3 when sellIn is 5 days or less`() {
        val items = listOf(Item("Backstage passes to a TAFKAL80ETC concert", 5, 20))
        val app = GildedRose(items)
        app.updateQuality()
        val updatedItem = items[0]

        assertEquals(23, updatedItem.quality)
        assertEquals(4, updatedItem.sellIn)
    }

    @Test
    fun `test backstage passes quality drops to 0 after the concert`() {
        val items = listOf(Item("Backstage passes to a TAFKAL80ETC concert", 0, 20))
        val app = GildedRose(items)
        app.updateQuality()
        val updatedItem = items[0]

        assertEquals(0, updatedItem.quality)
        assertEquals(-1, updatedItem.sellIn)
    }

    @Test
    fun `test conjured items degrade in quality twice as fast as normal items`() {
        val items = listOf(Item("Conjured Mana Cake", 3, 6))
        val app = GildedRose(items)
        app.updateQuality()
        val updatedItem = items[0]

        assertEquals(4, updatedItem.quality)
        assertEquals(2, updatedItem.sellIn)
    }
}


