package com.snl;

import com.snl.cell.LadderCell;
import com.snl.cell.SnakeCell;
import com.snl.dice.CrookedDice;
import com.snl.dice.Dice;
import com.snl.dice.NormalDice;
import com.snl.logger.ConsoleLogger;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GameSimulator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsoleLogger consoleLogger = new ConsoleLogger();
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

            System.out.println("Enter 1 if the snake is normal, 2 if the snake can only bite once");
            boolean isOneBiteSnake = scanner.nextInt() == 2;

            snakeCellList.add(new SnakeCell(start, end, consoleLogger, isOneBiteSnake));
        }

        System.out.println("Enter the number of ladders on the board\n");
        int numLadders = scanner.nextInt();
        List<LadderCell> ladderCellList = new ArrayList<>();

        for (int i = 0; i < numLadders; i++) {
            System.out.println("Enter start position of ladder\n");
            int start = scanner.nextInt();

            System.out.println("Enter end position of ladder\n");
            int end = scanner.nextInt();

            ladderCellList.add(new LadderCell(start, end, consoleLogger));
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


        Board board = new Board(boardSize, snakeCellList, ladderCellList);
        Game game = new Game(board, dice);
        game.play(20);
        System.out.println("The final position of player is: " + board.getPlayerPosition());
    }
}