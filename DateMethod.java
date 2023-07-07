package com.example.objectsandclasses;

import java.util.Calendar;
import java.util.Date;

public class DateMethod {
    public static void main(String[] args) {

        //Creates a new "Date" object
        Date today = new Date();
        Date summer = new Date(today.getYear(), 5, 21);
        Date newyear = new Date(today.getYear() + 1, 0, 1);

        //Creates a new "Calendar" object
        Calendar todaycal = Calendar.getInstance();

        long ms, newms;
        int days, newdays;

        System.out.println("Today is " + today);
        System.out.println("Summer begins on " + summer);
        System.out.println("Next year begins on " + newyear);

        System.out.println("Today's year is " + todaycal.get(Calendar.YEAR));
        System.out.println("Today's month is " + (todaycal.get(Calendar.MONTH)) + 1);
        System.out.println("Today's day is " + todaycal.get(Calendar.DAY_OF_MONTH));

        ms = summer.getTime() - today.getTime();
        days = (int)(ms/1000.0/60/60/24);

        System.out.println("Number of milliseconds until summer is " + ms);
        System.out.println("Number of days until summer is " + days);

        newms = newyear.getTime() - today.getTime();
        newdays = (int)(newms/1000.0/60/60/24);

        System.out.println("Number of milliseconds until New Year's Day is " + newms);
        System.out.println("Number of days until New Year's Day is " + newdays);

        Frame1 f = new Frame1();

    }
}