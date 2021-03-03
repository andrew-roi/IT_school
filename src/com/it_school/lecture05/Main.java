package com.it_school.lecture05;

/**
 * 1. Resolve merge conflicts
 *
 * В ветке "master" находится класс Calculator с методами int plus(int a, int b).
 *
 * Создать ветку "sum", в которой метод plus будет принимать int[] и возвращать сумму.
 *
 * Создать ветку "multiply", в которой метод plus будет удален и заменен на метод double multiply(double a, double b).
 *
 * Смержить "sum" в "master".
 *
 * Смержить "multiply" в "master".
 *
 * В итоге в ветке "master" должны быть изменения из обеих веток.
 *
 *
 * 2. String
 *
 * Написать метод, который принимает строку и возвращает средний символ как строку. Если в строке четное кол-во символов, то возвращать символы слева и справа от центра.
 *
 * Input: abcde. Output: c
 *
 * Input: abcd. Output: bc
 *
 *
 * Написать метод, который принимает строку и инвертирует регистр каждого символа в ней.
 *
 * Input: AbCde. Output: aBcDE
 *
 *
 * Написать метод, который принимает строку и меняет ее половины местами. Если в строке нечетное кол-во символов, то средний символ остается на месте:
 *
 * Input: abcd. Output: cdab
 *
 * Input: abcde. Output: decab
 *
 *
 * 3. equals()
 *
 * Написать 2 класса - Bottle (бутылка) и Liquid (жидкость).
 *
 * Поля Bottle: объем, жидкость
 *
 * Поля Liquid: плотность, цвет, газированная/не газированная
 *
 * В обоих класса переопределить метод equals(). Создать 3 объекта Bottle, заполнить их жидкостью и сравнить.
 *
 * Автогенерацию метода equals() использовать нельзя (конечно, я не отличу автогенерацию от рукописного кода, но все же постарайтесь написать метод самостоятельно).
 */

public class Main {

    public static void main(String[] args) {
        //create objects of class bottle and liquid
        Liquid l1 = new Liquid("green", 4.4, true);
        Liquid l2 = new Liquid("yellow", 1.0, false);


        Bottle b1 = new Bottle(1,l1);
        Bottle b2 = new Bottle(1.5,l2);
        Bottle b3 = new Bottle(1,l1);
        //set liquid in bottle
        b1.setLiquid(l1);
        b2.setLiquid(l2);
        b3.setLiquid(l1);



        //comparing objects
        System.out.println(b1.equals(b2));
        System.out.println(b3.equals(b1));
        System.out.println(b2.equals(b3));

        System.out.println("==============================");

        System.out.println(middleFromTheString("HelloWorld"));
        System.out.println(invertRegister("I like Java"));
        System.out.println(swapHalfString("kozak"));
    }

    public static String middleFromTheString(String str) {
        String middleSymbol;
        int length = str.length();
        if (length == 1) {
            middleSymbol = str;
        } else if (length % 2 != 0) {
            middleSymbol = Character.toString(str.charAt(length / 2));
        } else {
            middleSymbol = str.substring((length / 2 - 1), (length / 2 + 1));
        }
        return middleSymbol;
    }
    public static String invertRegister(String str) {
        StringBuilder invertedString = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            String ch = String.valueOf(str.charAt(i));
            if (ch.matches("[A-Z]")) {
                invertedString.append(ch.toLowerCase());
            }
            if (ch.matches("[a-z]")) {
                invertedString.append(ch.toUpperCase());
            }
        }
        return invertedString.toString();
    }
    public static String swapHalfString(String str) {
        StringBuilder swapString = new StringBuilder();
        int length = str.length();
        if (length == 1) {
            swapString.append(str);
            System.out.println("must be more that one char");
        } else if (length % 2 != 0) {
            String firstOdd = str.substring(0, (length / 2));
            String secondOdd = str.substring((length / 2 + 1), length);
            String middleOdd = Character.toString(str.charAt(length / 2));
            swapString.append(secondOdd).append(middleOdd).append(firstOdd);
        } else {
            String firstEven = str.substring(0, length / 2);
            String secondEven = str.substring(length / 2, length);
            swapString.append(secondEven).append(firstEven);
        }
        return swapString.toString();
    }
}
