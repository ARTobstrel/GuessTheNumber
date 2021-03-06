package objects;

import java.util.Random;

public class Randomnumber {

    //этот класс получает случайное число от 1 до 100 и преобразует его в строку
    private Random ranNum;
    private int guessNum;
    private String guessNumText;

    public Randomnumber() {
        this.ranNum = new Random();
        this.guessNum = ranNum.nextInt(101);
        this.guessNumText = Integer.toString(guessNum); //преобразование введеной строки в тип данных INT
    }

    public String getGuessNumString() {
        return guessNumText;
    }

    public int getGuessNumInt() {
        return guessNum;
    }
}
