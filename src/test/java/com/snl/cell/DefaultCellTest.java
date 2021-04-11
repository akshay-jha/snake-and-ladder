package com.snl.cell;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DefaultCellTest {

    @Test
    void getNewPositionShouldReturnTheExistingPositionAsItIs() {
        DefaultCell defaultCell = new DefaultCell(5);

        assertEquals(5, defaultCell.getNewPosition());
    }
}