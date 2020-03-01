package com.onlineshop.m5.src.items;

public class Cheese extends Item {
    
    public double price() {
        return 2.5;
    }

    @Override
    public boolean isAgeRestrictedItem() {
        return false;
    }
}
