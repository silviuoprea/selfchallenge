package com.roadsintersections;
import net.datafaker.Faker;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        int value = 0;
        Faker faker = new Faker();
        Set<Intersection> nodes = IntStream.rangeClosed(0, 8)
                .mapToObj(i -> new Intersection(faker.onePiece().akumasNoMi()))
                .collect(Collectors.toSet());
        LinkedList<Road> roads = IntStream.rangeClosed(0, 15)
                .mapToObj(i -> new Road(faker.address().streetAddress(), 2))
                .collect(Collectors.toCollection(LinkedList::new));
        Intersection[] toAdd = nodes.toArray(new Intersection[0]);
        roads.get(0).setIntersections(toAdd[0]);
        roads.get(0).setIntersections(toAdd[1]);
        roads.get(0).setIntersections(toAdd[2]);
        roads.get(1).setIntersections(toAdd[0]);
        roads.get(1).setIntersections(toAdd[2]);
        roads.get(2).setIntersections(toAdd[0]);
        roads.get(2).setIntersections(toAdd[3]);
        roads.get(7).setLength(1);
        roads.get(8).setLength(1);
        roads.get(9).setLength(1);
        roads.get(10).setLength(1);
        roads.get(11).setLength(1);
        roads.get(12).setLength(1);
        roads.get(13).setLength(3);
        roads.get(14).setLength(3);
        roads.get(15).setLength(3);
        roads.sort((Comparator.comparing(Road::getLength)));

        List<Road> query = roads.stream()
                .filter(r -> r.length > value)
                .filter(r -> r.getIntersections().size() > 2)
                .collect(Collectors.toCollection(ArrayList::new));
        System.out.println(roads.stream()
                .map(Road::getLength)
                .collect(Collectors.toList()));
        System.out.println(nodes.stream()
                .map(Intersection::getName)
                .collect(Collectors.toSet()));
        for(Road road:roads)
            System.out.print("(" + road.getName() + " - " + road.getLength() + ") | ");
        City iasi = new City("Iasi", nodes, roads);
        System.out.println();
        for(Road road:query)
            System.out.print("(" + road.getName() + " - " + road.getLength() + ") | ");
    }
}