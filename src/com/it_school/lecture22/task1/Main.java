package com.it_school.lecture22.task1;

import java.lang.reflect.Field;

/**
 * 1. С помощью рефлексии изменить значение строки "hello".
 *
 * Ожидаемое решение:
 *
 * String s = "hello";
 * // some work with reflection
 * System.out.println(s); // print "ABCDE"
 *
 * Решение s = "ABCDE" - не засчитывается.
 */
public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        String s = "hello";
        Field field = String.class.getDeclaredField("value");
        field.setAccessible(true);

        byte[] value = {'A', 'B', 'C', 'D', 'E'};
        field.set(s, value);
        System.out.println(s);
    }


}
