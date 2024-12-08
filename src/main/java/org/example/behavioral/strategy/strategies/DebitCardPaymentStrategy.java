package org.example.behavioral.strategy.strategies;

public class DebitCardPaymentStrategy implements PaymentStrategy {
    String cardNumber;
    public DebitCardPaymentStrategy(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using Debit Card. Card Number: " + cardNumber);
    }
}
