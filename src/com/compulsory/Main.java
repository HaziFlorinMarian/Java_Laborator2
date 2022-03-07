package com.compulsory;

import com.company.ComputerLab;
import com.company.Event;
import com.company.LectureHall;

import java.util.Vector;

public class Main {
    public static void main(String[] args) {
        Vector<Event> events = new Vector<>();
        Vector<Room> rooms = new Vector<>();

        events.add(new Event("C1", 100, 8, 10));
        events.add(new Event("C2", 100, 10, 12));
        events.add(new Event("L1", 30, 8, 10));
        events.add(new Event("L2", 30, 8, 10));
        events.add(new Event("L3", 30, 10, 12));

        rooms.add(new Room("401", 30, RoomType.COMPUTER_LAB));
        rooms.add(new Room("403", 30, RoomType.COMPUTER_LAB));
        rooms.add(new Room("405", 30, RoomType.COMPUTER_LAB));
        rooms.add(new Room("309", 100, RoomType.LECTURE_HALL));

        for (Event e : events) {
            System.out.println(e.toString());
        }

        for (Room r : rooms) {
            System.out.println(r.toString());
        }
    }
}
