package com.compulsory;

public class Event {
    private String name;
    private int participants;
    private int start;
    private int end;

    public Event(String name, int participants, int start, int end) {
        this.name = name;
        this.participants = participants;
        this.start = start;
        this.end = end;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", participants=" + participants +
                ", start=" + start +
                ", end=" + end +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getParticipants() {
        return participants;
    }

    public void setParticipants(int participants) {
        this.participants = participants;
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
}
