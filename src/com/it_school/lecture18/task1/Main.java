package com.it_school.lecture18.task1;

public class Main {
    public static void main(String[] args) {
        String[] array = new String[10_000_000];
        String[] array2 = new String[10_000_000];
        Thread thread = new Thread(new MyArray(array));


        Thread thread5mlnElm = new Thread(new MyArray2(array2));
        Thread thread5mlnElm2 = new Thread(new MyArray3(array2));
        thread.start();
        thread5mlnElm.start();
        thread5mlnElm2.start();

    }

}
