package com.company;


import java.util.Vector;

/**
 * We're using SortedSet as collection type to avoid duplicate entries (being a set) and also having directly ordered elements using our own attributes.
 */
public class Problem {
    public Vector<Event> events = new Vector<>();
    public Vector<Room> rooms = new Vector<>();

    /**
     * Here we're adding events into events set.
     */
    public void addEvent(Event event) {
        for (Event e : events) {
            if (e.equals(event)) {
                return;
            }
        }

        events.add(event);
    }

    /**
     * Here we're adding rooms into rooms set.
     */
    public void addRoom(Room room) {
        for (Room r : rooms) {
            if(r.equals(room)) {
                return;
            }
        }

        rooms.add(room);
    }

    public void PrintEvents() {
        for (Event e : events) {
            System.out.println(e.toString());
        }
    }

    public void PrintRooms() {
        for (Room r : rooms) {
            System.out.println(r.toString());
        }
    }
}