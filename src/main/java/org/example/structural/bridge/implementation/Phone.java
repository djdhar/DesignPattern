package org.example.structural.bridge.implementation;

import org.example.structural.bridge.abstraction.Device;
import org.example.structural.bridge.abstraction.OperatingSystem;

public class Phone extends Device {
    public Phone(OperatingSystem operatingSystem) {
        super(operatingSystem);
    }

    @Override
    public void bootUp() {
        System.out.println("Booting up phone...");
        operatingSystem.powerOn();
    }

    @Override
    public void bootDown() {
        operatingSystem.shutDown();
        System.out.println("Booting down phone...");
    }
}
