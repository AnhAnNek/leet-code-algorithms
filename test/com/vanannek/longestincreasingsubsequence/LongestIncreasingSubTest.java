package com.vanannek.longestincreasingsubsequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public abstract class LongestIncreasingSubTest {

    public abstract LongestIncreasingSub createIns();

    static Stream<Arguments> testCasesLengthOfLISProvider() {
        return Stream.of(
                Arguments.of(
                        "Test 1",
                        new int[] {10,9,2,5,3,7,101,18},
                        4),
                Arguments.of(
                        "Test 1",
                        new int[] {0,1,0,3,2,3},
                        4),
                Arguments.of(
                        "Test 1",
                        new int[] {7,7,7,7,7,7,7},
                        1)
        );
    }

    @ParameterizedTest
    @MethodSource("testCasesLengthOfLISProvider")
    public void testLengthOfLIS_DifferentItems(String description, int[] nums, int expected) {
        int actual = createIns().lengthOfLIS(nums);
        assertEquals(expected, actual, description);
    }

    static Stream<Arguments> testCasesNumberOfLISProvider() {
        return Stream.of(
                Arguments.of("Test with a mix of elements",
                        new int[]{1, 3, 5, 4, 7},
                        2),

                Arguments.of("Test with an array containing duplicate elements",
                        new int[]{2, 2, 2, 2, 2},
                        5),

                Arguments.of("Test with an empty array",
                        new int[]{},
                        0),

                Arguments.of("Test with an array containing a single element",
                        new int[]{5},
                        1),

                Arguments.of("Test with an array already sorted in ascending order",
                        new int[]{1, 2, 3, 4, 5},
                        1),

                Arguments.of("Test with an array sorted in descending order",
                        new int[]{10, 8, 6, 4, 2},
                        1)
        );
    }
}