package Components;
import Interfaces.*;
import java.util.*;

public class Network{
    private final List<Node> nodes;

    public Network(List<Node> nodes) {
        this.nodes = nodes;
    }

    public List<Node> generateIdentifiableNodes() {
        List<Identifiable> identifiableNodes = new ArrayList<>();
        for (Node node : nodes) {
            if (node instanceof Identifiable) {
                identifiableNodes.add((Identifiable) node);
            }
        }
        identifiableNodes.sort(Comparator.comparing(Identifiable::getAddress, Comparator.nullsFirst(Comparator.naturalOrder())));

        List<Node> identifiableNodesAsNode = new ArrayList<>();

        for (Identifiable node : identifiableNodes) {
            Node myNode = (Node) node;
            identifiableNodesAsNode.add(myNode);
        }

        return identifiableNodesAsNode;
    }

    @Override
    public String toString() {
        return "Network contains the following " +
                "nodes = " + nodes;
    }
}
