package org.example.structural.bridge.abstraction;

public abstract class Device {
    public OperatingSystem operatingSystem;
    public Device(OperatingSystem operatingSystem) {
        this.operatingSystem = operatingSystem;
    }
    public abstract void bootUp();
    public abstract void bootDown();
}
