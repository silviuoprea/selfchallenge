package Instances;

import Structures.*;

import java.util.ArrayList;
import java.util.List;

public class Problem {
    List<Event> upcomingEvents = new ArrayList<>();
    List<Room> availableRooms = new ArrayList<>();
    public Problem()
    {
        // empty constructor;
    }

    public Problem(List<Event> upcomingEvents, List<Room> availableRooms) {

        int sizeEvents = upcomingEvents.size(), sizeRooms = availableRooms.size();
        int flagEvent = 0, flagRoom = 0, index = 0;
        this.upcomingEvents.add(upcomingEvents.get(index));
        while (index < sizeEvents) {
            for (Event upcomingEvent : this.upcomingEvents) {
                if (upcomingEvent.equals(upcomingEvents.get(index))) {
                    flagEvent = 1;
                    System.out.println(upcomingEvents.get(index) + " already exists");
                    break;
                }
            }
            if(flagEvent == 0)
                this.upcomingEvents.add(upcomingEvents.get(index));
            else flagEvent = 0;
            index++;
        }
        index = 0;
        while (index < sizeRooms) {
            for (Room availableRoom : this.availableRooms) {
                if (availableRoom.equals(availableRooms.get(index))) {
                    flagRoom = 1;
                    System.out.println(availableRooms.get(index) + " already exists");
                    break;
                }
            }
            if(flagRoom == 0)
                this.availableRooms.add(availableRooms.get(index));
            else flagRoom = 0;
            index++;
        }
    }

    public List<Event> getUpcomingEvents() {
        return upcomingEvents;
    }

    public void setUpcomingEvents(Event upcomingEvent) {
        int size = upcomingEvents.size(), flag = 0;
        if(upcomingEvents.isEmpty())
        {
            upcomingEvents.add(upcomingEvent);
            flag = 1;
        }
        else {
            for (Event event : upcomingEvents)
                if (event.equals(upcomingEvent)) {
                    System.out.println(upcomingEvent + " already exists");
                    flag = 1;
                    break;
                }
        }
        if(flag == 0)
            upcomingEvents.add(upcomingEvent);
    }

    public List<Room> getAvailableRooms() {
        return availableRooms;
    }

    public void setAvailableRooms(Room availableRoom) {
        int size = availableRooms.size(), flag = 0;
        if(availableRooms.isEmpty())
        {
            availableRooms.add(availableRoom);
            flag = 1;
        }
        else {
            for (Room room : availableRooms)
                if (room.equals(availableRoom)) {
                    System.out.println(availableRoom + " already exists");
                    flag = 1;
                    break;
                }
        }
        if(flag == 0)
            availableRooms.add(availableRoom);
    }

    @Override
    public String toString() {
        return "Situation {" +
                "Upcoming Events=" + upcomingEvents +
                ", Available Rooms=" + availableRooms +
                '}';
    }
}
