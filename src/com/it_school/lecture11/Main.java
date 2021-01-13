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
        String first = s1.substring(s1.length() - 1);
        String second = s2.substring(s1.length() - 1);
        if (first.equals(second)) {
            throw new IllegalArgumentException(first);
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
