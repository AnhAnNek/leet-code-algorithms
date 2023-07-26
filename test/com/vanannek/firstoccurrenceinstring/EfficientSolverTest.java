package com.vanannek.firstoccurrenceinstring;

import static org.junit.jupiter.api.Assertions.*;

class EfficientSolverTest extends FirstOccurrenceStringTest {

    @Override
    public FirstOccurrenceString createIns() {
        return new EfficientSolver();
    }
}