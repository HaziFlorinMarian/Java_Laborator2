package com.company;

public class ComputerLab extends Room {
    /**
     * Operating system installed on computers located in this lab.
     */
    public String operatingSystem;

    public String getOperatingSystem() {
        return operatingSystem;
    }

    public void setOperatingSystem(String operatingSystem) {
        this.operatingSystem = operatingSystem;
    }

    public ComputerLab(String name, int capacity) {
        super(name, capacity);
    }
}
