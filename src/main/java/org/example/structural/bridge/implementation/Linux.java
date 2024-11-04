package org.example.structural.bridge.implementation;

import org.example.structural.bridge.abstraction.OperatingSystem;

public class Linux implements OperatingSystem {
    @Override
    public void powerOn() {
        System.out.println("Power on Linux...");
    }

    @Override
    public void shutDown() {
        System.out.println("Shut down Linux...");
    }
}
