package com.it_school.lecture18.task3;

public class MyDate {

    private static Month month;
    private  int day;
    private DayOfWeek dayOfWeek;

    MyDate(Month month, int day) {
        MyDate.month = month;
        this.day = day;

    }

    MyDate(Month month, int day, DayOfWeek dayOfWeek) {
        MyDate.month = month;
        this.day = day;
        this.dayOfWeek = dayOfWeek;
    }

    public static Month getMonth() {
        return month;
    }

    public static void setMonth(Month month) {
        MyDate.month = month;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }


    public enum Month {
        January, February, March, April, May, June, July, August, September, October, November, December
    }

    public enum DayOfWeek {
        Sunday, Monday, Tuesday, Wednesday, Thursday, Friday, Saturday
    }

}
