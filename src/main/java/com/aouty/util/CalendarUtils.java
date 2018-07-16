package com.aouty.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Aouty
 * @date 2018-07-16 22:00
 * @description 日历类
 */
public class CalendarUtils {

    private static String format = "";

    private static Date date = new Date();
    private static SimpleDateFormat formatter = null;

    public static String getDateTimeString() {
        format = "yyyy-MM-dd HH:mm:ss";
        formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

    public static String getDateString() {
        format = "yyyy-MM-dd";
        formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

    public static String getTimeString() {
        format = "HH:mm:ss";
        formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

    public static String get24TimeString() {
        format = "HH:mm:ss";
        formatter = new SimpleDateFormat(format);
        return formatter.format(date);
    }

}
