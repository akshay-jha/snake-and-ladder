package com.snl;

import com.snl.cell.Cell;
import com.snl.cell.DefaultCell;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GameTest {

    @Test
    public void playShouldUpdateThePlayerPositionForAGameOf5Rounds() {
        Board board = new Board(50, new ArrayList<>());
        Dice dice = mock(Dice.class);
        Game game = new Game(board, dice);

        when(dice.roll()).thenReturn(1, 1, 1, 1, 1);
        game.play(5);

        assertEquals(5, board.getPlayerPosition());
    }
}