package com.it_school.lecture06;


import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        String regexpForDate = "((19|20)\\d\\d)/(0?[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01]0?)\\s([01]?[0-9]|2[0-3]):[0-5][0-9]";
        String inputDate = "2020/12/31 12:12";
        String inputDate1 = "2020/12/3112:12";
        String inputDate2 = "2020/12/31Z012:12";
        String inputDate3 = "2020a12/31Z012:12";

        Matcher matcher = Pattern.compile(regexpForDate).matcher(inputDate);
        Matcher matcher1 = Pattern.compile(regexpForDate).matcher(inputDate1);
        Matcher matcher2 = Pattern.compile(regexpForDate).matcher(inputDate2);
        Matcher matcher3 = Pattern.compile(regexpForDate).matcher(inputDate3);


        System.out.println(matcher.matches());
        System.out.println(matcher1.matches());
        System.out.println(matcher2.matches());
        System.out.println(matcher3.matches());

        System.out.println(Color.RED);
        System.out.println(Color.BLACK);
        System.out.println(Color.BLUE);
        System.out.println(Color.WHITE);
        System.out.println(Color.GREEN);


        System.out.println(checkEmailDomain("awdwd@gmail.com"));
        System.out.println(checkEmailDomain("123"));
        System.out.println(checkEmailDomain("@gmail.com"));

    }

    public static String checkEmailDomain(String email) {
        Matcher matcher = Pattern.compile("[^@ \\t\\r\\n]+@[^@ \\t\\r\\n]+\\.[^@ \\t\\r\\n]+").matcher(email);
        if (matcher.matches()) {
            char[] ch = email.toCharArray();
            StringBuilder  sb = new StringBuilder();
            for (int i = email.indexOf("@"); i < email.length(); i++) {
                 sb.append(ch[i]).append(ch[++i]);
            }
            sb.deleteCharAt(0);

            return sb.toString(); // проверить
        }else return "No matches";


    }
}


