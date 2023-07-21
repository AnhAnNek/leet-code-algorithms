package com.vanannek.pascaltriangleii;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public abstract class PascalTriangleIITest {

    public abstract PascalTriangleII createIns();

    @Test
    public void testGetRow_IndexEqualTo3() {
        final int rowIndex = 3;
        final List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(3);
        expected.add(3);
        expected.add(1);

        List<Integer> actual = createIns().getRow(rowIndex);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetRow_IndexEqualTo0() {
        final int rowIndex = 0;
        final List<Integer> expected = new ArrayList<>();
        expected.add(1);

        List<Integer> actual = createIns().getRow(rowIndex);

        assertEquals(expected, actual);
    }

    @Test
    public void testGetRow_IndexEqualTo1() {
        final int rowIndex = 1;
        final List<Integer> expected = new ArrayList<>();
        expected.add(1);
        expected.add(1);

        List<Integer> actual = createIns().getRow(rowIndex);

        assertEquals(expected, actual);
    }
}