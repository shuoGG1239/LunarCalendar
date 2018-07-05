package com.shuogg;

import java.time.LocalDate;

/**
 * Created by shuoGG on 2018/7/5
 */
public class LunarUtil {
    private LunarUtil() {
    }

    public static LocalDate lunar2Solar(int year, int month, int day) {
        return LunarCalendar.lunar2Solar(year, month, day);
    }

    public static LunarCalendar solar2Lunar(int year, int month, int day) {
        return LunarCalendar.solar2Lunar(year, month, day);
    }
}
