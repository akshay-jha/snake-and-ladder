package com.snl.dice;

import java.util.Random;

public class NormalDice implements Dice {

    private static final int DICE_MINIMUM_OUTPUT = 1;
    private static final int DICE_MAXIMUM_OUTPUT = 6;

    public int roll() {
        Random r = new Random();
        return r.ints(DICE_MINIMUM_OUTPUT, (DICE_MAXIMUM_OUTPUT + 1)).findFirst().getAsInt();
    }
}
