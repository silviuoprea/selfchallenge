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

    public int getStart() {
        return start;
    }

    public int getEnd() {
        return end;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Event)) return false;
        Event newEvent = (Event) obj;
        return (newEvent.eventName.equals(eventName));
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
