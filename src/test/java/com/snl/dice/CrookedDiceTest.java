package com.snl.dice;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class CrookedDiceTest {

    @Test
    void rollShouldReturnAnEvenNumberBetween1And6() {
        List<Integer> expectedOutputs = Arrays.asList(2, 4, 6);
        Dice dice = new CrookedDice();

        assertTrue(expectedOutputs.contains(dice.roll()));
    }
}