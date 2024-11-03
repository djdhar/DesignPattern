package org.example.creational.prototype;

public class Rectangle extends Shape {
    public Rectangle(Integer id) {
        this.setId(id);
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle!" + this.hashCode());
    }
}
