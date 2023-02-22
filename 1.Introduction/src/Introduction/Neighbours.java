package Introduction;

import java.util.ArrayList;
import java.util.List;

public class Neighbours {
    private String current;
    private final List<String> listOfNeighbours;

    public Neighbours(String current, List<String> listOfNeighbours)
    {
        this.current = current;
        this.listOfNeighbours = listOfNeighbours;
    }

    public void setCurrent(String current) {
        this.current = current;
    }

    public String getCurrent() {
        return current;
    }

    public void setListOfNeighbours(String neighbours) {
        this.listOfNeighbours.add(neighbours);
    }

    public List<String> getListOfNeighbours() {
        return listOfNeighbours;
    }

    public void printDataStructure()
    {
        System.out.println(current);
        System.out.println(listOfNeighbours);
    }
}
