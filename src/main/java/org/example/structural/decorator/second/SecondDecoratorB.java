package org.example.structural.decorator.second;

import org.example.structural.decorator.basic.BasicDecorator;
import org.example.structural.decorator.inf.Decoratee;

public class SecondDecoratorB extends BasicDecorator {

    public SecondDecoratorB(Decoratee decorator) {
        super(decorator);
    }
    @Override
    public double getPrice() {
        return 200.00 + decoratee.getPrice();
    }
}
