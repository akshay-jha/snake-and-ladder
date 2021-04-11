package com.snl.cell;

public class DefaultCell implements Cell {
    private int position;

    public DefaultCell(int position) {
        this.position = position;
    }

    @Override
    public int getNewPosition() {
        return position;
    }
}
