package com.it_school.lectureFour;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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
                System.out.println(numJewelsInStone(jewels, stone));

            } else {

                System.out.println("No others symbols should be entered");
            }

        } catch (IllegalArgumentException iae) {
            System.out.println("You should enter only literals. No others symbols");
        }
    }

    static int numJewelsInStone(String jewels, String stone) {

        Matcher pattern1 = Pattern.compile("a+").matcher(jewels);

        if (pattern1.find()) {
            String str = stone.substring(pattern1.start(), pattern1.end()+1);
            return str.length();
        } else return 0;


    }

}






