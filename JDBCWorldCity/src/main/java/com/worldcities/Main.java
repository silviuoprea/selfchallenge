package com.worldcities;

import javax.xml.crypto.Data;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {

        try
        {
            Database.createTable("countries", "id", "name", "code", "continent");
            Database.createTable("continents", "id", "name", "", "");
            Database.getConnection().commit();
            Database.getConnection().close();

        } catch (SQLException e) {
            System.err.println(e);
        }
    }
}