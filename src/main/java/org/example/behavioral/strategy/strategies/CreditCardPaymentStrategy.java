package org.example.behavioral.strategy.strategies;

public class CreditCardPaymentStrategy implements PaymentStrategy {
    String cardNumber;
    public CreditCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Credit Card. Card Number: " + cardNumber);
    }
}
