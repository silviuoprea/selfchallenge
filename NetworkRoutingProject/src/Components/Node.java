package Components;

import java.util.*;

public abstract class Node implements Comparable<Node>{
    private String name;
    private final Map<Node, Integer> cost = new HashMap<>();

    public Node(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addCost(Node node, int value) {
        cost.put(node, value);
    }

    @Override
    public int compareTo(Node o) {
        return this.name.compareTo(o.name);
    }

    @Override
    public String toString() {
        return "Node {" +
                "name = '" + name + '\'' +
                ", cost = " + cost +
                "}";
    }
}
