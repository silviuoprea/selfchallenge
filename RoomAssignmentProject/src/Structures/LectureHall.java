package Structures;

public class LectureHall extends Room{
    private boolean hasProjector;

    public LectureHall(String roomName, int cap, boolean hasProjector) {
        super(roomName, cap);
        this.hasProjector = hasProjector;
    }

    @Override
    public String toString() {
        return "LectureHall(" + getRoomName() + ", cap=" + getCap() +
                ", hasProjector=" + hasProjector +
                ')';
    }
}
