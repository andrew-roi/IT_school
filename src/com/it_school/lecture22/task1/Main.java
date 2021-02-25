package com.it_school.lecture22.task1;

import java.lang.reflect.Field;

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
