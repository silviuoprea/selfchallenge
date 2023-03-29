package com.worldcities;

public class Country extends Location{
    final String code;
    final Continent continent;
    public Country(int id, String name, String code1, Continent continent1) {
        super(id, name);
        this.code = code1;
        this.continent = continent1;
    }

    public String getCode() {
        return code;
    }

    public Continent getContinent() {
        return continent;
    }
}
