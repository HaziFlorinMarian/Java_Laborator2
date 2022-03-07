package com.company;

import java.util.HashMap;
import java.util.Map;

/**
 * This class receives a problem and returns solutions.
 */
public class GreedySolution {
    private Problem problem;
    HashMap<Event, Room> solution = new HashMap<Event, Room>();

    GreedySolution(Problem problem) {
        this.problem = problem;
    }

    public void ComputeSolution() {
        HashMap<Room, Integer> roomInfo = new HashMap<Room, Integer>();

        problem.events.sort(Event::compare);

        for (Event e : problem.events) {
            for (Room r : problem.rooms) {
                if (roomInfo.containsKey(r)) {
                    if (e.getStart() >= roomInfo.get(r)) {
                        if (e.getSize() <= r.getCapacity()) {
                            solution.put(e, r);
                            roomInfo.put(r, e.getEnd());
                            break;
                        }
                    }
                }
                else {
                    if (e.getSize() <= r.getCapacity()) {
                        solution.put(e, r);
                        roomInfo.put(r, e.getEnd());
                        break;
                    }
                }
            }
        }
    }

    public void PrintSolution() {
        for (Map.Entry<Event, Room> entry : solution.entrySet()) {
            Event key = entry.getKey();
            Room value = entry.getValue();

            System.out.format("%s (size: %d, start: %d, end: %d) -> %s (capacity: %d)\n", key.getName(), key.getSize(), key.getStart(), key.getEnd(), value.getName(), value.getCapacity());
        }
    }
}
