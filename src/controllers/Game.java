package controllers;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import objects.Randomnumber;
import objects.Settings;

public class Game extends Settings {

    private Randomnumber randomnumber = new Randomnumber();
    private int guessNumInt = randomnumber.getGuessNumInt();
    private String guessNumString = randomnumber.getGuessNumString();

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

    public void clickOnCheck() {

        //1 В этом методе идет проверка наличия введенного текста, if anything text is empty then input text-error
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

        if(convertNum == guessNumInt) {
            // введенное число соответствует загаданному
            numberSet.add(convertNum);//добавляем число в Set
            textConsole.clear();
            inputNum.clear();
            textConsole.appendText(YOU_WIN);
            textConsole.appendText(guessNumString);
            btnCheck.setDisable(true); //сделать кнопку не активной после выигрыша
        } else if(convertNum > guessNumInt) {
            // введенное число больше загаданного
            numberSet.add(convertNum);//добавляем число в Set
            textConsole.clear();
            textConsole.appendText(NUM_LESS); //меньше
            inputNum.clear();
        } else {
            // введенное число меньше загаданного
            numberSet.add(convertNum);//добавляем число в Set
            textConsole.clear();
            textConsole.appendText(NUM_MORE); //больше
            inputNum.clear();
        }

        displayNumbers();

    }

    private void displayNumbers() {

        //5 Данный метод отображает введенные цифры в специальном окне
        textConsole.appendText("\n" + ENTERED_NUMBERS);
        int counter = 0;
        for(int x : numberSet) {
            String s = Integer.toString(x);
            textConsole.appendText(s + ", ");
            counter += 1;
        }
        String counterString = Integer.toString(counter);
        textConsole.appendText("\n" + COUNTER + counterString);
    }


}
