package com.snl;

public class Game {
    private final Board board;
    private final Dice dice;

    public Game(Board board, Dice dice) {
        this.board = board;
        this.dice = dice;
    }

    public void play(int numRounds) {
        for (int i = 0; i < numRounds; i++) {
            int diceOutput = dice.roll();
            board.updatePlayerPosition(diceOutput);
        }
    }
}
