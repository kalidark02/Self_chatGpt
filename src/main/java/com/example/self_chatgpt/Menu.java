package com.example.self_chatgpt;

import java.util.ArrayList;
import java.util.List;

public class Menu {
    public String name;
    private List<Category> categories;

    public Menu(String name) {
        this.name=name;
        categories = new ArrayList<>();
    }

    public void addCategory(Category category) {
        categories.add(category);
    }

    public void removeCategory(Category category) {
        categories.remove(category);
    }

    public Category getCategoryByName(String categoryName) {
        for (Category category : categories) {
            if (category.getName().equalsIgnoreCase(categoryName)) {
                return category;
            }
        }
        return null; // Return null if category not found
    }

    public List<Category> getAllCategories() {
        return categories;
    }

//    public static void main(String[] args) {
//        // Test the Menu class
//        Menu menu = new Menu();
//
//        Category burgersCategory = new Category("Burgers");
//        burgersCategory.addFoodItem(new FoodItem("Cheeseburger", "Delicious cheeseburger", 5.99, burgersCategory));
//        burgersCategory.addFoodItem(new FoodItem("Veggie Burger", "Vegetarian burger", 4.99, burgersCategory));
//        menu.addCategory(burgersCategory);
//
//        Category sidesCategory = new Category("Sides");
//        sidesCategory.addFoodItem(new FoodItem("French Fries", "Crispy fries", 2.99, sidesCategory));
//        sidesCategory.addFoodItem(new FoodItem("Onion Rings", "Crispy onion rings", 3.49, sidesCategory));
//        menu.addCategory(sidesCategory);
//
//        // Display all categories and their food items
//        for (Category category : menu.getAllCategories()) {
//            System.out.println("Category: " + category.getName());
//            for (FoodItem item : category.getAllFoodItems()) {
//                System.out.println("  - " + item.getName() + " (" + item.getDescription() + ") - $" + item.getPrice());
//            }
//            System.out.println();
//        }
//    }
}
