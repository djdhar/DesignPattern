package org.example.structural.decorator.second;

import org.example.structural.decorator.basic.BasicDecorator;
import org.example.structural.decorator.inf.Decoratee;

public class SecondDecoratorA extends BasicDecorator {

    public SecondDecoratorA(Decoratee decorator) {
        super(decorator);
    }
    @Override
    public double getPrice() {
        return 100.00 + decoratee.getPrice();
    }
}
