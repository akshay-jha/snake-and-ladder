package com.snl.cell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnakeCellTest {

    @Test
    void getNewPositionShouldReturnTailPositionOfTheSnake() {
        SnakeCell snakeCell = new SnakeCell(14, 7);

        assertEquals(7, snakeCell.getNewPosition());
    }

    @Test
    void getStartShouldReturnTheHeadPositionOfTheSnake() {
        SnakeCell snakeCell = new SnakeCell(14, 7);

        assertEquals(14, snakeCell.getStart());
    }
}