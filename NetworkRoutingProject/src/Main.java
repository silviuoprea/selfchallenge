import Components.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Node v1 = new Computer("Computer A", new HashMap<>(), "100.000.100.100", 1024);
        Node v2 = new Router("Router A", new HashMap<>());
        Node v3 = new Switch("Switch A", new HashMap<>());
        Node v4 = new Switch("Switch B", new HashMap<>());
        Node v5 = new Router("Router B", new HashMap<>());
        Node v6 = new Computer("Computer B", new HashMap<>(), "100.000.100.100", 1024);
        v1.addCost(v2, 10);
        v1.addCost(v3, 50);
        v2.addCost(v3, 20);
        v2.addCost(v4, 20);
        v2.addCost(v5, 20);
        v3.addCost(v4, 10);
        v4.addCost(v5, 30);
        v4.addCost(v6, 10);
        v5.addCost(v6, 20);
        System.out.println(((Computer) v1).getStorageCapacity("Mega"));
        System.out.println(((Computer) v1).getAddress());
        List<Node> nodeList = new ArrayList<>(Arrays.asList(v1, v2, v3, v4, v5, v6));
        Network basicNetwork = new Network(nodeList);
        System.out.println(basicNetwork);
    }
}