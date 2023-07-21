package com.vanannek.pascaltriangleii;

import java.util.ArrayList;
import java.util.List;

public class EfficientSolver implements PascalTriangleII {
    @Override
    public List<Integer> getRow(int rowIndex) {
        List<Integer> curRow = new ArrayList<>();
        if (rowIndex < 0) return curRow;
        curRow.add(1);

        for (int i = 1; i < rowIndex + 1; i++) {
            for (int j = curRow.size() - 2; j >= 0; j--) {
                curRow.set(j + 1, curRow.get(j + 1) + curRow.get(j));
            }
            curRow.add(1);
        }
        return curRow;
    }
}
