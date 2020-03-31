package com.water.gilded.rose;

import org.approvaltests.Approvals;
import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

import static org.junit.Assert.*;

public class GildedRoseTest {

    @Test
    public void updateQuality() {

        CombinationApprovals.verifyAllCombinations(
                this::doUpdate,
                new String[]{"foo", "Aged Brie", "Sulfuras, Hand of Ragnaros", "hjm"},
                new Integer[]{-1, 0},
                new Integer[]{0, 1, 100});
    }

    private String doUpdate(String name, int sellIn, int quality) {
        Item[] items = new Item[]{new Item(name, sellIn, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return items[0].toString();
    }

    @Test
    public void updateQualityA() {
        Item[] items = new Item[]{new Item("foo", 0, 0)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        assertEquals("foo", app.items[0].name);
    }
}