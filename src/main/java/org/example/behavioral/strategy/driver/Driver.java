package org.example.behavioral.strategy.driver;

import org.example.behavioral.strategy.context.ShoppingCart;
import org.example.behavioral.strategy.strategies.CreditCardPaymentStrategy;
import org.example.behavioral.strategy.strategies.DebitCardPaymentStrategy;
import org.example.behavioral.strategy.strategies.PaypalPaymentStrategy;

public class Driver {
    public static void main(String[] args) {
        ShoppingCart shoppingCart = new ShoppingCart();
        try {
            shoppingCart.checkout(100);
        } catch (Exception e) {
            System.out.println(e);
        }
        shoppingCart.setPaymentStrategy(new CreditCardPaymentStrategy("123456"));
        try {
            shoppingCart.checkout(-23);
        } catch (Exception e) {
            System.out.println(e);
        }
        shoppingCart.checkout(100);
        shoppingCart.setPaymentStrategy(new DebitCardPaymentStrategy("456789"));
        shoppingCart.checkout(100);
        shoppingCart.setPaymentStrategy(new PaypalPaymentStrategy("255050"));
        shoppingCart.checkout(100);
    }
}
