package com.vanannek.pascaltriangle;

class EfficientSolverTest extends PascalTriangleTest {

    @Override
    public PascalTriangle createIns() {
        return new EfficientSolver();
    }
}