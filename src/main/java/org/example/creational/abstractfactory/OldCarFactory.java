package org.example.creational.abstractfactory;

public class OldCarFactory implements CarFactory {
    @Override
    public Car getCar(String type) {
        if("A".equals(type)) return new OldCarA();
        if("B".equals(type)) return new OldCarB();
        return null;
    }
}
