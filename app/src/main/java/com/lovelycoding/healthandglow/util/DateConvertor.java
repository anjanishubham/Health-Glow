package com.lovelycoding.healthandglow.util;

import android.text.format.DateFormat;

import java.util.Calendar;
import java.util.Locale;

public class DateConvertor {

    public static String getDate(long timestamp) {
        Calendar cal = Calendar.getInstance(Locale.ENGLISH);
        cal.setTimeInMillis(timestamp * 1000L);
        String date = DateFormat.format("dd-MMMM", cal).toString();
        return date;
    }
}
