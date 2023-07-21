package com.example.self_chatgpt;

public class CustomizationChoice {
    private CustomizationOption option;
    private int quantity;

    public CustomizationChoice(CustomizationOption option, int quantity) {
        this.option = option;
        this.quantity = quantity;
    }

    public CustomizationOption getOption() {
        return option;
    }

    public int getQuantity() {
        return quantity;
    }

    public static void main(String[] args) {
        // Test the CustomizationChoice class
        CustomizationOption extraCheese = new CustomizationOption("Extra Cheese", 0.5);
        CustomizationOption bacon = new CustomizationOption("Bacon", 1.0);

        CustomizationChoice choice1 = new CustomizationChoice(extraCheese, 2);
        CustomizationChoice choice2 = new CustomizationChoice(bacon, 1);

        // Display the customization choice details
        System.out.println("Customization Choice: " + choice1.getOption().getName());
        System.out.println("Quantity: " + choice1.getQuantity());

        System.out.println("Customization Choice: " + choice2.getOption().getName());
        System.out.println("Quantity: " + choice2.getQuantity());
    }
}
