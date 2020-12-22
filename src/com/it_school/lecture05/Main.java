package com.it_school.lecture05;



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
