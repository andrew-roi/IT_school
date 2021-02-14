package com.it_school.lecture18.task1;

public class Main {
    public static void main(String[] args) {
        String[] strings1 = new String[10_000_000];


        Thread thread1 = new Thread(new MyArray(strings1, 0));
        Thread thread2 = new Thread(new MyArray(strings1, 5_000_000));
        Thread thread3 = new Thread(new MyArray(strings1, 5_000_000,10_000_000));

        thread1.start();
        thread2.start();
        thread3.start();

    }

}
