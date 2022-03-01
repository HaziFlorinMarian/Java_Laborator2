package com.company;

public abstract class Room {
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Room room = (Room) o;

        return getName().equals(room.getName());
    }

    @Override
    public int hashCode() {
        return getName().hashCode();
    }

    protected int size, start, end;
    protected String name;

    @Override
    public String toString() {
        return "com.company.Room{" +
                "size=" + size +
                ", start=" + start +
                ", end=" + end +
                ", name='" + name + '\'' +
                '}';
    }

    public enum RoomType {
        LECTURE_HALL,
        COMPUTER_LAB;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnd() {
        return end;
    }

    public int getStart() {
        return start;
    }

    public int getSize() {
        return size;
    }

    public String getName() {
        return name;
    }

    public Room(String name) {
        this.name = name;
    }
}