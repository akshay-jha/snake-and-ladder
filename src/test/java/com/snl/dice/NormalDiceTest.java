package com.snl.dice;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NormalDiceTest {

    @Test
    public void rollShouldReturnANumberBetween1And6() {
        Dice dice = new NormalDice();

        int output = dice.roll();

        assertTrue(output >= 1);
        assertTrue(output <= 6);
    }
}
