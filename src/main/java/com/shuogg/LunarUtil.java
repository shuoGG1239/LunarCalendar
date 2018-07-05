package com.shuogg;

import java.time.LocalDate;

/**
 * Created by shuoGG on 2018/7/5
 */
public class LunarUtil {
    private LunarUtil() {
    }

    /**
     * 农历转公历
     *
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static LocalDate lunar2Solar(int year, int month, int day) {
        return LunarCalendar.lunar2Solar(year, month, day);
    }

    /**
     * 公历转农历
     *
     * @param year
     * @param month
     * @param day
     * @return
     */
    public static LunarCalendar solar2Lunar(int year, int month, int day) {
        return LunarCalendar.solar2Lunar(year, month, day);
    }
}
