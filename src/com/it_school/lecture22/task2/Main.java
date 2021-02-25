package com.it_school.lecture22.task2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        MyClass myClass = new MyClass();
        printObjectsFields(myClass);
    }


    public static void printObjectsFields(Object obj) throws IllegalAccessException {

        Field[] fields = obj.getClass().getDeclaredFields();
        System.out.println(Arrays.toString(fields));
        for (Field f : fields) {
            f.setAccessible(true);
        }

        int modifiers = obj.getClass().getModifiers();
        for (Field field : fields) {
            Object value = field.get(obj);
            System.out.println(Modifier.toString(modifiers) + "|" + value.getClass().getName()
                    + "|" + value);
        }


    }
}
