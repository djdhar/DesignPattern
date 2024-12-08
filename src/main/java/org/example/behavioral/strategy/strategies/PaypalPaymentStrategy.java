package org.example.behavioral.strategy.strategies;

public class PaypalPaymentStrategy implements PaymentStrategy {
    String payPalId;
    public PaypalPaymentStrategy(String payPalId) {
        this.payPalId = payPalId;
    }
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal. PayPal ID : " + payPalId);
    }
}
