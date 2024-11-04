package org.example.structural.decorator.top;

import org.example.structural.decorator.basic.BasicDecorator;
import org.example.structural.decorator.inf.Decoratee;

public class TopDecorator extends BasicDecorator {

    public TopDecorator(Decoratee decorator) {
        super(decorator);
    }
    @Override
    public double getPrice() {
        return 1000.00 + decoratee.getPrice();
    }
}
