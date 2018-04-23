package objects;

import java.util.Random;

public class Randomnumber {

    private Random ranNum;
    private int guessNum;

    public Randomnumber() {
        this.ranNum = new Random();
        this.guessNum = ranNum.nextInt(101);
    }

    public int getGuessNum() {
        return guessNum;
    }
}
