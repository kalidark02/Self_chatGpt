package com.example.self_chatgpt;

import java.util.ArrayList;
import java.util.List;

public class Category {
    private String name;
    private List<FoodItem> foodItems;

    public Category(String name) {
        this.name = name;
        foodItems = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addFoodItem(FoodItem foodItem) {
        foodItems.add(foodItem);
    }

    public void removeFoodItem(FoodItem foodItem) {
        foodItems.remove(foodItem);
    }

    public List<FoodItem> getAllFoodItems() {
        return foodItems;
    }

    public static void main(String[] args) {
        // Test the Category class
        Category burgersCategory = new Category("Burgers");
        burgersCategory.addFoodItem(new FoodItem("Cheeseburger", "Delicious cheeseburger", 5.99, burgersCategory));
        burgersCategory.addFoodItem(new FoodItem("Veggie Burger", "Vegetarian burger", 4.99, burgersCategory));

        // Display the category name and its food items
        System.out.println("Category: " + burgersCategory.getName());
        for (FoodItem item : burgersCategory.getAllFoodItems()) {
            System.out.println("  - " + item.getName() + " (" + item.getDescription() + ") - $" + item.getPrice());
        }
    }
}
