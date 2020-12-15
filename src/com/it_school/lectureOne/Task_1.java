package com.it_school.lectureOne;

/**
 * Напечатать числа от 30 до 0 с использованием for И while И do-while (3 цикла). Если число кратно 3, то не выводить его
 */

public class Task_1 {

    public static void main(String[] args) {
        forCycle();
        doWhileCycle();
        whileCycle();
    }

    public static void forCycle() {
        for (int num = 30; num >= 0; num--) {

            if (num % 3 == 0) {
                System.out.print("");
            } else {
                System.out.println(num);
            }
            if (num == 0) {
                System.out.println(0);
            }
        }
    }


    public static void doWhileCycle() {
        int num = 30;
        do {
            if (num % 3 == 0) {
                System.out.print("");

            } else {
                System.out.println(num);
            }
            num--;
            if (num == 0) {
                System.out.println(num);
            }

        }
        while (num >= 0);
    }

    public static void whileCycle() {
        int i = 30;
        while (i > -1) {
            if (i % 3 == 0) {
                --i;
                continue;
            }
            System.out.println(i);
            i--;
            if (i == 0) {
                System.out.println(0);
            }


        }
    }
}