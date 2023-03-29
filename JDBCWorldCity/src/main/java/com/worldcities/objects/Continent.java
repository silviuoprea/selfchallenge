package com.worldcities.objects;


import com.worldcities.daos.ContinentDAO;

public class Continent extends Location {
    public Continent(String name){
        super(name);
    }
    public Continent(int id, String name) {
        super(id, name);
    }
    public void setName(String name)
    {
        this.name = name;
    }
}
