package com.snl.cell;

public class SnakeCell implements Cell {
    private final int start;
    private final int end;

    public SnakeCell(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public int getNewPosition() {
        return this.end;
    }

    public int getStart() {
        return start;
    }
}
