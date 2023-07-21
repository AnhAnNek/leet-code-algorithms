package com.vanannek.mergetwosortedlists;

import java.util.List;

public class ListNode {
    int val;
    ListNode next;

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public int getSize() {
        int size = 0;
        ListNode node = this;
        while (node != null) {
            size++;
            node = node.next;
        }
        return size;
    }

    @Override
    public String toString() {
        ListNode node = this;
        String s = String.valueOf(node.val);
        node = node.next;
        while (node != null) {
            s += " " + node.val;
            node = node.next;
        }
        return s;
    }
}
