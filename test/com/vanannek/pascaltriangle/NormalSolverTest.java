package com.vanannek.pascaltriangle;

class NormalSolverTest extends PascalTriangleTest {

    @Override
    public PascalTriangle createIns() {
        return new NormalSolver();
    }
}