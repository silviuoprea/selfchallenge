package com.worldcities;

import com.worldcities.daos.*;
import com.worldcities.objects.*;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLException;
import java.util.Optional;

public class Main {
    public static GenericDAO<Continent> newContinent;
    public static void main(String[] args) {

        ContinentDAO continents = new ContinentDAO();
        CountryDAO countries = new CountryDAO();
        CityDAO cities = new CityDAO();

        BufferedReader bufferedReader;
        try {

            Database.createTable("cities");
            Database.createTable("countries");
            Database.createTable("continents");
            bufferedReader = new BufferedReader(new FileReader("\\src\\main\\resources\\concap.csv"));

            String line;
            int id = 0;

            while ((line = bufferedReader.readLine()) != null) {
                String[] tempArr = line.split(",");

                String countryName = tempArr[0];
                String capitalName = tempArr[1];
                double capitalLatitude = Double.parseDouble(tempArr[2]);
                double capitalLongitude = Double.parseDouble(tempArr[3]);
                String countryCode = tempArr[4];
                String continentName = tempArr[5];

                Continent continent = new Continent(continentName);

                if (continents.findByName(continentName) == null) {
                    continents.create(continent);
                }

                Country country = new Country(id, countryName, countryCode, continent);

                if (countries.findByName(countryName) == null) {
                    countries.create(country);
                }

                City city = new City(1, capitalName, country, true, capitalLatitude, capitalLongitude);

                if (cities.findByName(capitalName) == null) {
                    cities.create(city);
                }

                Database.getConnection().commit();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println(e);
        }
    }
    private static Continent getContinent(long id) {
        Optional<Continent> user = newContinent.get(id);

        return user.orElseGet(
                () -> new Continent(99999, "no-continent"));
    }
}