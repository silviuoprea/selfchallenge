package Structures;

import javafx.util.Pair;

import java.util.HashSet;
import java.util.Set;

/**
 * Room class creates objects that register information about available rooms
 */
public abstract class Room {

    /**
     * Variables to capture relevant data like capacity, timeslots, room type and name
     */
    private int cap;
    Set<Pair<Integer, Integer>> timeSlots = new HashSet<>();
    private String roomName;

    public Room(String roomName, int cap) {
        this.roomName = roomName;
        this.cap = cap;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    public Set<Pair<Integer, Integer>> getTimeSlots() {
        return timeSlots;
    }

    public void setTimeSlots(Set<Pair<Integer, Integer>> timeSlots) {
        this.timeSlots = timeSlots;
    }

    public void addTimeSlot(Pair<Integer, Integer> timeSlot)
    {
        this.timeSlots.add(timeSlot);
    }


    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Room)) return false;
        Room newRoom = (Room) obj;
        return (newRoom.roomName.equals(roomName));
    }
}
