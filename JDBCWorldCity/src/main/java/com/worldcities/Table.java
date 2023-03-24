package com.worldcities;

import java.sql.SQLException;
import java.sql.Statement;

public class Table {
    static String name = "";
    private Table()
    {}

    public static String getName() {
        return name;
    }

    public static void setName(String name) {
        Table.name = name;
    }
}
