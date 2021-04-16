package com.snl;

import com.snl.cell.LadderCell;
import com.snl.cell.SnakeCell;
import com.snl.logger.ConsoleLogger;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {
    private List<LadderCell> ladderCellList = new ArrayList<LadderCell>();
    private ConsoleLogger consoleLogger = new ConsoleLogger();

    @Test
    public void shouldUpdateThePositionByAddingTheDiceOutput() {
        Board board = new Board(100, new ArrayList<>(), ladderCellList);

        board.updatePlayerPosition(2);

        assertEquals(2, board.getPlayerPosition());
    }

    @Test
    public void shouldNotUpdateThePositionWhenAddingDiceOutputTakesItBeyondBoardSize() {
        Board board = new Board(2, new ArrayList<>(), ladderCellList);

        board.updatePlayerPosition(3);

        assertEquals(0, board.getPlayerPosition());
    }

    @Test
    public void shouldUpdateThePositionToTailOfTheSnakeWhenPlayerLandsOnSnakeCell() {
        Board board = new Board(100, Collections.singletonList(new SnakeCell(2, 1, consoleLogger, false)), ladderCellList);

        board.updatePlayerPosition(2);

        assertEquals(1, board.getPlayerPosition());
    }

    @Test
    public void shouldUpdateThePositionToTHeadOfTheLadderWhenPlayerLandsOnLadderCell() {
        Board board = new Board(100, new ArrayList<>(), Collections.singletonList(new LadderCell(2, 4, consoleLogger)));

        board.updatePlayerPosition(2);

        assertEquals(4, board.getPlayerPosition());
    }
}
