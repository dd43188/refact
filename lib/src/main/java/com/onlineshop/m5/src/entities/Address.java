package com.onlineshop.m5.src.entities;


import com.onlineshop.m5.src.country.Country;

public class Address {

    private Country country;
    private String province;
    private String street;

    public Address(Country country){
        this.country = country;
    }

    public Address(Country country, String province, String street){
        this.country = country;
        this.province = province;
        this.street = street;
    }

    public String getStreet() {
        return street;
    }

    public Country getCountry() {
        return country;
    }

    public String getProvince() {
        return province;
    }

}
