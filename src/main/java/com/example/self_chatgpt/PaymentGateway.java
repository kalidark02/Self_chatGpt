package com.example.self_chatgpt;

public class PaymentGateway {
    public boolean processPayment(double amount) {
        // Simulate payment processing (for testing purposes)
        // In a real application, this would interact with an external payment service
        // and handle payment processing securely.
        return Math.random() < 0.95; // Simulate a successful payment with a 95% success rate
    }
}
