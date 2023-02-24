package Structures;
/**
 * Room class creates objects that register information about available rooms
 */
public abstract class Room {

    /**
     * Variables to capture relevant data like capacity, timeslots, room type and name
     */
    private int cap, start, end;
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

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj == null) return false;
        if(!(obj instanceof Room)) return false;
        Room newRoom = (Room) obj;
        System.out.println(newRoom.roomName + " " + roomName + " check ?: " + newRoom.roomName.equals(roomName));
        return (newRoom.roomName.equals(roomName));
    }
}
