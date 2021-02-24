package com.it_school.lecture22.task2;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {
        MyClass myClass = new MyClass();
        printObjectsFields(myClass);

    }

    public static void printObjectsFields(Object obj) {

        Field[] fields = obj.getClass().getDeclaredFields();
        for (Field f : fields) {
            f.setAccessible(true);
            int modifiers = f.getModifiers();
            System.out.println(Modifier.toString(modifiers) + "|" + f.getType() + "|" + f.getName());
        }

    }
}
