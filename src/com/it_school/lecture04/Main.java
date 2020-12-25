package com.it_school.lecture04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            System.out.println("Enter the char sequence that analog to jewelers");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String jewels = reader.readLine();
            System.out.println("Enter the char sequence that analog to stone");
            String stone = reader.readLine();
            String regex = "[a-zA-Z]+";
            Pattern pattern = Pattern.compile(regex);
            Matcher matcher = pattern.matcher(jewels);
            Matcher matcher1 = pattern.matcher(stone);
            if (matcher.matches() && matcher1.matches()) {
                System.out.println(numJewelsInStones(jewels, stone));

            } else {

                System.out.println("No others symbols should be entered");
            }

        } catch (IllegalArgumentException iae) {
            System.out.println("You should enter only literals. No others symbols");
        }
        int[] array1 = {-4, -1, 0, 3, 10};
        squareArraysValues(array1);
        sortArray(array1);
    }

    public static int numJewelsInStones(String jewels, String stones) {
        char[] jewelsTemp = jewels.toCharArray();
        int calcGems = 0;
        char[] stone = stones.toCharArray();
        for (char j : stone) {
            String temp = String.valueOf(j);
            for (char ch : jewelsTemp ) {
                if (temp.contains(Character.toString(ch))){
                    calcGems++;
                }
            }
        }
        return calcGems;
    }
        //some code
    public static void squareArraysValues(int[] array) {

        for (int i = 0; i < array.length; i++) {
            array[i] = (array[i] * array[i]);
        }

        System.out.println(Arrays.toString(array));
    }

    public static void sortArray(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int bigger = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = bigger;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }

}






