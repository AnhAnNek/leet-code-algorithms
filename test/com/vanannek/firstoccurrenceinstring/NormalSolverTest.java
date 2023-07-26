package com.vanannek.firstoccurrenceinstring;

import static org.junit.jupiter.api.Assertions.*;

class NormalSolverTest extends FirstOccurrenceStringTest {

    @Override
    public FirstOccurrenceString createIns() {
        return new NormalSolver();
    }
}