package com.vanannek;

import com.vanannek.performance.Executor;
import com.vanannek.performance.MeasureTime;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private static MeasureTime measureTime = new MeasureTime();

    public static void main(String[] args) {
        measureTime.printResult(Main::way1, Main::way2);
    }

    public static void way1() {
    }

    public static void way2() {
    }
}
