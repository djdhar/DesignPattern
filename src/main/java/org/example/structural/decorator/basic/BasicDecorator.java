package org.example.structural.decorator.basic;

import org.example.structural.decorator.inf.Decoratee;

public class BasicDecorator implements Decoratee {
    protected Decoratee decoratee;
    public BasicDecorator(Decoratee decoratee) {
        this.decoratee = decoratee;
    }
    @Override
    public double getPrice() {
        return 5.00;
    }
}
