package org.example.creational.builder;

import org.example.creational.builder.components.*;
import org.example.creational.builder.house.House;
import org.example.creational.builder.house.HouseBuilder;

public class Driver {
    public static void main(String[] args) {
        HouseBuilder houseBuilder = new HouseBuilder();
        House house = houseBuilder.buildRoofs(new Roofs())
                .buildDoors(new Doors())
                .buildGarage(new Garage())
                .buildWalls(new Walls())
                .buildWindows(new Windows())
                .build();
        System.out.println(house);
    }
}
