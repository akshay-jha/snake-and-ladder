package com.snl.cell;

import com.snl.logger.ConsoleLogger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnakeCellTest {

    @Test
    void getNewPositionShouldReturnTailPositionOfTheSnake() {
        SnakeCell snakeCell = new SnakeCell(14, 7, new ConsoleLogger(), false);

        assertEquals(7, snakeCell.getNewPosition());
    }

    @Test
    void getNewPositionShouldReturnTailPositionOfTheSnakeOnlyOnceIfItIsAOneBiteSnake() {
        SnakeCell oneBiteSnakeCell = new SnakeCell(14, 7, new ConsoleLogger(), true);

        assertEquals(7, oneBiteSnakeCell.getNewPosition());
        assertEquals(14, oneBiteSnakeCell.getNewPosition());
    }

    @Test
    void getStartShouldReturnTheHeadPositionOfTheSnake() {
        SnakeCell snakeCell = new SnakeCell(14, 7, new ConsoleLogger(), false);

        assertEquals(14, snakeCell.getStart());
    }
}