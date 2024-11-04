package org.example.structural.bridge;

import org.example.structural.bridge.abstraction.Device;
import org.example.structural.bridge.implementation.Computer;
import org.example.structural.bridge.implementation.Linux;
import org.example.structural.bridge.implementation.Phone;
import org.example.structural.bridge.implementation.Windows;

public class Driver {
    public static void main(String[] args) {
        Device computerW = new Computer(new Windows());
        Device computerL = new Computer(new Linux());
        Device phoneW = new Phone(new Windows());
        Device phoneL = new Phone(new Linux());
        computerW.bootUp();
        computerW.bootDown();
        computerL.bootUp();
        computerL.bootDown();
        phoneW.bootUp();
        phoneW.bootDown();
        phoneL.bootUp();
        phoneL.bootDown();
    }
}
