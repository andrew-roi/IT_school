package com.it_school.lecture01;


import java.util.Arrays;

/**
 * Написать метод, который принимает массив String и возвращает String,
 * в котором все строки из массива объединены в одну строку через разделитель “|”.
 * Пример:
 * <p>
 * input: [“ab”, “cd”, “ef”]
 * <p>
 * output: “ab|cd|ef”
 */
public class Task_3 {
    public static void main(String[] args){
        System.out.println(commonString(new String[]{"a"}));

    }

    public static String commonString(String[] s) {

        return String.join("|", s);
    }

}
