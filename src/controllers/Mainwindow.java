package controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class Mainwindow {

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


        // Start Game
        startGame.setOnAction(event -> {
            startGame.getScene().getWindow().hide(); //прячем основное окно
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/game.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.show();
        });

        // About athor
        aboutAthor.setOnAction(event -> {

            aboutAthor.getScene().getWindow().hide(); //прячем основное окно
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("/fxml/aboutauthor.fxml"));

            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.show();

        });
    }
}
