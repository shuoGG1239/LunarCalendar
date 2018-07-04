package com.shuogg;

import java.time.LocalDate;

/**
 * Created by shuoGG on 2018/7/4
 */
public class Main {
    public static void main(String[] args) {
        LocalDate lunar = LunarCalendar.lunar2Solar(1993, 12, 3);
        System.out.println(lunar);
    }
}
