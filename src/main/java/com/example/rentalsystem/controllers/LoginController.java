package com.example.rentalsystem.controllers;

import com.example.rentalsystem.utils.SceneSwitcher;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController {

    @FXML
    private TextField emailField;

    @FXML
    private PasswordField passwordField;

    @FXML
    private void handleLogin() {

        String email = emailField.getText().trim();
        String password = passwordField.getText().trim();

        if (email.isEmpty() || password.isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText("Missing Information");
            alert.setContentText("Please enter both email and password.");
            alert.show();
            return;
        }

        // For now — no DB check, always go to the dashboard
        SceneSwitcher.switchTo("dashboard.fxml");
    }

    @FXML
    private void goToRegister() {
        SceneSwitcher.switchTo("register.fxml");
    }
}
