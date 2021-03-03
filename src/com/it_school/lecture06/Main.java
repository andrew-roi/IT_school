package com.it_school.lecture06;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 1. Написать регулярное выражение для формата даты YYYY/MM/dd HH:mm
 *
 * Примеры
 *
 * 2020/12/23 05:30 - valid
 *
 * 2020/13/77 99:99 - invalid
 *
 * asdasdasd - invalid
 *
 *
 *
 * 2. Написать регулярное выражение, которое будет искать домен почтового ящика и возвращать его
 *
 * Примеры
 *
 * abc@mail.com -> main.com
 *
 * zzz@ccc.v -> ccc.y
 * 4. Написать enum Сolor, в нем должны быть объекты RED, GREEN, BLUE, WHITE и BLACK.
 *
 * У каждого объекта должны быть поле hex
 */

public class Main {
    public static void main(String[] args) {
        String regexpForDate = "((19|20)\\d\\d)/(0?[1-9]|1[012])/(0[1-9]|[12][0-9]|3[01]?)\\s([01]?[0-9]|2[0-3]):[0-5][0-9]";
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


