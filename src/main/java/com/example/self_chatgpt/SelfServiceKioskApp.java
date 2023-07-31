package com.example.self_chatgpt;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Insets;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/*
public class SelfServiceKioskApp extends Application {
    private Menu menu;
    private ShoppingCart cart;
    private ComboBox<FoodItem> foodItemComboBox; // Add this variable for the food item selection

    public SelfServiceKioskApp() {
        // Initialize the menu and shopping cart
        menu = new Menu();

        Category burgersCategory = new Category("Burgers");
        FoodItem cheeseburger = new FoodItem("Cheeseburger", "Delicious cheeseburger", 5.99, burgersCategory);
        burgersCategory.addFoodItem(cheeseburger);
        menu.addCategory(burgersCategory);

        cart = new ShoppingCart();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("pilot.fxml"));
        primaryStage.setTitle("Self-Service Kiosk");

        VBox mainLayout = new VBox(10);
        mainLayout.setPadding(new Insets(20));

        Label titleLabel = new Label("Welcome to the Self-Service Kiosk!");
        mainLayout.getChildren().add(titleLabel);

        // Create the category selection dropdown
        ComboBox<Category> categoryComboBox = new ComboBox<>();
        categoryComboBox.getItems().addAll(menu.getAllCategories());
        categoryComboBox.setPromptText("Select a category");
        mainLayout.getChildren().add(categoryComboBox);

        foodItemComboBox = new ComboBox<>(); // Initialize the food item selection dropdown
        foodItemComboBox.setPromptText("Select a food item");
        mainLayout.getChildren().add(foodItemComboBox);

        // Create the customization choices selection
        Label customizationLabel = new Label("Customization Choices:");
        mainLayout.getChildren().add(customizationLabel);

        VBox customizationLayout = new VBox(5);
        customizationLayout.setPadding(new Insets(0, 0, 10, 20));
        mainLayout.getChildren().add(customizationLayout);

        // Create the add to cart button
        Button addToCartButton = new Button("Add to Cart");
        mainLayout.getChildren().add(addToCartButton);

        // Create the order summary label
        Label orderSummaryLabel = new Label();
        mainLayout.getChildren().add(orderSummaryLabel);

        // Populate the food item dropdown when a category is selected
        categoryComboBox.setOnAction(e -> {
            FoodItem selectedItem = foodItemComboBox.getValue();
            foodItemComboBox.getItems().clear();
            foodItemComboBox.getItems().addAll(categoryComboBox.getValue().getAllFoodItems());
            foodItemComboBox.setValue(selectedItem);
            updateCustomizationChoices(customizationLayout);
        });

        // Update the customization choices when a food item is selected
        foodItemComboBox.setOnAction(e -> updateCustomizationChoices(customizationLayout));

        // Handle adding items to the cart
        addToCartButton.setOnAction(e -> {
            FoodItem selectedItem = foodItemComboBox.getValue();
            List<CustomizationChoice> selectedChoices = getSelectedCustomizationChoices(customizationLayout);
            cart.addItem(selectedItem, selectedChoices);
            orderSummaryLabel.setText(new OrderConfirmationController(cart).getOrderSummary());
        });

        Scene scene = new Scene(fxmlLoader.load(), 400, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void updateCustomizationChoices(VBox customizationLayout) {
        customizationLayout.getChildren().clear();
        FoodItem selectedItem = foodItemComboBox.getValue();
        if (selectedItem != null) {
            for (CustomizationOption option : selectedItem.getAllCustomizationOptions()) {
                HBox choiceLayout = new HBox(10);
                Label optionLabel = new Label(option.getName() + " ($" + option.getAdditionalCost() + ")");
                Spinner<Integer> quantitySpinner = new Spinner<>(0, 10, 0);
                choiceLayout.getChildren().addAll(optionLabel, quantitySpinner);
                customizationLayout.getChildren().add(choiceLayout);
            }
        }
    }

    private List<CustomizationChoice> getSelectedCustomizationChoices(VBox customizationLayout) {
        List<CustomizationChoice> selectedChoices = new ArrayList<>();
        for (Node node : customizationLayout.getChildren()) {
            if (node instanceof HBox) {
                HBox choiceLayout = (HBox) node;
                Label optionLabel = (Label) choiceLayout.getChildren().get(0);
                Spinner<Integer> quantitySpinner = (Spinner<Integer>) choiceLayout.getChildren().get(1);

                String optionName = optionLabel.getText().split(" \\$")[0];
                int quantity = quantitySpinner.getValue();
                CustomizationOption selectedOption = null;
                for (CustomizationOption option : foodItemComboBox.getValue().getAllCustomizationOptions()) {
                    if (option.getName().equals(optionName)) {
                        selectedOption = option;
                        break;
                    }
                }
                if (selectedOption != null) {
                    selectedChoices.add(new CustomizationChoice(selectedOption, quantity));
                }
            }
        }
        return selectedChoices;
    }
}



//public class SelfServiceKioskApp extends Application {
//    private ShoppingCart shoppingCart;
//
//    public SelfServiceKioskApp() {
//        // Initialize the shopping cart
//        shoppingCart = new ShoppingCart();
//    }
//
//    public static void main(String[] args) {
//        launch(args);
//    }
//
//    @Override
//    public void start(Stage primaryStage) {
//        // Add code for JavaFX GUI here (UI components, event handling, etc.)
//        // For simplicity, this example will only display a basic label
//
//        VBox root = new VBox();
//        Label label = new Label("Welcome to the Self-Service Kiosk!");
//
//        root.getChildren().add(label);
//
//        Scene scene = new Scene(root, 400, 300);
//
//        primaryStage.setTitle("Self-Service Kiosk");
//        primaryStage.setScene(scene);
//        primaryStage.show();
//    }
//}
//

*/
public class SelfServiceKioskApp {
    public static void main(String[] args) {
        // Créer le menu
        Menu menu = new Menu("Menue cheese");

        //Initialisation

        initialisation(menu);

        // Créer les catégories
        Category burgersCategory = new Category("Burgers");
        Category sidesCategory = new Category("Sides");
        Category beveragesCategory = new Category("Beverages");

        // Ajouter les catégories au menu
        menu.addCategory(burgersCategory);
        menu.addCategory(sidesCategory);
        menu.addCategory(beveragesCategory);

        // Créer les plats
        FoodItem cheeseburger = new FoodItem("Cheeseburger", "Delicious cheeseburger", 5.99, burgersCategory);
        FoodItem fries = new FoodItem("Fries", "Crispy fries", 2.99, sidesCategory);
        FoodItem soda = new FoodItem("Soda", "Refreshing soda", 1.99, beveragesCategory);

        // Ajouter les plats aux catégories
        burgersCategory.addFoodItem(cheeseburger);
        sidesCategory.addFoodItem(fries);
        beveragesCategory.addFoodItem(soda);

        // Ajouter des options de personnalisation pour le Cheeseburger
        CustomizationOption baconOption = new CustomizationOption("Bacon", 1.50);
        CustomizationOption onionsOption = new CustomizationOption("Onions", 0.75);
        cheeseburger.addCustomizationOption(baconOption);
        cheeseburger.addCustomizationOption(onionsOption);

        // Ajouter des options de personnalisation pour les Fries
        CustomizationOption largeSizeOption = new CustomizationOption("Large Size", 1.00);
        fries.addCustomizationOption(largeSizeOption);

        // Ajouter des options de personnalisation pour le Soda
        CustomizationOption mediumSizeOption = new CustomizationOption("Medium Size", 0.50);
        soda.addCustomizationOption(mediumSizeOption);

        // Créer un panier d'achats
        ShoppingCart cart = new ShoppingCart();

        // Ajouter un plat au panier avec des options de personnalisation
        List<CustomizationChoice> choices = new ArrayList<>();
        choices.add(new CustomizationChoice(baconOption, 1));
        choices.add(new CustomizationChoice(onionsOption, 2));
        cart.addItem(cheeseburger, choices);

        // Ajouter un autre plat au panier avec des options de personnalisation
        choices.clear();
        choices.add(new CustomizationChoice(largeSizeOption, 1));
        cart.addItem(fries, choices);

        // Afficher le résumé de la commande
        OrderConfirmationController orderConfirmationController = new OrderConfirmationController(cart);
        String orderSummary = orderConfirmationController.getOrderSummary();
        System.out.println(orderSummary);

        // Processus de paiement
        PaymentController paymentController = new PaymentController(cart);
        double totalAmount = cart.calculateTotalAmount();
        System.out.println("\n"+totalAmount);
        boolean paymentSuccess = paymentController.processPayment(totalAmount);

        // Afficher la confirmation de commande
        if (paymentSuccess) {
            System.out.println("Commande confirmée ! Merci de votre achat.");
        } else {
            System.out.println("Erreur de paiement. Veuillez réessayer.");
        }
    }

    private static void initialisation(Menu menu) {

        // Créer les catégories
        Category burgersCategory = new Category("Burgers");
        Category sandwichsCategory = new Category("Sandwichs");

        Category sidesCategory = new Category("Sides");
        Category beveragesCategory = new Category("Beverages");
        Category dessertCategory = new Category("Dessert");
        Category assiettesCategory = new Category("Assiettes");
        Category galettesCategory = new Category("Galettes");
        Category accompagnementCategory = new Category("Accompagnement");
        Category boissonsCategory = new Category("Boissons");
        Category bieresCategory = new Category("Bières");

        // Ajouter les catégories au menu
        menu.addCategory(burgersCategory);
        menu.addCategory(sidesCategory);
        menu.addCategory(beveragesCategory);
        menu.addCategory(sandwichsCategory);
        menu.addCategory(dessertCategory);
        menu.addCategory(assiettesCategory);
        menu.addCategory(accompagnementCategory);
        menu.addCategory(boissonsCategory);
        menu.addCategory(galettesCategory);
        menu.addCategory(bieresCategory);

        // Créer les plats
        FoodItem cheeseburger = new FoodItem("Cheeseburger", "Delicious cheeseburger", 5.99, burgersCategory);
        FoodItem fries = new FoodItem("Fries", "Crispy fries", 2.99, sidesCategory);
        FoodItem soda = new FoodItem("Soda", "Refreshing soda", 1.99, beveragesCategory);

        // Ajouter les plats aux catégories
        burgersCategory.addFoodItem(cheeseburger);
        sidesCategory.addFoodItem(fries);
        beveragesCategory.addFoodItem(soda);

        // Ajouter des options de personnalisation pour le Cheeseburger
        CustomizationOption baconOption = new CustomizationOption("Bacon", 1.50);
        CustomizationOption onionsOption = new CustomizationOption("Onions", 0.75);
        cheeseburger.addCustomizationOption(baconOption);
        cheeseburger.addCustomizationOption(onionsOption);

        // Ajouter des options de personnalisation pour les Fries
        CustomizationOption largeSizeOption = new CustomizationOption("Large Size", 1.00);
        fries.addCustomizationOption(largeSizeOption);

        // Ajouter des options de personnalisation pour le Soda
        CustomizationOption mediumSizeOption = new CustomizationOption("Medium Size", 0.50);
        soda.addCustomizationOption(mediumSizeOption);


    }
}
