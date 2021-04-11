package com.snl.dice;

import java.util.Random;

public class CrookedDice implements Dice {

    private static final int START_OF_RANGE = 2;
    private static final int BOUND = 3;

    @Override
    public int roll() {
        Random r = new Random();
        return START_OF_RANGE + r.nextInt(BOUND) * 2;
    }
}
