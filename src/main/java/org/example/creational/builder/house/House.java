package org.example.creational.builder.house;

import org.example.creational.builder.components.*;

public class House {
    protected Doors doors;
    protected Windows windows;
    protected Roofs roofs;
    protected Walls walls;
    protected Garage garage;

    @Override
    public String toString() {
        return "House{" +
                "doors=" + doors +
                ", windows=" + windows +
                ", roofs=" + roofs +
                ", walls=" + walls +
                ", garage=" + garage +
                '}';
    }
}
