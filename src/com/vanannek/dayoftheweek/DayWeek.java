package com.vanannek.dayoftheweek;

import java.util.Calendar;
import java.util.Date;

public class DayWeek {

    public String dayOfTheWeek(int day, int month, int year) {
        int[] nums = new int[] {0,3,3,6,1,4,6,2,5,0,3,5};
        String[] results = new String[]{"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int last2Digits = year % 100;
        int n = last2Digits / 4;
        int sum = last2Digits + n + day + nums[month - 1] + getCenturyYearValue(year);
        if (isLeapYear(year)) sum--;
        return results[sum % 7];
    }

    public int getCenturyYearValue(int year) {
        if (year < 1800) return 4;
        if (year < 1900) return 2;
        if (year < 2000) return 0;
        return 6;
    }

    public boolean isLeapYear(int year) {
        return year % 400 == 0 && (year % 4 == 0 || year % 100 != 0);
    }
}
