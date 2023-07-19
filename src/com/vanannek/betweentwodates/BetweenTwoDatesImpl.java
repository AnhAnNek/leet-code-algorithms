package com.vanannek.betweentwodates;

public class BetweenTwoDatesImpl {
    /**
     * Calculates the number of days between two given dates.
     *
     * This algorithm takes two date strings in the format "YYYY-MM-DD" and calculates the number of days
     * between them. It converts each date into the number of days elapsed since January 1, 1971, to
     * facilitate the calculation. The difference between the two dates in days is then returned.
     *
     * Note: The dates should be in a valid "YYYY-MM-DD" format, and date2 should not be earlier than date1.
     *
     * @param date1 The first date string in the format "YYYY-MM-DD".
     * @param date2 The second date string in the format "YYYY-MM-DD".
     * @return The number of days between date1 and date2.
     *
     * @throws IllegalArgumentException If either date1 or date2 is not in the correct format,
     *                                  or if date2 is earlier than date1.
     *
     * @example
     * int days1 = daysBetweenDates("2023-07-15", "2023-07-20"); // 5 days between the two dates
     * int days2 = daysBetweenDates("2023-07-20", "2023-07-15"); // 5 days between the two dates
     * int days3 = daysBetweenDates("2023-07-15", "2023-07-15"); // 0 days, same date
     *
     * @see <a href="https://leetcode.com/problems/number-of-days-between-two-dates/description/">
     *     1360. Number of Days Between Two Dates
     *     </a>
     */
    public int daysBetweenDates(String date1, String date2) {
        int firstDays = daysFrom1971(date1);
        int secondDays = daysFrom1971(date2);
        return Math.abs(firstDays - secondDays);
    }

    public int daysFrom1971(String date) {
        String[] dateInfo = date.split("-");
        int day = Integer.valueOf(dateInfo[2]), month = Integer.valueOf(dateInfo[1]), year = Integer.valueOf(dateInfo[0]);
        int totalDays = day;
        for (int monthIndex = 1; monthIndex < month; monthIndex++)
            totalDays += getDayByMonthYear(monthIndex, year);
        for (int yearIndex = 1971; yearIndex < year; yearIndex++)
            totalDays += getDaysByYear(yearIndex);
        return totalDays;
    }

    public int getDayByMonthYear(int month, int year) {
        if (month == 4 || month == 6 || month == 9 || month == 11)
            return 30;
        if (month == 2 && isLeapYear(year))
            return 29;
        if (month == 2)
            return 28;
        return 31;
    }

    public int getDaysByYear(int year) {
        return isLeapYear(year) ? 366 : 365;
    }

    /**
     * Determines whether a given year is a leap year or not.
     *
     * A leap year occurs every 4 years, except for years that are exactly divisible by 100.
     * However, years that are divisible by 400 are also considered leap years.
     *
     * @param year The year to be checked for leap year.
     * @return true if the year is a leap year, false otherwise.
     *
     * @throws IllegalArgumentException If the input year is negative (less than 0).
     */
    public boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}