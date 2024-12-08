package org.example.behavioral.strategy.context;

import org.example.behavioral.strategy.strategies.PaymentStrategy;

public class ShoppingCart {
    PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void checkout(int amount) {
        if(paymentStrategy == null) {
            throw new IllegalStateException("Payment strategy should not be null");
        }
        if(amount<=0) {
            throw new IllegalArgumentException("Amount should be greater than 0!");
        } else {
            paymentStrategy.pay(amount);
        }
    }
}
