package com.example.self_chatgpt;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class SelfServiceKioskApp extends Application {
    private ShoppingCart shoppingCart;

    public SelfServiceKioskApp() {
        // Initialize the shopping cart
        shoppingCart = new ShoppingCart();
    }

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Add code for JavaFX GUI here (UI components, event handling, etc.)
        // For simplicity, this example will only display a basic label

        VBox root = new VBox();
        Label label = new Label("Welcome to the Self-Service Kiosk!");

        root.getChildren().add(label);

        Scene scene = new Scene(root, 400, 300);

        primaryStage.setTitle("Self-Service Kiosk");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

