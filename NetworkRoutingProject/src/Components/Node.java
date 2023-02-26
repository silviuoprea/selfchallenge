package Components;

import java.util.*;

public abstract class Node implements Comparable<Node>{
    private String name;
    private Map<Node, Integer> cost = new HashMap<>();

    public Node(String name, Map<Node, Integer> cost) {
        this.name = name;
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Map<Node, Integer> getCost() {
        return cost;
    }

    public void setCost(Map<Node, Integer> cost) {
        this.cost = cost;
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
