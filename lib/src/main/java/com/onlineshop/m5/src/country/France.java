package com.onlineshop.m5.src.country;

/**
 * Legal age for alcohol is 18
 */
public class France extends Country {

    @Override
    public int getMinimumLegalDrinkingAge() {
        return 18;
    }

}
