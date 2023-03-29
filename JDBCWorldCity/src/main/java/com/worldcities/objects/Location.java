package com.worldcities.objects;

public abstract class Location {
    long id;
    String name;

    public Location(String name) {
        this.name = name;
    }

    public Location(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
