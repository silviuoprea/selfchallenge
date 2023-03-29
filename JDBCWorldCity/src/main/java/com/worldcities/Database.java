package com.worldcities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Database {
    private static final String URL =
            "jdbc:postgresql://localhost:5432/cities";
    private static final String USER = "postgres";
    private static final String PASSWORD = "password";
    private static Connection connection = null;

    private Database() {
    }

    public static Connection getConnection() throws SQLException {
        if(connection == null)
            createConnection();
        return connection;
    }

    private static void createConnection() {
        try {
            connection = DriverManager.getConnection(URL, USER, PASSWORD);
            connection.setAutoCommit(false);
        } catch (SQLException e) {
            System.err.println(e);
        }
    }

    public static void closeConnection() throws SQLException {
        connection.close();
    }

    public static void createTable(String tableName) throws SQLException {
        String sqlCreate = null;
        Connection connection1 = getConnection();
        switch(tableName)
        {
            case "continents": {
                sqlCreate = "CREATE TABLE IF NOT EXISTS " + tableName
                        + " (id VARCHAR(10), name VARCHAR(50))";
                break;
            }
            case "countries":
            {
                sqlCreate = "CREATE TABLE IF NOT EXISTS " + tableName
                        + " (id VARCHAR(10), name VARCHAR(50), code VARCHAR(10), continent VARCHAR(20))";
                break;
            }
            case "worldcities":{
                sqlCreate = "CREATE TABLE IF NOT EXISTS " + tableName
                        + " (id VARCHAR(10), name VARCHAR(50), country VARCHAR(10), capital VARCHAR(20), latitude VARCHAR(20), longitude VARCHAR(20))";
                break;
            }
                    
        }
        Statement stmt = connection1.createStatement();
        stmt.execute(sqlCreate);
    }
}

