package com.snl;

import com.snl.cell.SnakeCell;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the size of the board \n");
        int boardSize = scanner.nextInt();

        System.out.println("Enter the number of snakes on the board\n");
        int numSnakes = scanner.nextInt();
        List<SnakeCell> snakeCellList = new ArrayList<>();
        for (int i = 0; i < numSnakes; i++) {
            System.out.println("Enter start position of snake\n");
            int start = scanner.nextInt();

            System.out.println("Enter end position of snake\n");
            int end = scanner.nextInt();

            snakeCellList.add(new SnakeCell(start, end));
        }

        Board board = new Board(boardSize, snakeCellList);
        Game game = new Game(board, new Dice());
        game.play(10);
        System.out.println("The final position of player is: " + board.getPlayerPosition());
    }
}
