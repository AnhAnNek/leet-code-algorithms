package com.vanannek.mergetwosortedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NormalSolverTest extends SortedListsTest {

    @Override
    protected SortedLists createSortedLists() {
        return new NormalSolver();
    }

    @Test
    public void testAddItems() {
        // Arrange
        ListNode root = null;
        int valExpected = 10;

        // Act
        root = ((NormalSolver) createSortedLists()).addItems(root, valExpected);

        // Assert
        assertEquals(valExpected, root.val);
    }
}