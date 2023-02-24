package Structures;

import Instances.Problem;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    private Map<Room, Event> pairs = new HashMap<Room, Event>();

    public Solution(Map<Room, Event> pairs) {
        this.pairs = pairs;
    }

    public Map<Room, Event> getPairs() {
        return pairs;
    }

    public void setPairs(Map<Room, Event> pairs) {
        this.pairs = pairs;
    }

    public Map<Room, Event> resolveProblem(Problem problem)
    {
        System.out.println("not resolved yet");
        return null;
    }

    @Override
    public String toString() {
        return "Solution " +
                "pairs=" + pairs +
                '}';
    }
}
