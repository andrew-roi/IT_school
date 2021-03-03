package com.it_school.lecture18.task1;

/**
 * С помощью многопоточности заполнить массива строк из 100 млн элементов.
 * Если индекс делится на 3 без остатка - записать в ячейку "Fizz", если делится на 5 без остатка - "Buzz",
 * если делится и на 3 и на 5 - "FizzBuzz". Во всех остальных случаях записать в ячейку строковое представление ее индекса.
 * Сравнить время выполнения программы с одним потоком и с несколькими. Количество потоков на ваше усмотрение.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {

        Thread thread1 = new Thread(new MyArray(20000, 1));
        thread1.start();
        thread1.join();
        Thread thread2 = new Thread(new MyArray(20000, 2));
        thread2.start();
        thread2.join();
        Thread thread3 = new Thread(new MyArray(20000, 5));
        thread3.start();
        thread3.join();
        Thread thread4 = new Thread(new MyArray(20000, 10));
        thread4.start();
        thread4.join();


    }

}
