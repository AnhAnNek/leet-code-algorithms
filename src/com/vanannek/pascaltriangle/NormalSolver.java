package com.vanannek.pascaltriangle;

import java.util.ArrayList;
import java.util.List;

public class NormalSolver implements PascalTriangle {

    @Override
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascalTriangle = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();
            for (int z = 0; z < i + 1; z++)
                row.add(1);

            for (int j = 1; j < i; j++) {
                int res = pascalTriangle.get(i - 1).get(j - 1) + pascalTriangle.get(i - 1).get(j);
                row.set(j, res);
            }

            pascalTriangle.add(row);
        }

        return pascalTriangle;
    }
}
