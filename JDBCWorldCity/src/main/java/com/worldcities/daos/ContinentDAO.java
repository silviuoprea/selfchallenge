package com.worldcities.daos;

import com.worldcities.objects.Continent;
import com.worldcities.Database;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

public class ContinentDAO implements GenericDAO<Continent> {
    private final List<Continent> continents = new ArrayList<>();

    @Override
    public Optional<Continent> get(long id) {
        return Optional.ofNullable(continents.get((int) id));
    }

    @Override
    public List<Continent> getAll() {
        return continents;
    }

    @Override
    public void create(Continent continent) throws SQLException {
        continents.add(continent);
        Connection con = Database.getConnection();
        try (PreparedStatement pstmt = con.prepareStatement(
                     "insert into continents (name) values (?)")) {
            pstmt.setString(1, continent.getName());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public void update(Continent continent, String[] params) {
        continent.setName(Objects.requireNonNull(
                params[0], "Name cannot be null"));
    }

    @Override
    public void delete(Continent continent) {
        continents.remove(continent);
    }

    @Override
    public Integer findByName(String name) throws SQLException {
        Connection con = Database.getConnection();
        try (Statement stmt = con.createStatement();
             ResultSet rs = stmt.executeQuery(
                     "select id from continents where name='" + name + "'")) {
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
                     "select name from continents where id='" + id + "'")) {
            return rs.next() ? rs.getString(2) : null;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

}
