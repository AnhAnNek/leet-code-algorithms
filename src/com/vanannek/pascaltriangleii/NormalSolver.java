package com.vanannek.pascaltriangleii;

import java.util.ArrayList;
import java.util.List;

public class NormalSolver implements PascalTriangleII {

    @Override
    public List<Integer> getRow(int rowIndex) {
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);

        if (rowIndex == 0) return firstRow;

        List<Integer> prevRow = firstRow, curRow = firstRow;
        for (int i = 1; i < rowIndex + 1; i++) {
            curRow = new ArrayList<>();
            curRow.add(1);
            for (int j = 1; j < i; j++) {
                curRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }
            curRow.add(1);
            prevRow = curRow;
        }
        return curRow;
    }
}
