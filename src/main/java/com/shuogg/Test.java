package com.shuogg;

import java.time.LocalDate;

/**
 * Created by shuoGG on 2018/7/4
 */
public class Test {
    public static void main(String[] args) {
        LunarCalendar c1 = new LunarCalendar(2018, 7,5, false);
        System.out.println(c1);
        System.out.println(c1.getSolar());

        LunarCalendar c2 = new LunarCalendar(2018, 1,1,true);
        System.out.println(c2);
        System.out.println(c2.getSolar());
    }
}
