package com.snl;

public class Board {
    private int size;
    private int playerPosition;

    public Board(int size, int playerPosition) {
        this.size = size;
        this.playerPosition = playerPosition;
    }

    public void updatePlayerPosition(int diceOutput) {
        int position = this.playerPosition + diceOutput;
        if (position < size)
            this.playerPosition = position;
    }

    public int getPlayerPosition() {
        return playerPosition;
    }
}
