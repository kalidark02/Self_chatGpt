package com.example.self_chatgpt;

import java.util.ArrayList;

public class PaymentController {
    private ShoppingCart shoppingCart;
    private PaymentGateway paymentGateway;

    public PaymentController(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
        paymentGateway = new PaymentGateway();
    }

    public boolean processPayment(double amount) {
        // Call the payment gateway to process the payment
        return paymentGateway.processPayment(amount);
    }

    public static void main(String[] args) {
        // Test the PaymentController class
        Category burgersCategory = new Category("Burgers");
        FoodItem cheeseburger = new FoodItem("Cheeseburger", "Delicious cheeseburger", 5.99, burgersCategory);
        ShoppingCart cart = new ShoppingCart();
        cart.addItem(cheeseburger, new ArrayList<>());

        PaymentController paymentController = new PaymentController(cart);
        double totalAmount = 5.99;

        boolean isPaymentSuccessful = paymentController.processPayment(totalAmount);
        if (isPaymentSuccessful) {
            System.out.println("Payment successful! Your order has been placed.");
            // Further steps to confirm the order and provide order details
        } else {
            System.out.println("Payment failed. Please try again.");
        }
    }
}
