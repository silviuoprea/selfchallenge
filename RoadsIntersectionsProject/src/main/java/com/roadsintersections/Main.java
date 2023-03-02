package com.roadsintersections;

import java.util.*;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        Intersection[] nodes = IntStream.rangeClosed(0, 8)
                .mapToObj(i -> new Intersection("v" + i) )
                .toArray(Intersection[]::new);
        Road[] roads = IntStream.rangeClosed(0, 15)
                .mapToObj(i -> new Road("e" + i, 2))
                .toArray(Road[]::new);
        List<Road> roadList = new ArrayList<>(Arrays.asList(roads));
        roadList.sort(((u, v) -> u.getLength().compareTo(v.getLength())));
        roads[7].setLength(1);
        roads[8].setLength(1);
        roads[9].setLength(1);
        roads[10].setLength(1);
        roads[11].setLength(1);
        roads[12].setLength(1);
        roads[13].setLength(3);
        roads[14].setLength(3);
        roads[15].setLength(3);
        for(Road road:roads)
            System.out.print("(" + road.getName() + " - " + road.getLength() + ") | ");
        System.out.println();
        for (Intersection node : nodes) {
            System.out.println(node.getName());
        }
    }
}