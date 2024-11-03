package org.example.creational.abstractfactory;

public class Driver {
    public static void main(String[] args) {
        CarFactory carFactory = new OldCarFactory();
        carFactory.getCar("A").drive();
        carFactory.getCar("B").drive();
        carFactory = new NewCarFactory();
        carFactory.getCar("A").drive();
        carFactory.getCar("B").drive();

    }
}
