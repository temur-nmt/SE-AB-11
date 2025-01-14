package com.gildedrose;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GildedRoseTest {

    @Test
    void foo() {
        Item[] items = new Item[] { new Item("foo", 0, 0) };
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }

    // Checks whether a normal Item reaches its supposed quality after one day
    @Test
    void should_DECREASEQUALITY_when_UPDATEQUALITY() {
        Item[] items = new Item[] {new Item ("A5 Wagyu", 2, 100)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals(99 ,app.items[0].getQuality());
    }

    // Checks whether a normal Item reaches its supposed quality at day 4
    @Test
    void should_LOOSEDOUBLEQUALITY_when_SELLINBELOWZERO() {
        Item[] items = new Item[] {new Item ("A5 Wagyu", 2, 100)};
        GildedRose app = new GildedRose(items);
        
        for (int i = 0; i < 4; i++) {
            app.updateQuality();
        }

        assertEquals(94 ,app.items[0].getQuality());
    }

    // checks whether the Quality of Brie increases by one until sellIn == 0, by two if  sellIn < 0
    @Test
    void should_INCREASEBRIEQUALITY_when_SELLINBELOWZERO() {
        Item[] items = new Item[] {new Item ("Aged Brie", 1, 0)};
        GildedRose app = new GildedRose(items);
        
        for (int i = 0; i < 7; i++) {
            app.updateQuality();
        }

        assertEquals(13 ,app.items[0].getQuality());
    }

    // checks whether Sulfuras retains its quality at day 100
    @Test
    void should_RETAINQUALITY_when_UPDATEQUALITY() {
        Item[] items = new Item[] {new Item ("Sulfuras, Hand of Ragnaros", 0, 80)};
        GildedRose app = new GildedRose(items);
        
        for (int i = 0; i < 100; i++) {
            app.updateQuality();
        }

        assertEquals(80 ,app.items[0].getQuality());
    }
}
