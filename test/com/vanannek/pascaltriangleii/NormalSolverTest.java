package com.vanannek.pascaltriangleii;

import static org.junit.jupiter.api.Assertions.*;

class NormalSolverTest extends PascalTriangleIITest {

    @Override
    public PascalTriangleII createIns() {
        return new NormalSolver();
    }
}