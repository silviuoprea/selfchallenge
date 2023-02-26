package Components;

import java.util.Map;

public class Router extends Node{
    int storage;

    public Router(String name, Map<Node, Integer> cost) {
        super(name, cost);
    }
}
