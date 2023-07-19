package com.vanannek.performance;

public class MeasureTime {
    public void printResult(Executor executor1, Executor executor2) {
        printResult(executor1, "Runtime of executor1: ");
        printResult(executor2, "Runtime of executor2: ");
        System.out.println();
    }

    public void printResult(Executor executor, String message) {
        long runTime = measureRuntime(executor::exe);
        System.out.println(message + runTime + " ms");
    }

    /**
     * Measures the runtime of a task executed by the given Executor.
     *
     * This method calculates the elapsed time (in milliseconds) taken to execute the task
     * performed by the provided Executor. It captures the system time before and after
     * executing the task and returns the difference, representing the runtime in milliseconds.
     *
     * @param executor The Executor instance responsible for executing the task.
     * @return The elapsed time (in milliseconds) taken to execute the task.
     */
    public long measureRuntime(Executor executor) {
        long start = System.currentTimeMillis();
        executor.exe();
        long end = System.currentTimeMillis();
        return end - start;
    }
}
