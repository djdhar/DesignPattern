package org.example.creational.factory;

public class VehicleFactory {
    public static Vehicle getVehicle(String type) {
        if("CAR".equals(type)) return new Car();
        if("CAB".equals(type)) return new Cab();
        if("TRUCK".equals(type)) return new Truck();
        return null;
    }
}
