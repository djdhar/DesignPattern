package org.example.structural.decorator.first;

import org.example.structural.decorator.basic.BasicDecorator;
import org.example.structural.decorator.inf.Decoratee;

public class FirstDecoratorB extends BasicDecorator {
    public FirstDecoratorB(Decoratee decoratee) {
        super(decoratee);
    }
    @Override
    public double getPrice() {
        return 20.00 + decoratee.getPrice();
    }
}
