package controllers;

import javafx.event.ActionEvent;
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

    }

    public void clickOnCheck(ActionEvent actionEvent) {

        // В этом методе идет проверка наличия введенного текста, if anything text is empty then input text-error
        System.out.println("Btn = " + inputNum.getText());
        if(inputNum.getText().isEmpty()) {
            textConsole.clear();
            textConsole.appendText(NUM_IS_NULL);
        } else {
            int convertNum = convertToNumber();
            numberCheck();
        }
    }

    private int convertToNumber() {

        // Этот метод попытается преобразовть введенный текст в число типа Int
        try {
            int convertNum = Integer.parseInt(inputNum.getText());
            return convertNum;
        } catch (Exception e) {
            textConsole.clear();
            textConsole.appendText(NUM_ERROR);
            return 0;
        }

    }

    private void numberCheck() {

        // В этом методе происходит проверка на совпадение введенного числа с числом загаданным искуственным интеллектом

    }


}
