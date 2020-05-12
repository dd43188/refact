package com.water.gilded.rose.step3;

public class GildedRose2 {

    Item[] items;

    public GildedRose2(Item[] items) {
        this.items = items;
    }

    public void updateQuality() {
        for (int i = 0; i < items.length; i++) {
            items[i].updateQuality();
        }
    }
}