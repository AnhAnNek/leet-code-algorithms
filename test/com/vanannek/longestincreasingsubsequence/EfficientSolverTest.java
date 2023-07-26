package com.vanannek.longestincreasingsubsequence;

import static org.junit.jupiter.api.Assertions.*;

class EfficientSolverTest extends LongestIncreasingSubTest {

    @Override
    public LongestIncreasingSub createIns() {
        return new EfficientSolver();
    }
}