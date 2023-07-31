package com.example.self_chatgpt;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ShoppingCart {
    private Map<FoodItem, List<CustomizationChoice>> cartItems;

    public ShoppingCart() {
        cartItems = new HashMap<>();
    }

    public void addItem(FoodItem foodItem, List<CustomizationChoice> customizationChoices) {
        cartItems.put(foodItem, customizationChoices);
    }

    public void removeItem(FoodItem foodItem) {
        cartItems.remove(foodItem);
    }

    public Map<FoodItem, List<CustomizationChoice>> getCartItems() {
        return cartItems;
    }

    public double calculateTotalAmount() {
        double totalAmount = 0.0;
        for (FoodItem foodItem : cartItems.keySet()) {
            totalAmount += foodItem.getPrice();
            List<CustomizationChoice> customizationChoices = cartItems.get(foodItem);
            for (CustomizationChoice choice : customizationChoices) {
                totalAmount += choice.getOption().getAdditionalCost() * choice.getQuantity();
            }
        }
        return totalAmount;
    }
}

/*
public class ShoppingCart {
    private Map<FoodItem, List<CustomizationChoice>> cartItems;

    public ShoppingCart() {
        cartItems = new HashMap<>();
    }

    public void addItem(FoodItem foodItem, List<CustomizationChoice> customizationChoices) {
        cartItems.put(foodItem, customizationChoices);
    }

    public void removeItem(FoodItem foodItem) {
        cartItems.remove(foodItem);
    }

    public Map<FoodItem, List<CustomizationChoice>> getCartItems() {
        return cartItems;
    }

    public static void main(String[] args) {
        // Test the ShoppingCart class
        Category burgersCategory = new Category("Burgers");
        FoodItem cheeseburger = new FoodItem("Cheeseburger", "Delicious cheeseburger", 5.99, burgersCategory);

        CustomizationOption extraCheese = new CustomizationOption("Extra Cheese", 0.5);
        CustomizationChoice choice1 = new CustomizationChoice(extraCheese, 2);

        CustomizationOption bacon = new CustomizationOption("Bacon", 1.0);
        CustomizationChoice choice2 = new CustomizationChoice(bacon, 1);

        List<CustomizationChoice> customizationChoices = new ArrayList<>();
        customizationChoices.add(choice1);
        customizationChoices.add(choice2);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(cheeseburger, customizationChoices);

        // Display the items in the shopping cart
        System.out.println("Shopping Cart Items:");
        for (Map.Entry<FoodItem, List<CustomizationChoice>> entry : cart.getCartItems().entrySet()) {
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

*/