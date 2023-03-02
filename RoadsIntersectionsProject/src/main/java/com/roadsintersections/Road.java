package com.roadsintersections;

import javafx.util.Pair;

import java.util.*;

public class Road {
    String name;
    int length;
    List<Pair<Intersection, Intersection>> intersections;

    public Road(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public Road(String name, int length, List<Pair<Intersection, Intersection>> intersections) {
        this.name = name;
        this.length = length;
        this.intersections = intersections;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public List<Pair<Intersection, Intersection>> getIntersections() {
        return intersections;
    }

    public void setIntersections(List<Pair<Intersection, Intersection>> intersections) {
        this.intersections = intersections;
    }
}
