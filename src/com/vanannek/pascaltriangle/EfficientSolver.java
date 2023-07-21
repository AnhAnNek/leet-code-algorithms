package com.vanannek.pascaltriangle;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EfficientSolver implements PascalTriangle {
    @Override
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows == 0) return triangle;

        List<Integer> firstRow = new ArrayList();
        firstRow.add(1);
        triangle.add(firstRow);

        List<Integer> prevRow = firstRow, row = null;
        for (int i = 1; i < numRows; i++) {
            row = new ArrayList<>();
            row.add(1);

            for (int j = 1; j < i; j++) {
                row.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            row.add(1);
            prevRow = row;
            triangle.add(row);
        }

        return triangle;
    }
}
