package com.it_school.lecture14;

import java.util.ArrayList;
import java.util.List;

/**
 * Написать класс Reader, который реализует интерфейс Runnable.
 * Должен быть конструктор, который принимает список чисел.
 * В методе run() 1 раз в 1 секунду нужно проверять есть ли элементы в списке.
 * Если есть - печатать их в консоль и удалять. Если нет - печатать в консоль дату и сообщение "The list is empty".
 *
 * Написать класс Writer, который реализует интерфейс Runnable.
 * Должен быть конструктор, который принимает список чисел.
 * В методе run() 1 раз в 2.5 секунды нужно добавлять случайные числа в список.
 *
 * Создать список и объекты Reader и Writer, передать один и тот же список обоим.
 * Создать 1 поток для Reader и 1 для Writer, запустить их.
 */
public class Main {
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();

        Writer writer = new Writer(list);
        Reader reader = new Reader(list);


        Thread readerThread = new Thread(reader);
        Thread writerThread = new Thread(writer);

        writerThread.start();
        readerThread.start();
    }

}
