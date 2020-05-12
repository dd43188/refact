package com.water.gilded.rose;

import org.approvaltests.combinations.CombinationApprovals;
import org.junit.Test;

public class GildedRoseTest {

    @Test
    public void updateQuality() {

        CombinationApprovals.verifyAllCombinations(
                this::doUpdate,
                new String[]{"foo", "Aged Brie", "Sulfuras, Hand of Ragnaros", "hjm", /**"Backstage passes to a TAFKAL80ETC concert"**/},
                new Integer[]{-1, 0, 5, 6, 10, 11},
                new Integer[]{0, 1, 49, 50});
    }

    private String doUpdate(String name, int sellIn, int quality) {
        Item[] items = new Item[]{new Item(name, sellIn, quality)};
        GildedRose app = new GildedRose(items);
        app.updateQuality();
        return items[0].toString();
    }
}