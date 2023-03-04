package com.roadsintersections;

import java.util.*;

public class City {
    private String name;
    Set<Intersection> intersections;
    List<Road> roads;

    public City(String name, Set<Intersection> intersections, List<Road> roads) {
        this.name = name;
        this.intersections = intersections;
        this.roads = roads;
    }

    public City(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Intersection> getIntersections() {
        return intersections;
    }

    public void setIntersections(Set<Intersection> intersections) {
        this.intersections = intersections;
    }

    public List<Road> getRoads() {
        return roads;
    }

    public void setRoads(List<Road> roads) {
        this.roads = roads;
    }
}
