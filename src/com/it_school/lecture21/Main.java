package com.it_school.lecture21;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * Напишите Supplier-функцию (которая ничего не принимает, но возращает значение),
 * которая рандомно возращает число от 0 до 10 с задержкой 500 мс.
 * С помощью этой функции создайте стрим (метод generate у интерфейса Stream).
 * Возведите каждый элемент потока в 3 степень. Если результат больше 100, то печатайте его в консоль.
 * Ограничьте поток 100 элементами.

 * В задании можно использовать только лямбды.
 * Из новых методов Stream API, которые мы не рассмотрели на лекции, здесь должны быть использованы методы limit и forEach
 */
public class Main {
    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            return new Random().nextInt(10);
        };
        System.out.println(supplier.get());

        Stream.generate(supplier)
                .map(x -> Math.pow(x, 3))
                .filter(k -> k > 100)
                .limit(100)
                .forEach(System.out::println);

    }
}
