package com.worldcities.objects;

public class City extends Location {
    final Country country;
    final boolean capital;
    final double latitude, longitude;
    public City(int id, String name, Country country, boolean capital1, double latitude1, double longitude1) {
        super(id, name);
        this.country = country;
        this.capital = capital1;
        this.latitude = latitude1;
        this.longitude = longitude1;
    }

    public Country getCountry() {
        return country;
    }

    public boolean isCapital() {
        return capital;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setName(String name) {
        this.name = name;
    }
}
