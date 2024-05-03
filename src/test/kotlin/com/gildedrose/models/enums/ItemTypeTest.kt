package com.gildedrose.models.enums

import org.junit.jupiter.api.Test

internal class ItemTypeTest {
    @Test
    fun `test value of AgedBrie`() {
        // Given
        val itemType = ItemType.AGED_BRIE

        // When
        val value = itemType.value

        // Then
        assert(value == "Aged Brie")
    }

    @Test
    fun `test value of Sulfuras`() {
        // Given
        val itemType = ItemType.SULFURAS

        // When
        val value = itemType.value

        // Then
        assert(value == "Sulfuras, Hand of Ragnaros")
    }

    @Test
    fun `test value of BackstagePasses`() {
        // Given
        val itemType = ItemType.BACKSTAGE_PASSES

        // When
        val value = itemType.value

        // Then
        assert(value == "Backstage passes to a TAFKAL80ETC concert")
    }

    @Test
    fun `test value of Conjured`() {
        // Given
        val itemType = ItemType.CONJURED

        // When
        val value = itemType.value

        // Then
        assert(value == "Conjured Mana Cake")
    }

    @Test
    fun `test value of Normal`() {
        // Given
        val itemType = ItemType.NORMAL

        // When
        val value = itemType.value

        // Then
        assert(value == null)
    }

    @Test
    fun `test fromValue with Aged Brie`() {
        // Given
        val value = "Aged Brie"

        // When
        val itemType = ItemType.fromValue(value)

        // Then
        assert(itemType == ItemType.AGED_BRIE)
    }

    @Test
    fun `test fromValue with Sulfuras`() {
        // Given
        val value = "Sulfuras, Hand of Ragnaros"

        // When
        val itemType = ItemType.fromValue(value)

        // Then
        assert(itemType == ItemType.SULFURAS)
    }

    @Test
    fun `test fromValue with Backstage passes`() {
        // Given
        val value = "Backstage passes to a TAFKAL80ETC concert"

        // When
        val itemType = ItemType.fromValue(value)

        // Then
        assert(itemType == ItemType.BACKSTAGE_PASSES)
    }

    @Test
    fun `test fromValue with Conjured`() {
        // Given
        val value = "Conjured Mana Cake"

        // When
        val itemType = ItemType.fromValue(value)

        // Then
        assert(itemType == ItemType.CONJURED)
    }

    @Test
    fun `test fromValue with other`() {
        // Given
        val value = "Normal"

        // When
        val itemType = ItemType.fromValue(value)

        // Then
        assert(itemType == ItemType.NORMAL)
    }
}