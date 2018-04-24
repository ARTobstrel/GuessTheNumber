package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import objects.Randomnumber;
import objects.Settings;

public class Game extends Settings {

    Randomnumber randomnumber = new Randomnumber();
    String guessNum = randomnumber.getGuessNum();

    @FXML
    private TextArea textConsole;

    @FXML
    private TextField inputNum;

    @FXML
    private Button btnCheck;


    @FXML
    void initialize() {

        textConsole.clear();
        textConsole.appendText(WELCOME_TEXT);
        textConsole.appendText(NUM_ERROR);

    }
}
