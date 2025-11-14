package com.example.rentalsystem;

import com.example.rentalsystem.utils.SceneSwitcher;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage stage) throws Exception {

        // Register stage for navigation
        SceneSwitcher.setStage(stage);

        // Load the login page
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource("/com/example/rentalsystem/fxml/login.fxml")
        );
        Scene scene = new Scene(loader.load());

        stage.setTitle("Rental Mapping System");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
