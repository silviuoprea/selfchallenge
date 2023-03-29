package com.worldcities.daos;

import com.worldcities.Database;
import com.worldcities.objects.City;
import com.worldcities.objects.Country;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class CountryDAO implements GenericDAO<Country> {
    private final List<Country> countries = new ArrayList<>();

    @Override
    public Optional<Country> get(long id) {
        return Optional.ofNullable(countries.get((int) id));
    }

    @Override
    public List<Country> getAll() {
        return countries;
    }

    @Override
    public void create(Country country) throws SQLException {
        countries.add(country);
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement(
                "insert into countries (name) values (?)")) {
            pstmt.setString(1, country.getName());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Country country, String[] params) {
        country.setName(Objects.requireNonNull(
                params[0], "Name cannot be null"));
    }

    @Override
    public void delete(Country city) {
        countries.remove(city);
    }

    @Override
    public Integer findByName(String name) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select id from countries where name='" + name + "'")) {
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
                     "select name from countries where id='" + id + "'")) {
            return rs.next() ? rs.getString(2) : null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
