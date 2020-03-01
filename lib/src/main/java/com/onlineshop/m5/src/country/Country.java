package com.onlineshop.m5.src.country;

public abstract class Country {

    public abstract int getMinimumLegalDrinkingAge();

    @Override
    public String toString(){
        return this.getClass().getSimpleName();
    }
}
