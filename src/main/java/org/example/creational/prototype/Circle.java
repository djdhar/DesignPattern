package org.example.creational.prototype;

public class Circle extends Shape {
    public Circle(Integer id) {
        this.setId(id);
    }
    @Override
    public void draw() {
        System.out.println("Drawing a Circle!" + this.hashCode());
    }
}
