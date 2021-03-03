package com.it_school.lecture22.task2;

import com.it_school.lecture22.task3.Ignore;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;

/**
 * 2. Написать метод, который принимает любой объект и печатает в консоль значения его полей в формате:
 *
 * модификаторы поля | имя_поля | значение
 *
 * Модификаторы должны быть в читаемом виде (public, protected), а не в виде чисел (1, 3,4)
 * 3. Написать аннотацию @Ignore, которая может применяться только к полям класса.
 * Применить ее к заданию 2: если поле помечено @Ignore - не печатать его в консоль.
 */
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
            if (!field.isAnnotationPresent(Ignore.class)) {
                System.out.println(Modifier.toString(modifiers) + "|" + field.getType() + "|" + field.getName()
                        + "|" + field.get(obj));
            }
        }
    }
}

