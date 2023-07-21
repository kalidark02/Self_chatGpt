package com.example.self_chatgpt;

import java.util.ArrayList;
import java.util.List;

public class FoodItem {
    private String name;
    private String description;
    private double price;
    private Category category;
    private List<CustomizationOption> customizationOptions;

    public FoodItem(String name, String description, double price, Category category) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
        customizationOptions = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public Category getCategory() {
        return category;
    }

    public void addCustomizationOption(CustomizationOption option) {
        customizationOptions.add(option);
    }

    public void removeCustomizationOption(CustomizationOption option) {
        customizationOptions.remove(option);
    }

    public List<CustomizationOption> getAllCustomizationOptions() {
        return customizationOptions;
    }

    public static void main(String[] args) {
        // Test the FoodItem class
        Category burgersCategory = new Category("Burgers");

        FoodItem cheeseburger = new FoodItem("Cheeseburger", "Delicious cheeseburger", 5.99, burgersCategory);
        cheeseburger.addCustomizationOption(new CustomizationOption("Extra Cheese", 0.5));
        cheeseburger.addCustomizationOption(new CustomizationOption("Bacon", 1.0));

        // Display the food item details
        System.out.println("Food Item: " + cheeseburger.getName());
        System.out.println("Description: " + cheeseburger.getDescription());
        System.out.println("Price: $" + cheeseburger.getPrice());
        System.out.println("Category: " + cheeseburger.getCategory().getName());

        System.out.println("Customization Options:");
        for (CustomizationOption option : cheeseburger.getAllCustomizationOptions()) {
            System.out.println("  - " + option.getName() + " - $" + option.getAdditionalCost());
        }
    }
}

