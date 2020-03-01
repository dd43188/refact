package com.onlineshop.m6.src.items;

public class Milk extends Item {

    @Override
    public double price() {
        return 1;
    }

    @Override
    public boolean isAgeRestrictedItem() {
        return false;
    }
}
