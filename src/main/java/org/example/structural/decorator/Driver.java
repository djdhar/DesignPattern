package org.example.structural.decorator;

import org.example.structural.decorator.basic.BasicDecorator;
import org.example.structural.decorator.first.FirstDecoratorB;
import org.example.structural.decorator.second.SecondDecoratorA;
import org.example.structural.decorator.top.TopDecorator;

public class Driver {
    public static void main(String[] args) {
        TopDecorator topDecorator = new TopDecorator(
                new SecondDecoratorA(
                        new FirstDecoratorB(
                                new BasicDecorator(null)
                        )
                )
        );
        System.out.println(topDecorator.getPrice());
    }
}
