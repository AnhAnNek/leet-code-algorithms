package com.vanannek.longestincreasingsubsequence;

import static org.junit.jupiter.api.Assertions.*;

class NormalSolverTest extends LongestIncreasingSubTest {

    @Override
    public LongestIncreasingSub createIns() {
        return new NormalSolver();
    }
}