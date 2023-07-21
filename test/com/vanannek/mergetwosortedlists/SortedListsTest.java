package com.vanannek.mergetwosortedlists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class SortedListsTest {
    protected abstract SortedLists createSortedLists();

    @Test
    public void testMergeTwoLists_MultiItems() {
        // Arrange
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        ListNode expected = new ListNode(1, new ListNode(1, new ListNode(2,
                new ListNode(3, new ListNode(4, new ListNode(4))))));

        // Act
        ListNode actual = createSortedLists().mergeTwoLists(list1, list2);

        // Assert
        assertEquals(expected.toString(), actual.toString());
    }

    @Test
    public void testMergeTwoLists_BothEmpty() {
        // Arrange
        ListNode list1 = null;
        ListNode list2 = null;

        // Act
        ListNode actual = createSortedLists().mergeTwoLists(list1, list2);

        // Assert
        assertNull(actual);
    }

    @Test
    public void testMergeTwoLists_AnEmptyList() {
        // Arrange
        ListNode list1 = null;
        ListNode list2 = new ListNode(0);
        ListNode expected = new ListNode(0);

        // Act
        ListNode actual = createSortedLists().mergeTwoLists(list1, list2);

        // Assert
        assertEquals(expected.toString(), actual.toString());
    }
}