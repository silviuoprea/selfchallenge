package com.worldcities.daos;

import com.worldcities.Database;
import com.worldcities.objects.City;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CityDAO implements GenericDAO<City> {
    private final List<City> cities = new ArrayList<>();

    @Override
    public Optional<City> get(long id) {
        return Optional.ofNullable(cities.get((int) id));
    }

    @Override
    public List<City> getAll() {
        return cities;
    }

    @Override
    public void create(City city) throws SQLException {
        cities.add(city);
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement(
                "insert into worldcities (name) values (?)")) {
            pstmt.setString(1, city.getName());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(City city, String[] params) {
        city.setName(Objects.requireNonNull(
                params[0], "Name cannot be null"));
    }

    @Override
    public void delete(City city) {
        cities.remove(city);
    }

    @Override
    public Integer findByName(String name) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select id from worldcities where name='" + name + "'")) {
            return rs.next() ? rs.getInt(1) : null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public String findById(long id) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select name from worldcities where id='" + id + "'")) {
            return rs.next() ? rs.getString(2) : null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
