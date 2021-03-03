package com.it_school.lecture11;

/**
 * Написать метод, который принимает 2 строки. Если обе строки заканчиваются на одинаковый символ -
 * бросать исключение IllegalArgumentException, в конструктор исключения передавать символ на который заканчиваются строки. Вызвать этот метод, поймать исключение и вывести в консоль его сообщение (метод getMessage).
 * Написать блок try, внутри которого из массива чисел берется 2 числа и первое делится на второе.
 * Нужно обработать ситуации, когда второе число является 0 (ArithmeticalException) и когда индексы выходят за
 * рамки массива (ArrayIndexOutOfBoundsException). Если была попытка деления на 0, то внутри catch нужно взять
 * два других числа из массива и попробовать разделить еще раз, также ожидая исключение.
 */
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
