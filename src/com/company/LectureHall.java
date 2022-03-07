package com.company;

public class LectureHall extends Room {
    private boolean hasVideProjector;

    public LectureHall(String name, int capacity) {
        super(name, capacity);
    }

    public boolean getHasVideProjector() {
        return hasVideProjector;
    }

    public void setHasVideProjector(boolean hasVideProjector) {
        this.hasVideProjector = hasVideProjector;
    }
}
