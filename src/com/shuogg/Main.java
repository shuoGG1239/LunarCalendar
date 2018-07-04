package com.shuogg;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

/**
 * Created by shuoGG on 2018/7/4
 */
public class Main {
    public static void main(String[] args) {
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        LocalDate lunar = LunarCalendar.lunar2Solar(2018, 12, 5);
        System.out.println("Solar：" + lunar);
    }
}
