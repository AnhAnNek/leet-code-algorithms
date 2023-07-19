package com.vanannek.betweentwodates;

public class BetweenTwoDates {
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

    public boolean isLeapYear(int year) {
        return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
    }
}