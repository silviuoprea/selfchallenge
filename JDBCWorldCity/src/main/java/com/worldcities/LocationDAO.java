package com.worldcities;

import java.sql.*;

public abstract class LocationDAO {
    public void create(String[] columns, String tableName) throws SQLException {
        Connection con = Database.getConnection();
        if(columns.length == 2)
            try (PreparedStatement pstmt = con.prepareStatement(
                    "insert into " + tableName + " (name) values (?)")) {
                pstmt.setString(1, columns[0]);
                pstmt.executeUpdate();
            }
        else if(columns.length == 4)
            try (PreparedStatement pstmt = con.prepareStatement(
                    "insert into " + tableName + " (name, code, continent) values (?)")) {
                pstmt.setString(1, "'" + columns[0] + "', " + columns[1] + "', " + columns[2] + "'");
                pstmt.executeUpdate();
            }
        else if(columns.length == 6)
            try (PreparedStatement pstmt = con.prepareStatement(
                    "insert into " + tableName + " (name, country, capital, latitude, longitude) values (?)")) {
                pstmt.setString(1, "'" + columns[0] + "', " + columns[1] + "', " + columns[2] + "', " + columns[3] + "', " + columns[4] + "'");
                pstmt.executeUpdate();
            }

    }
    public Integer findByName(String name, String tableName) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select id from " + tableName + " where name='" + name + "'")) {
            return rs.next() ? rs.getInt(1) : null;
        }
    }
    public String findById(int id, String tableName) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select name from " + tableName + " where id='" + id + "'")) {
            return rs.next() ? rs.getString(2) : null;
        }
    }

    public abstract void create(String name, String tableName) throws SQLException;
}
