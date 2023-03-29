package com.worldcities;

import javax.xml.crypto.Data;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try
        {
            Database.createTable("cities");
            Database.createTable("countries");
            Database.createTable("continents");
            Database.getConnection().commit();
            Database.getConnection().close();

        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}