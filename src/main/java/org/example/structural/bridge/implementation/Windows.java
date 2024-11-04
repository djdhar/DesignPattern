package org.example.structural.bridge.implementation;

import org.example.structural.bridge.abstraction.OperatingSystem;

public class Windows implements OperatingSystem {

    @Override
    public void powerOn() {
        System.out.println("Power on Windows...");
    }

    @Override
    public void shutDown() {
        System.out.println("Shut down Windows...");
    }
}
