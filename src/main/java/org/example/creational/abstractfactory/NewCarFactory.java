package org.example.creational.abstractfactory;

public class NewCarFactory implements CarFactory {
    @Override
    public Car getCar(String type) {
        if("A".equals(type)) return new NewCarA();
        if("B".equals(type)) return new NewCarB();
        return null;
    }
}
