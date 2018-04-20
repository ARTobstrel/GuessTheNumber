package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class startcontroller {

    @FXML
    private Button startGame;

    @FXML
    private Button aboutAthor;

    @FXML
    private Button exit;

    @FXML
    void initialize() {
        // Exit
        exit.setOnAction(event -> {
            exit.getScene().getWindow().hide();
        });
    }
}
