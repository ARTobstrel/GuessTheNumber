package controllers;

import javafx.fxml.FXML;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import start.Main;

import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;


public class Aboutauthor {

    @FXML
    private ImageView back;


    @FXML
    void initialize() {

        // Back to mainpage

    }

    public void backToTheMain() throws Exception {
        back.getScene().getWindow().hide();
        Main main = new Main();
        main.start(new Stage());
    }

    public void goToMySite() throws URISyntaxException, IOException {
        Desktop d = Desktop.getDesktop();
        d.browse(new URI("http://mydeployproject.herokuapp.com"));
    }
}
