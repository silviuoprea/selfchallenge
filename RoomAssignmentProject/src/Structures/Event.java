package Structures;

/**
 * Event class creates objects that register information about upcoming events
 */
public class Event {
    /**
     * Variables to capture relevant data like capacity, timeslots for the event and the name
     */
    private int size, start, end;
    private String eventName;


    public Event(String eventName, int size, int start, int end) {
        this.eventName = eventName;
        this.size = size;
        this.start = start;
        this.end = end;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setEnd(int end) {
        this.end = end;
    }
    /**
     * {@inheritDoc}
     * Prints the event object as per specification provided in the readme
     */
    @Override
    public String toString() {
        return eventName + "(" +
                "size=" + size +
                ", start=" + start +
                ", end=" + end +
                ')';
    }
}
