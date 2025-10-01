package com.repartition;

import com.repartition.fonction_Utiles.JpaUtil;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class MainApp extends Application {

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Test CourseManage");

        // Simple interface JavaFX
        StackPane root = new StackPane();
        root.getChildren().add(new Label("Bienvenue dans CourseManage !"));
        primaryStage.setScene(new Scene(root, 400, 200));
        primaryStage.show();

        // Test JPA/Hibernate
        EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
        EntityManager em = emf.createEntityManager();

        try {
            em.getTransaction().begin();
            // Ici tu peux tester la persistance, ex : em.persist(new Enseignant(...));
            em.getTransaction().commit();
            System.out.println("Test Hibernate OK !");
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            em.close();
            JpaUtil.shutdown();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
