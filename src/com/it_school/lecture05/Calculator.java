package com.it_school.lecture05;

public class Calculator {
    public int plus(int a, int b) {
        return a + b;
    }

    public int plus(int[] array) {
        int sum = 0;
        for (int i : array
        ) {
            sum += array[i];
        }
        return sum;
    }

    public double multiply(double a, double b) {
        return a * b;
    }
}
