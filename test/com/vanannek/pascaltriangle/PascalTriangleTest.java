package com.vanannek.pascaltriangle;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public abstract class PascalTriangleTest {

    public abstract PascalTriangle createIns();

    @Test
    public void testGenerate() {
        final int numRows = 5;
        final List<List<Integer>> expected = new ArrayList<>();
        expected.add(Arrays.asList(1));
        expected.add(Arrays.asList(1, 1));
        expected.add(Arrays.asList(1, 2, 1));
        expected.add(Arrays.asList(1, 3, 3, 1));
        expected.add(Arrays.asList(1, 4, 6, 4, 1));

        List<List<Integer>> actual = createIns().generate(numRows);

        assertEquals(expected.toString(), actual.toString());
    }
}