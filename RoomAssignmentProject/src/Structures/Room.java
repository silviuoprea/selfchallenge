package Structures;
/**
 * Room class creates objects that register information about available rooms
 */
public class Room {

    /**
     * Variables to capture relevant data like capacity, timeslots, room type and name
     */
    private int cap, start, end;
    private RoomType type;
    private String roomName;

    public Room(String roomName, int cap, RoomType type) {
        this.roomName = roomName;
        this.cap = cap;
        this.type = type;
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

    public RoomType getType() {
        return type;
    }

    public void setType(RoomType type) {
        this.type = type;
    }

    /**
     * {@inheritDoc}
     * Prints the room object as per specification provided in the readme
     */
    @Override
    public String toString() {
        if(type == RoomType.LECTURE_HALL)
            return roomName + '(' +
                    "cap=" + cap +
                    ", lecture hall)";
            else
            return roomName + '(' +
                    "cap=" + cap +
                    ", lab)";
    }
}
