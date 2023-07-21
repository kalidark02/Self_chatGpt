package com.example.self_chatgpt;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderConfirmationController {
    private ShoppingCart shoppingCart;

    public OrderConfirmationController(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
    }

    public String getOrderSummary() {
        StringBuilder summary = new StringBuilder("Order Summary:\n");
        Map<FoodItem, List<CustomizationChoice>> cartItems = shoppingCart.getCartItems();

        for (Map.Entry<FoodItem, List<CustomizationChoice>> entry : cartItems.entrySet()) {
            FoodItem item = entry.getKey();
            summary.append("Food Item: ").append(item.getName()).append("\n");
            summary.append("Description: ").append(item.getDescription()).append("\n");
            summary.append("Price: $").append(item.getPrice()).append("\n");

            List<CustomizationChoice> choices = entry.getValue();
            summary.append("Customization Choices:\n");
            for (CustomizationChoice choice : choices) {
                summary.append("  - ").append(choice.getOption().getName()).append(" - Quantity: ").append(choice.getQuantity()).append("\n");
            }

            summary.append("\n");
        }

        return summary.toString();
    }
    public void displayOrderConfirmation() {
        // Get the cart items and display the order confirmation to the user
        Map<FoodItem, List<CustomizationChoice>> cartItems = shoppingCart.getCartItems();

        System.out.println("Order Confirmation:");
        for (Map.Entry<FoodItem, List<CustomizationChoice>> entry : cartItems.entrySet()) {
            FoodItem item = entry.getKey();
            System.out.println("Food Item: " + item.getName());
            System.out.println("Description: " + item.getDescription());
            System.out.println("Price: $" + item.getPrice());

            List<CustomizationChoice> choices = entry.getValue();
            System.out.println("Customization Choices:");
            for (CustomizationChoice choice : choices) {
                System.out.println("  - " + choice.getOption().getName() + " - Quantity: " + choice.getQuantity());
            }

            System.out.println();
        }
    }


}


