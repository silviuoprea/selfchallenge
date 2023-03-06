package Structures;

import Instances.Problem;
import javafx.util.Pair;

import java.util.*;

public class Solution {
    private Set<Pair<Room, Event>> pairs = new HashSet<>();
    private Problem problem;

    public Solution(Problem problem) {
        this.problem = problem;
        resolveProblem(problem);
    }

    /**
     * Algorithm to solve the Room Assignment problem
     * Iteratively goes through all available events and rooms
     * and matches them together using the minimum number of rooms possible
     * <br>
     * TO-DO: Complexity is O(n * m * k), reduce to at most 2 nested loops
     * @param problem an instance of the problem
     * @return pairs of compatible events and rooms
     */
    public Set<Pair<Room, Event>> resolveProblem(Problem problem)
    {
        int flag = 0;
        Pair<Integer, Integer> timeSlot;
        Pair<Room, Event> miniSolution;
        for (Event event : this.problem.getUpcomingEvents()) {
            for (Room room : this.problem.getAvailableRooms()) {
                timeSlot = new Pair<>(event.getStart(), event.getEnd());
                if (!room.getTimeSlots().contains(timeSlot)) {
                    miniSolution = new Pair<>(room, event);
                    room.addTimeSlot(timeSlot);
                    for(Pair<Room, Event> pair : this.pairs)
                        if (pair.getValue().equals(miniSolution.getValue()))
                            flag = 1;
                    if (flag == 0)
                        this.pairs.add(miniSolution);
                    flag = 0;
                }
            }
        }
        return pairs;
    }

    @Override
    public String toString() {
        return "Solution for " + problem +
                " is to use the following pairs=" + pairs +
                '}';
    }
}
