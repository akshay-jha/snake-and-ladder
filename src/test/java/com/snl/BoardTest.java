package com.snl;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {

    @Test
    public void shouldUpdateThePositionByAddingTheDiceOutput() {
        Board board = new Board(100, 0);

        board.updatePlayerPosition(2);

        assertEquals(2, board.getPlayerPosition());
    }

    @Test
    public void shouldNotUpdateThePositionIfAddingDiceOutputTakesItBeyondBoardSize() {
        Board board = new Board(100, 99);

        board.updatePlayerPosition(2);

        assertEquals(99, board.getPlayerPosition());
    }
}
