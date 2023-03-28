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

    public static void createTable(String tableName, String id, String name, String code, String continent) throws SQLException {
        String sqlCreate;
        if(code.equals(""))
        {
            sqlCreate = "CREATE TABLE IF NOT EXISTS " + tableName
                    + "  (" + id + "           VARCHAR(10),"
                    + "   " + name + "         VARCHAR(50))";
        }
        else
        {
            sqlCreate = "CREATE TABLE IF NOT EXISTS " + tableName
                    + "  (" + id + "           VARCHAR(10),"
                    + "   " + name + "         VARCHAR(50),"
                    + "   "+ code + "          VARCHAR(10),"
                    + "   "+ continent + "     VARCHAR(20))";
        }

        Statement stmt = getConnection().createStatement();
        stmt.execute(sqlCreate);
        connection.commit();
    }
}

