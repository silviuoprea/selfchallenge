package com.worldcities;

public class City extends Location{
    final Country country;
    final String capital;
    final int latitude, longitude;
    public City(int id, String name, Country country, String capital1, int latitude1, int longitude1) {
        super(id, name);
        this.country = country;
        this.capital = capital1;
        this.latitude = latitude1;
        this.longitude = longitude1;
    }

    public Country getCountry() {
        return country;
    }

    public String isCapital() {
        return capital;
    }

    public int getLatitude() {
        return latitude;
    }

    public int getLongitude() {
        return longitude;
    }
}
