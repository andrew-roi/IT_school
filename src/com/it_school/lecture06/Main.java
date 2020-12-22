package com.it_school.lecture06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        try {
            System.out.println("Enter your email");
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            String regexpForEmail = "@.*";
            String regexpForDate = "((19|20)\\d\\d).(0?[1-9]|1[012])." +
                    "(0[1-9]|[12][0-9]|3[01]0?).([01]?[0-9]|2[0-3]):[0-5][0-9]";
            String inputEmail = reader.readLine();
            Matcher p = Pattern.compile(regexpForEmail).matcher(inputEmail);
            if (p.find()) {
                checkEmailDomain(inputEmail);
            } else {
                System.out.println("Invalid email");

            }

            System.out.println("Enter date");

            String inputDate = reader.readLine();

            Matcher p1 = Pattern.compile(regexpForDate).matcher(inputDate);
            if (p1.find()) {
                checkDate(inputDate);
            } else {
                System.out.println("Invalid date");
            }
            Color red = Color.RED;
            Color blue = Color.BLUE;
            Color black = Color.BLACK;
            Color green = Color.GREEN;
            Color white = Color.WHITE;

            black.setColor("#123fff");
            blue.setColor("#ffffff");
            green.setColor("#ffffff");
            white.setColor("#000000");
            red.setColor("000000");


        } catch (IllegalArgumentException illegalArgumentException) {
            illegalArgumentException.printStackTrace();
            System.out.println("invalid");

        }

    }

    public static void checkEmailDomain(String email) {
        Matcher matcher = Pattern.compile("@.*").matcher(email);
        if (matcher.find()) {
            String string;
            string = email.substring(matcher.start(), matcher.end());
            System.out.println(string);
        }

    }

    public static void checkDate(String date) {
        Matcher matcher = Pattern.compile("((19|20)\\d\\d).(0?[1-9]|1[012])." +
                "(0[1-9]|[12][0-9]|3[01]0?).([01]?[0-9]|2[0-3]):[0-5][0-9]").matcher(date);
        if (matcher.find()) {
            String string = date.substring(matcher.start(), matcher.end());
            System.out.println(string);
        }

    }

}
