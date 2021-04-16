package com.snl.cell;

import com.snl.logger.ConsoleLogger;

public class LadderCell implements Cell {
   private int start;
   private int end;
    private ConsoleLogger consoleLogger;

    public LadderCell(int start, int end, ConsoleLogger consoleLogger) {
        this.start = start;
        this.end = end;
        this.consoleLogger = consoleLogger;
    }

    @Override
    public int getNewPosition() {
        this.consoleLogger.print("The start position of ladder is: " + this.start + " and the end position is: " + this.end);
        return end;
    }

    public int getStart() {
        return this.start;
    }
}
