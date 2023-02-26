package Components;

import java.util.*;

public class Network {
    private List<Node> nodes = new ArrayList<>();

    public Network(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Node> getNodes() {
        return nodes;
    }

    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }
    public void addNodes(Node node) {
        nodes.add(node);
    }

    @Override
    public String toString() {
        return "Network contains the following " +
                "nodes = " + nodes;
    }
}
