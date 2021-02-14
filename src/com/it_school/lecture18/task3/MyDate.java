package com.it_school.lecture18.task3;


public class MyDate {

    private Month month;
    private int day;
    private DayOfWeek dayOfWeek;

    MyDate(Month month, int day) {
        this.month = month;
        this.day = day;

    }

    MyDate(Month month, int day, DayOfWeek dayOfWeek) {
        this.month = month;
        this.day = day;
        this.dayOfWeek = dayOfWeek;
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
