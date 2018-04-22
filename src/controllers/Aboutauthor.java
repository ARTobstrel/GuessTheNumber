package controllers;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import start.Main;


public class Aboutauthor {

    @FXML
    private ImageView back;

    @FXML
    private AnchorPane aboutAthourMain;


    @FXML
    void initialize() {

        // Back to mainpage

    }

    public void backToTheMain(MouseEvent mouseEvent) throws Exception {
        back.getScene().getWindow().hide();
        Main main = new Main();
        main.start(new Stage());
    }
}
