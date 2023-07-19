package com.vanannek.betweentwodates;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class BetweenTwoDatesTest {

    private BetweenTwoDatesImpl sol = new BetweenTwoDatesImpl();

    @Test
    public void daysBetweenDates_TheSameYearAndMonth() {
        final int daysExpected = 1;

        int daysActual = sol.daysBetweenDates("2019-06-29", "2019-06-30");

        assertEquals(daysExpected, daysActual);
    }

    @Test
    public void daysBetweenDates_TheSameYear() {
        final int daysExpected = 334;

        int daysActual = sol.daysBetweenDates("2019-01-31", "2019-12-31");

        assertEquals(daysExpected, daysActual);
    }

    @Test
    public void daysBetweenDates_DifferentYear() {
        final int daysExpected = 15;

        int daysActual = sol.daysBetweenDates("2020-01-15", "2019-12-31");

        assertEquals(daysExpected, daysActual);
    }

    @Test
    public void daysBetweenDates_BigResult() {
        final int daysExpected = 14331;

        int daysActual = sol.daysBetweenDates("1971-06-29", "2010-09-23");

        assertEquals(daysExpected, daysActual);
    }

    @Test
    public void daysBetweenDates_BigResult1() {
        final int daysExpected = 33485;

        int daysActual = sol.daysBetweenDates("2074-09-12", "1983-01-08");

        assertEquals(daysExpected, daysActual);
    }

    /**
     * Documentation: This is a parameterized test method to test the 'getDayByMonthYear' method.
     * It takes various combinations of month and year as input parameters and compares the result with the expected number of days.
     *
     * @param month The numeric representation of the month (1 to 12).
     * @param year  The year for which the number of days in the month is to be determined.
     * @param dayExpected The expected number of days in the specified month and year combination.
     */
    @ParameterizedTest
    @CsvSource({
            // Test cases with the format "month, year, dayExpected"
            // January 2023 has 31 days
            "1, 2023, 31",
            // February 2020 (leap year) has 29 days
            "2, 2020, 29",
            // February 2021 has 28 days
            "2, 2021, 28",
            // March 2022 has 31 days
            "3, 2022, 31",
            // April 2024 has 30 days
            "4, 2024, 30",
            // May 2025 has 31 days
            "5, 2025, 31",
            // June 2026 has 30 days
            "6, 2026, 30",
            // July 2027 has 31 days
            "7, 2027, 31",
            // August 2028 has 31 days
            "8, 2028, 31",
            // September 2029 has 30 days
            "9, 2029, 30",
            // October 2030 has 31 days
            "10, 2030, 31",
            // November 2031 has 30 days
            "11, 2031, 30",
            // December 2032 has 31 days
            "12, 2032, 31"
    })
    public void getDayByMonthYear_True(int month, int year, final int dayExpected) {
        int dayActual = sol.getDayByMonthYear(month, year);

        assertEquals(dayExpected, dayActual);
    }
}