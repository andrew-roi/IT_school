package com.it_school.lectureFive;



public class Main {

    public static void main(String[] args) {



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
