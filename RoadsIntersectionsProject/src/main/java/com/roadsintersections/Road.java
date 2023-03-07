package com.roadsintersections;

import javafx.util.Pair;

import java.util.*;

public class Road implements Comparable<Road>{
    String name;
    int length;
    Set<Intersection> intersections = new HashSet<>();

    public Road(String name, int length) {
        this.name = name;
        this.length = length;
    }

    public Road(String name, int length, Set<Intersection> intersections) {
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

    public Set<Intersection> getIntersections() {
        return intersections;
    }

    public void setIntersections(Intersection intersections) {
        this.intersections.add(intersections);
    }

    @Override
    public int compareTo(Road o) {
        return Integer.compare(getLength(), o.getLength());
    }
}
