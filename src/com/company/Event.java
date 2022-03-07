package com.company;

public class Event {
    private int size, start, end;
    private String name;

    public Event(String name, int size, int start, int end) {
        this.name = name;
        this.size = size;
        this.start = start;
        this.end = end;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEnd() {
        return end;
    }

    public void setEnd(int end) {
        this.end = end;
    }

    public int getStart() {
        return start;
    }

    public void setStart(int start) {
        this.start = start;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Event event = (Event) o;

        if (getSize() != event.getSize()) return false;
        if (getStart() != event.getStart()) return false;
        if (getEnd() != event.getEnd()) return false;
        return getName() != null ? getName().equals(event.getName()) : event.getName() == null;
    }

    @Override
    public String toString() {
        return "Event{" +
                "size=" + size +
                ", start=" + start +
                ", end=" + end +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        int result = getSize();
        result = 31 * result + getStart();
        result = 31 * result + getEnd();
        result = 31 * result + (getName() != null ? getName().hashCode() : 0);
        return result;
    }

    /**
     * Function required to sort vector of events in Solution class.
     * @param e another object of the same type
     * @return exactly as strcmp() from C++
     */
    public int compare(Event e) {
        if (this.getStart() > e.getStart()) {
            return 1;
        }
        else if (this.getStart() < e.getStart()) {
            return -1;
        }
        else {
            return 0;
        }
    }
}