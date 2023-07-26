package com.vanannek.firstoccurrenceinstring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

abstract class FirstOccurrenceStringTest {

    public abstract FirstOccurrenceString createIns();

    @Test
    public void testStrStr_Case01() {
        final String haystack = "sadbutsad";
        final String needle = "sad";
        final int expectedIndex = 0;

        int actualIndex = createIns().strStr(haystack, needle);

        assertEquals(expectedIndex, actualIndex);
    }

    @Test
    public void testStrStr_Case02() {
        final String haystack = "leetcode";
        final String needle = "leeto";
        final int expectedIndex = -1;

        int actualIndex = createIns().strStr(haystack, needle);

        assertEquals(expectedIndex, actualIndex);
    }
}