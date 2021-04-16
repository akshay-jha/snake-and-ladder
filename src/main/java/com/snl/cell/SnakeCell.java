package com.snl.cell;

import com.snl.logger.ConsoleLogger;

public class SnakeCell implements Cell {
    private final int start;
    private final int end;
    private ConsoleLogger consoleLogger;
    private boolean isOneBiteSnake;
    private boolean hasAlreadyBitten;

    public SnakeCell(int start, int end, ConsoleLogger consoleLogger, boolean isOneBiteSnake) {
        this.start = start;
        this.end = end;
        this.consoleLogger = consoleLogger;
        this.isOneBiteSnake = isOneBiteSnake;
    }

    @Override
    public int getNewPosition() {
        this.consoleLogger.print("The start position of snake is: " + this.start + " and the end position is: " + this.end);
        this.consoleLogger.print("Can the snake bite only once? :" + isOneBiteSnake);
        this.consoleLogger.print("Has it already bitten? :" + hasAlreadyBitten);

        if(isOneBiteSnake && hasAlreadyBitten) {
            return this.start;
        } else {
            hasAlreadyBitten = true;
            return this.end;
        }
    }

    public int getStart() {
        return start;
    }
}
