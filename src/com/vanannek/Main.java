package com.vanannek;

import com.vanannek.dayoftheweek.DayWeek;
import com.vanannek.performance.Executor;
import com.vanannek.performance.MeasureTime;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static MeasureTime measureTime = new MeasureTime();
    private static DayWeek dayWeek = new DayWeek();

    public static void main(String[] args) {
        measureTime.printResult(Main::way1, Main::way2);
    }

    public static void way1() {
        System.out.println(dayWeek.dayOfTheWeek(14,9,1998)); //Monday
    }

    public static void way2() {
    }
}
