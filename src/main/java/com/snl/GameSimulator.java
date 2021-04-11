package com.snl;

import com.snl.cell.SnakeCell;
import com.snl.dice.CrookedDice;
import com.snl.dice.Dice;
import com.snl.dice.NormalDice;

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

        System.out.println("Choose the dice you want to play with: Press 1 for normal, Press 2 for crooked");
        int diceChoice = scanner.nextInt();
        Dice dice = null;
        switch (diceChoice) {
            case 1:
                dice = new NormalDice();
                break;
            case 2:
                dice = new CrookedDice();
                break;
            default:
                System.out.println("wrong choice of dice, program exiting.....");
                System.exit(0);
        }

        Board board = new Board(boardSize, snakeCellList);
        Game game = new Game(board, dice);
        game.play(10);
        System.out.println("The final position of player is: " + board.getPlayerPosition());
    }
}
