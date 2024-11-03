package org.example.creational.builder.house;

import org.example.creational.builder.components.*;

public class HouseBuilder {
    private House house;
    public HouseBuilder() {
        house = new House();
    }
    public HouseBuilder buildDoors(Doors doors) {
        house.doors = doors;
        return this;
    }
    public HouseBuilder buildGarage(Garage garage) {
        house.garage = garage;
        return this;
    }
    public HouseBuilder buildRoofs(Roofs roofs) {
        house.roofs = roofs;
        return this;
    }
    public HouseBuilder buildWalls(Walls walls) {
        house.walls = walls;
        return this;
    }
    public HouseBuilder buildWindows(Windows windows) {
        house.windows = windows;
        return this;
    }
    public House build() {
        return house;
    }
}
