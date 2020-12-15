package com.it_school.lectureOne;


import java.util.Arrays;
import java.util.OptionalInt;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * Task
 * Создать 2 массива случайного размера (от 5 до 15). Один заполнить случайными четными числами от 0 до 100,
 * другой – нечетными от 0 до 100.
 * Напечатать оба массива в консоль. Найти максимальный и минимальный элементы в них и напечатать их.
 */
public class Task_2 {
    public static void main(String[] args) {
        Random random = new Random();


        int[] ints = random.ints((int) (5 + Math.random() + 10), 0, 99).toArray();
        int[] array1 = IntStream.of(ints).filter(x -> x % 2 == 0).toArray();//проинициализировал массивы при объявлении
        int[] array2 = IntStream.of(ints).filter(x -> x % 2 == 1).toArray();//проинициализировал массивы при объявлении


        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        OptionalInt max1 = Arrays.stream(array1).max();
        OptionalInt min1 = Arrays.stream(array1).min();
        OptionalInt max2 = Arrays.stream(array2).max();
        OptionalInt min2 = Arrays.stream(array2).min();
        System.out.println("Max number of the 1 array is " + max1);
        System.out.println("Min number of the 1 array is " + min1);
        System.out.println("Max number of the 2 array is " + max2);
        System.out.println("Min number of the 2 array is " + min2);

    }
}
