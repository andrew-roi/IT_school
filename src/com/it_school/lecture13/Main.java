package com.it_school.lecture13;

/**
 * Use Java v.15
 */

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Locale;


public class Main {
    public static void main(String[] arg) {
        lectureDuration();
        timeBetweenLectures();
        parsingDateAndTime();
        formattingDate();

    }

    public static void lectureDuration() {
        Duration duration = Duration.between(LocalDateTime.of(2021, Month.JANUARY, 18, 20, 0),
                LocalDateTime.of(2021, Month.JANUARY, 18, 22, 0));
        System.out.println("Lecture duration : " + duration.toMinutes() + " minute(s)" + " or " + duration.toSeconds() + " seconds");

    }

    public static void timeBetweenLectures() {
        LocalDateTime monday = LocalDateTime.of(2021, Month.JANUARY, 18, 20, 0);
        LocalDateTime thursday = LocalDateTime.of(2021, Month.JANUARY, 21, 22, 0);
        Duration duration = Duration.between(monday, thursday);
        System.out.println("Time between lectures is: " + duration.toDays() + " days " + " or " + duration.toHours() + " hour(s) " + " or  " +
                duration.toMinutes() + " minute(s) " + " or " + duration.toSeconds() + " seconds ");
    }

    public static void parsingDateAndTime() throws DateTimeParseException, IllegalArgumentException {
        var date = "1999/Jun/18 07:34:55 PM";

        try {
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/LLL/dd hh:mm:ss a", Locale.US);
            System.out.println(LocalDateTime.parse(date, formatter));

        } catch (DateTimeParseException | IllegalArgumentException ex) {
            System.out.println(ex.getMessage() + "!" + "\nМиша, всё хуйня, переделывай.");
        }
    }

    public static void formattingDate() {
        System.out.println(LocalDateTime.of(1999, Month.JULY, 18, 7, 10, 55).
                format(DateTimeFormatter.ofPattern("hh:mm yyyy/dd/MM ")));


    }
}
