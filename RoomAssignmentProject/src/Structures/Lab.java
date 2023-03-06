package Structures;

public class Lab extends Room{
    private OperatingSystems operatingSystem;

    public Lab(String roomName, int cap, OperatingSystems operatingSystem) {
        super(roomName, cap);
        this.operatingSystem = operatingSystem;
    }

    @Override
    public String toString() {
        return "Lab(" + getRoomName() + ", cap=" + getCap() +
                ", operatingSystem=" + operatingSystem +
                ')';
    }
}
