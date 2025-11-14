module com.example.rentalsystem {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.ikonli.core;

    opens com.example.rentalsystem.controllers to javafx.fxml;
    opens com.example.rentalsystem.fxml to javafx.fxml;

    exports com.example.rentalsystem;
    exports com.example.rentalsystem.controllers;
}
