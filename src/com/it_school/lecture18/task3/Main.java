package com.it_school.lecture18.task3;

/**
 * Написать класс MyDate. В нем должны быть определены статические классы Month и DayOfWeek. Поля класса MyDate:
 * Month month;
 * int day;
 * DayOfWeek dayOfWeek;
 * Создать несколько объектов MyDate с помощью конструкторов:
 * MyDate(Month, int day)
 * MyDate(Month, int day, DayOfWeek dayOfWeek)
 * Подумайте, можно ли сделать вложенные классы перечислениями (энамами).
 */
public class Main {
    public static void main(String[] args) {
        MyDate date1 = new MyDate(MyDate.Month.January,2);
        MyDate date2 = new MyDate(MyDate.Month.February,9, MyDate.DayOfWeek.Tuesday);



    }
}
