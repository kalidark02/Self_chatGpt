package com.example.self_chatgpt;

public class CustomizationOption {
    private String name;
    private double additionalCost;

    public CustomizationOption(String name, double additionalCost) {
        this.name = name;
        this.additionalCost = additionalCost;
    }

    public String getName() {
        return name;
    }

    public double getAdditionalCost() {
        return additionalCost;
    }

    public static void main(String[] args) {
        // Test the CustomizationOption class
        CustomizationOption extraCheese = new CustomizationOption("Extra Cheese", 0.5);
        CustomizationOption bacon = new CustomizationOption("Bacon", 1.0);

        // Display the customization option details
        System.out.println("Customization Option: " + extraCheese.getName());
        System.out.println("Additional Cost: $" + extraCheese.getAdditionalCost());

        System.out.println("Customization Option: " + bacon.getName());
        System.out.println("Additional Cost: $" + bacon.getAdditionalCost());
    }
}
