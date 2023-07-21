package com.vanannek.pascaltriangleii;

import static org.junit.jupiter.api.Assertions.*;

class EfficientSolverTest extends PascalTriangleIITest {

    @Override
    public PascalTriangleII createIns() {
        return new EfficientSolver();
    }
}