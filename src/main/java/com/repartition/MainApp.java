package com.repartition;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        // Contenu simple
        Label label = new Label("Hello JavaFX !");
        StackPane root = new StackPane(label);

        // Création de la scène
        Scene scene = new Scene(root, 400, 300);

        // Configuration de la fenêtre
        primaryStage.setTitle("Répartition");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
