package com.snl;

public class GameSimulator {
    public static void main(String[] args) {
        Board board = new Board(100, 0);
        Game game = new Game(board, new Dice());
        game.play(10);
        System.out.println("The final position of player is: " + board.getPlayerPosition());
    }
}
