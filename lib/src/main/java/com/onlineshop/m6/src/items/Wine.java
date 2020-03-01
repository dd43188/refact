package com.onlineshop.m6.src.items;

public class Wine extends Item {

    @Override
    public double price() {
        return 3;
    }

    @Override
    public boolean isAgeRestrictedItem() {
        return true;
    }
}