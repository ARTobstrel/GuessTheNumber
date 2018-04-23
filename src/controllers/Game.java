package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import objects.Randomnumber;

public class Game {

    final String welcomeText = "ZX-Spectrum 48 загадал число от 1 до 100, попробуй \n" +
            "угадай его за меньшее количество попыток.";

    Randomnumber randomnumber = new Randomnumber();
    private int guessNum = randomnumber.getGuessNum();
    String text = Integer.toString(guessNum);

    @FXML
    private TextArea textConsole;


    @FXML
    void initialize() {

        textConsole.clear();
        textConsole.appendText(welcomeText);
        textConsole.appendText("Number: " + text);

    }
}
