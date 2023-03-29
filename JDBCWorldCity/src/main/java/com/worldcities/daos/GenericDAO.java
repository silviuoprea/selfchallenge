package com.worldcities.daos;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public interface GenericDAO<T> {
    Optional<T> get(long id);

    List<T> getAll();

    void create(T t) throws SQLException;

    void update(T t, String[] params);

    void delete(T t);

    Integer findByName(String name) throws SQLException;
    String findById(long id) throws SQLException;
}
