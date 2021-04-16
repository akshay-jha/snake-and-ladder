package com.snl;

import com.snl.cell.Cell;
import com.snl.cell.DefaultCell;
import com.snl.cell.LadderCell;
import com.snl.cell.SnakeCell;

import java.util.ArrayList;
import java.util.List;

public class Board {
    private int size;
    private int playerPosition;
    private List<Cell> cells = new ArrayList<>();

    private void initializeCells(List<SnakeCell> snakeCells, List<LadderCell> ladderCellList) {
        for (int i = 0; i < size; i++) {
            cells.add(new DefaultCell(i + 1));
        }
        snakeCells.forEach(snakeCell -> cells.set(snakeCell.getStart() - 1, snakeCell));
        ladderCellList.forEach(ladderCell -> cells.set(ladderCell.getStart() - 1, ladderCell));
    }

    public Board(int size, List<SnakeCell> snakeCells, List<LadderCell> ladderCellList) {
        this.size = size;
        this.playerPosition = 0;
        initializeCells(snakeCells, ladderCellList);
    }

    public void updatePlayerPosition(int diceOutput) {
        int position = this.playerPosition + diceOutput;
        if (position < size)
            this.playerPosition = cells.get(position - 1).getNewPosition();
    }

    public int getPlayerPosition() {
        return playerPosition;
    }
}
