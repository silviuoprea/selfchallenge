package com.worldcities;

import com.worldcities.daos.*;
import com.worldcities.objects.*;

import java.sql.SQLException;
import java.util.Optional;

public class Main {
    public static GenericDAO<Continent> newContinent;
    public static void main(String[] args) {

        try
        {
            Database.createTable("cities");
            Database.createTable("countries");
            Database.createTable("continents");
            newContinent = new ContinentDAO();
            newContinent.create(new Continent("Europe"));
            Database.getConnection().commit();
            Database.closeConnection();

        } catch (SQLException e) {
            System.err.println(e);
        }
        Continent continent = getContinent(0);
        System.out.println(continent.getName());
    }



    private static Continent getContinent(long id) {
        Optional<Continent> user = newContinent.get(id);

        return user.orElseGet(
                () -> new Continent(99999, "no-continent"));
    }
}