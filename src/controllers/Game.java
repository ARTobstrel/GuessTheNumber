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
    int guessNum = randomnumber.getGuessNumInt();

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

        //1 В этом методе идет проверка наличия введенного текста, if anything text is empty then input text-error
        System.out.println(numberSet.size());
        if(inputNum.getText().isEmpty()) {
            textConsole.clear();
            textConsole.appendText(NUM_IS_NULL);
        } else {
            convertToNumber();
        }
    }

    private void convertToNumber() {

        //2 Этот метод попытается преобразовть введенный текст в число типа Int
        try {
            int convertNum = Integer.parseInt(inputNum.getText());
            numberCheckRange(convertNum);
        } catch (Exception e) {
            textConsole.clear();
            textConsole.appendText(NUM_ERROR);
        }
    }

    private void numberCheckRange(int convertNum) {

        //3 В этом методе происходит проверка на соответствие числа заданному диапазону от 1 до 100
        if(convertNum >= 1 && convertNum <= 100) {
            checkConformity(convertNum);
        } else {
            textConsole.clear();
            textConsole.appendText(NUM_IS_NOT_RANGE);
        }
    }

    private void checkConformity(int convertNum) {

        //4 В этом методе проверяем введенное число на соответствие загаданному числу

        if(convertNum == guessNum ) {
            // введенное число соответствует загаданному
            numberSet.add(convertNum);//добавляем число в Set
            textConsole.clear();
            textConsole.appendText(YOU_WIN);
        } else if(convertNum > guessNum) {
            // введенное число больше загаданного
            numberSet.add(convertNum);//добавляем число в Set
            textConsole.clear();
            textConsole.appendText(NUM_LESS); //меньше
            inputNum.clear();
        } else if(convertNum < guessNum) {
            // введенное число меньше загаданного
            numberSet.add(convertNum);//добавляем число в Set
            textConsole.clear();
            textConsole.appendText(NUM_MORE); //больше
            inputNum.clear();
        }

    }


}
