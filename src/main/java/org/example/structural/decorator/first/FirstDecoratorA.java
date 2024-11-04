package org.example.structural.decorator.first;

import org.example.structural.decorator.basic.BasicDecorator;
import org.example.structural.decorator.inf.Decoratee;

public class FirstDecoratorA extends BasicDecorator {

    public FirstDecoratorA(Decoratee decorator) {
        super(decorator);
    }
    @Override
    public double getPrice() {
        return 10.00 + decoratee.getPrice();
    }
}
