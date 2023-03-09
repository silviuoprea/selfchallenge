package org.bms;

import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;

public class Catalog implements Serializable {
    private String name;
    private final List<Item> items = new ArrayList<>();
    public Catalog() {
        super();
    }
    public Catalog(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Item> getItems() {
        return items;
    }

    public void add(Item item) {
        items.add(item);
    }
    public Item findById(String id) {
        return items.stream()
                .filter(d -> d.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
