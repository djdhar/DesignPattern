package org.example.creational.factory;

import java.util.Objects;

public class Driver {
    public static void main(String[] args) {
        Vehicle vehicle;
        vehicle = VehicleFactory.getVehicle("CAR");
        if(Objects.nonNull(vehicle)) vehicle.drive();
        vehicle = VehicleFactory.getVehicle("CAB");
        if(Objects.nonNull(vehicle)) vehicle.drive();
        vehicle = VehicleFactory.getVehicle("TRUCK");
        if(Objects.nonNull(vehicle)) vehicle.drive();
        vehicle = VehicleFactory.getVehicle("ERROR");
        if(Objects.nonNull(vehicle)) vehicle.drive();
    }
}
