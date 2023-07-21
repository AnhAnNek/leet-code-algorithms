package com.vanannek;

import com.vanannek.mergetwosortedlists.EfficientSolver;
import com.vanannek.mergetwosortedlists.ListNode;
import com.vanannek.mergetwosortedlists.NormalSolver;
import com.vanannek.performance.MeasureTime;

public class Main {

    private static MeasureTime measureTime = new MeasureTime();
    private static NormalSolver normalSolver = new NormalSolver();
    private static EfficientSolver efficientSolver = new EfficientSolver();

    public static void main(String[] args) {
        measureTime.printResult(Main::way1, Main::way2);
    }

    public static void way1() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        ListNode merged = normalSolver.mergeTwoLists(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(merged);
    }

    public static void way2() {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(4, null)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4, null)));
        ListNode merged = efficientSolver.mergeTwoLists(list1, list2);
        System.out.println(list1);
        System.out.println(list2);
        System.out.println(merged);
    }
}
