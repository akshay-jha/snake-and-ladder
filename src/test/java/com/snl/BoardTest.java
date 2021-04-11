package com.snl;

import com.snl.cell.SnakeCell;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {

    @Test
    public void shouldUpdateThePositionByAddingTheDiceOutput() {
        Board board = new Board(100, new ArrayList<>());

        board.updatePlayerPosition(2);

        assertEquals(2, board.getPlayerPosition());
    }

    @Test
    public void shouldNotUpdateThePositionWhenAddingDiceOutputTakesItBeyondBoardSize() {
        Board board = new Board(2, new ArrayList<>());

        board.updatePlayerPosition(3);

        assertEquals(0, board.getPlayerPosition());
    }

    @Test
    public void shouldUpdateThePositionToTailOfTheSnakeWhenPlayerLandsOnSnakeCell() {
        Board board = new Board(100, Collections.singletonList(new SnakeCell(2, 1)));

        board.updatePlayerPosition(2);

        assertEquals(1, board.getPlayerPosition());
    }
}
