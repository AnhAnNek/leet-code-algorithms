package com.vanannek.mergetwosortedlists;

public class NormalSolver implements SortedLists {

    /**
     * Time complexity: O(n) or O(n)
     * Space complexity:
     */
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode merged = null;
        ListNode node1 = list1;
        ListNode node2 = list2;
        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                merged = addItems(merged, node1.val);
                node1 = node1.next;
            } else {
                merged = addItems(merged, node2.val);
                node2 = node2.next;
            }
        }
        while (node1 != null) {
            merged = addItems(merged, node1.val);
            node1 = node1.next;
        }
        while (node2 != null) {
            merged = addItems(merged, node2.val);
            node2 = node2.next;
        }
        return merged;
    }

    public ListNode addItems(ListNode root, int value) {
        ListNode add = new ListNode(value, null);
        if (root == null) {
            return add;
        }
        ListNode node = root;
        while (node.next != null)
            node = node.next;
        node.next = add;
        return root;
    }
}
