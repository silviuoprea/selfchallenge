import Instances.Problem;
import Structures.Event;
import Structures.Room;
import Structures.RoomType;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Event C1 = new Event("C1", 100, 8, 10);
        Event C2 = new Event("C2", 100, 10, 12);
        Event L1 = new Event("L1", 30, 8, 10);
        Event L2 = new Event("L2", 30, 8, 10);
        Event L3 = new Event("L3", 30, 10, 12);
        System.out.println(C1);
        System.out.println(C2);
        System.out.println(L1);
        System.out.println(L2);
        System.out.println(L3);
        Room C401 = new Room("401", 30, RoomType.LAB);
        Room C403 = new Room("403", 30, RoomType.LAB);
        Room C405 = new Room("405", 30, RoomType.LAB);
        Room C309 = new Room("309", 100, RoomType.LECTURE_HALL);
        System.out.println(C401);
        System.out.println(C403);
        System.out.println(C405);
        System.out.println(C309);
        Problem p1 = new Problem(Arrays.asList(C1, C2, C1, C2, C1), Arrays.asList(C309, C405, C405));
        p1.setAvailableRooms(C405);
        p1.setAvailableRooms(C405);
        System.out.println(p1.getUpcomingEvents());
        System.out.println(p1.getAvailableRooms());
        p1.setUpcomingEvents(C1);
        p1.setUpcomingEvents(C2);
        System.out.println(p1);

    }
}