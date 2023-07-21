package com.example.self_chatgpt;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class OrderConfirmationController {
    private ShoppingCart shoppingCart;

    public OrderConfirmationController(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
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

    public static void main(String[] args) {
        // Test the OrderConfirmationController class
        Category burgersCategory = new Category("Burgers");
        FoodItem cheeseburger = new FoodItem("Cheeseburger", "Delicious cheeseburger", 5.99, burgersCategory);

        CustomizationOption extraCheese = new CustomizationOption("Extra Cheese", 0.5);
        CustomizationChoice choice1 = new CustomizationChoice(extraCheese, 2);

        List<CustomizationChoice> customizationChoices = new ArrayList<>();
        customizationChoices.add(choice1);

        ShoppingCart cart = new ShoppingCart();
        cart.addItem(cheeseburger, customizationChoices);

        OrderConfirmationController orderConfirmationController = new OrderConfirmationController(cart);
        orderConfirmationController.displayOrderConfirmation();
    }
}
