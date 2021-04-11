package com.snl;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class DiceTest {

    @Test
    public void rollShouldReturnANumberBetween1And6() {
        Dice dice = new Dice();

        int output = dice.roll();

        assertTrue(output >= 1);
        assertTrue(output <= 6);
    }
}
