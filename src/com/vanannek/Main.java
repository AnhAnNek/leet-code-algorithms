package com.vanannek;

import com.vanannek.betweentwodates.BetweenTwoDates;
import com.vanannek.betweentwodates.BetweenTwoDates2;
import com.vanannek.performance.MeasureTime;

public class Main {

    private static MeasureTime measureTime = new MeasureTime();
    private static BetweenTwoDates betweenTwoDates = new BetweenTwoDates();
    private static BetweenTwoDates2 betweenTwoDates2 = new BetweenTwoDates2();

    public static void main(String[] args) {
        measureTime.printResult(Main::way1, Main::way2);
    }

    public static void way1() {
        int days = betweenTwoDates.daysBetweenDates("2074-09-12", "1983-01-08");
        System.out.println(days);
    }

    public static void way2() {
        int days = betweenTwoDates2.daysBetweenDates("2074-09-12", "1983-01-08");
        System.out.println(days);
    }
}
