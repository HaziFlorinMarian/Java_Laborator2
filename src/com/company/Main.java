package com.company;


public class Main {
    public static void main(String args[]) {

        Problem pb = new Problem();

        pb.addEvent(new Event("C1", 100, 8, 10));
        pb.addEvent(new Event("C2", 100, 10, 12));
        pb.addEvent(new Event("L1", 30, 8, 10));
        pb.addEvent(new Event("L2", 30, 8, 10));
        pb.addEvent(new Event("L3", 30, 10, 12));

        pb.addRoom(new ComputerLab("401", 30));
        pb.addRoom(new ComputerLab("403", 30));
        pb.addRoom(new ComputerLab("405", 30));
        pb.addRoom(new LectureHall("309", 100));

//        pb.PrintEvents();
//        pb.PrintRooms();

        GreedySolution gs = new GreedySolution(pb);
        gs.ComputeSolution();
        gs.PrintSolution();
    }
}