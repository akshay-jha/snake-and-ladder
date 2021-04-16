package com.snl.cell;

import com.snl.logger.ConsoleLogger;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LadderCellTest {

    @Test
    void getNewPositionShouldReturnTailPositionOfTheSnake() {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        LadderCell ladderCell = new LadderCell(7, 14, consoleLogger);

        assertEquals(14, ladderCell.getNewPosition());
    }

    @Test
    void getGetStartShouldReturnHeadPositionOfTheLadder() {
        ConsoleLogger consoleLogger = new ConsoleLogger();
        LadderCell ladderCell = new LadderCell(7, 14, consoleLogger);

        assertEquals(7, ladderCell.getStart());
    }

}
