import Components.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Node v1 = new Computer("Computer A", null, "100.000.100.100", 1024);
        Node v2 = new Router("Router A", null);
        Node v3 = new Switch("Switch A", null);
        Node v4 = new Switch("Switch B", null);
        Node v5 = new Router("Router B", null);
        Node v6 = new Computer("Computer B", null, "100.000.100.100", 1024);
        List<Node> nodeList = new ArrayList<>(Arrays.asList(v1, v2, v3, v4, v5, v6));
        Network basicNetwork = new Network(nodeList);
        System.out.println(basicNetwork);
    }
}