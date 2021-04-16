package com.snl;

import com.snl.dice.NormalDice;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class GameTest {

    @Test
    public void playShouldUpdateThePlayerPositionForAGameOf5Rounds() {
        Board board = new Board(50, new ArrayList<>(), new ArrayList<>());
        NormalDice dice = mock(NormalDice.class);
        Game game = new Game(board, dice);

        when(dice.roll()).thenReturn(1, 1, 1, 1, 1);
        game.play(5);

        assertEquals(5, board.getPlayerPosition());
    }
}