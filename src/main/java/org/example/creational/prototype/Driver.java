package org.example.creational.prototype;

public class Driver {
    public static void main(String[] args) {
        ShapeCache.loadCache();
        ShapeCache.getShape(1).draw();
        ShapeCache.getShape(2).draw();
        ShapeCache.getShape(1).draw();
        ShapeCache.getShape(2).draw();
    }
}
