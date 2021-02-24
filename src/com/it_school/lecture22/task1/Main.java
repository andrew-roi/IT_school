package com.it_school.lecture22.task1;

import java.lang.reflect.Field;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        ExampleClass exampleClass = new ExampleClass();
        Field[] fields = exampleClass.getClass().getDeclaredFields();// get array fields
        System.out.println(Arrays.toString(fields)); //printing fields
        Field declaredField = exampleClass.getClass().getDeclaredField("s");//save one field which needed
        declaredField.setAccessible(true); // set visibility
        declaredField.set(exampleClass, "abcd"); // change value of String s
        exampleClass.printString();
    }


}
