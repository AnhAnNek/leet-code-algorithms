package com.vanannek.mergetwosortedlists;

public class EfficientSolver implements SortedLists {

    /**
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public ListNode mergeTwoLists(final ListNode list1, final ListNode list2) {
        // add redundant node
        ListNode prehead = new ListNode(-1);
        ListNode cur = prehead;

        ListNode node1 = list1;
        ListNode node2 = list2;
        while (node1 != null && node2 != null) {
            if (node1.val < node2.val) {
                cur.next = node1;
                node1 = node1.next;
            } else {
                cur.next = node2;
                node2 = node2.next;
            }
            cur = cur.next;
        }
        cur.next = node1 != null ? node1 : node2;
        return prehead.next;
    }
}
