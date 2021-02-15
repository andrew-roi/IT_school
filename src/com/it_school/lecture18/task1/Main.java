package com.it_school.lecture18.task1;


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
