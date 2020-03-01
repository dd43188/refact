package com.onlineshop.m6.src.country;

/**
 * Legal age for alcohol is 21
 */
public class US extends Country {

    @Override
    public int getMinimumLegalDrinkingAge() {
        return 21;
    }

}