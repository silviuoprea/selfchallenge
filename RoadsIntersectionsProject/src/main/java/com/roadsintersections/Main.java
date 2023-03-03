package com.roadsintersections;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Set<Intersection> nodes = IntStream.rangeClosed(0, 8)
                .mapToObj(i -> new Intersection("v" + i) )
                .collect(Collectors.toSet());
        List<Road> roads = IntStream.rangeClosed(0, 15)
                .mapToObj(i -> new Road("e" + i, 2))
                .collect(Collectors.toList());
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
        System.out.println(roads.stream()
                .map(Road::getLength)
                .collect(Collectors.toList()));
        System.out.println(nodes.stream()
                .map(Intersection::getName)
                .collect(Collectors.toSet()));
        for(Road road:roads)
            System.out.print("(" + road.getName() + " - " + road.getLength() + ") | ");
        System.out.println();
    }
}