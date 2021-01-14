package com.it_school.lecture11;


public class Main {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2 = "java";

        //try for chars in strings
        try {
            comparingLastCharsInStrings(s1, s2);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
            System.out.println(ex.getMessage());
        }

        //dangerous area
        int[] array = {0, 1, 2, 0, 4};
        suspiciousMethod(array);

    }

    public static void comparingLastCharsInStrings(String s1, String s2) {
        char first = s1.charAt(s1.length() - 1);
        char second = s2.charAt(s2.length()-1);
        if (first == second) {
            throw new IllegalArgumentException(String.valueOf(first));
        }
    }

    public static void suspiciousMethod(int[] array) {
        for (int i = 0; i < 7; i++) {
            try {
                int k = array[i] / array[++i];
                System.out.println(k);
            } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
                System.out.println(e.getMessage());
                try {
                    int k = array[i] / array[++i];
                    System.out.println(k);
                } catch (ArrayIndexOutOfBoundsException exc) {
                    System.out.println(exc.getMessage());
                }
            }
        }
    }
}
