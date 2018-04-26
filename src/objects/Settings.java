package objects;

import java.util.LinkedHashSet;

abstract public class Settings {

    protected int counter = 0; //счетчик попыток

    protected LinkedHashSet<Integer> numberSet = new LinkedHashSet<>();//последовательность в которой будут находится введенные цифры

    protected static final String
            WELCOME_TEXT = "ZX-Spectrum 48 загадал число от 1 до 100, " +
            "попробуй угадать его за меньшее количество попыток.";

    protected static final String YOU_WIN = "ПОЗДРАВЛЯЕМ!!! Вы отгадали число.";

    protected static final String NUM_LESS = "Меньше...";

    protected static final String NUM_MORE = "Больше...";

    protected static final String NUM_ERROR = "Вводите только цифры.";

    protected static final String NUM_IS_NULL = "Введите число от 1 до 100.";

    protected static final String NUM_IS_NOT_RANGE = "Вводимое число должно быть в диапазоне от 1 до 100.";




}
