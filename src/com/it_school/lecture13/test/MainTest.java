package com.it_school.lecture13.test;

import com.it_school.lecture13.java.Main;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MainTest {


    @Test
    public void testValidationReturnOfFormatting() {
        String actualResult = Main.formattingDate();
        String expectedResult = "07:10 1999/18/07";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testValidReturnOfParsing() {
        String actualResult = Main.parsingDateAndTime().toString();
        String expectedResult = "1999-06-18T19:34:55";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testValidReturnOfLessonDuration() {
        String actualResult = Main.lectureDuration();
        String expectedResult = "Lecture duration : 120 minute(s) or 7200 seconds";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testValidReturnOfDuration() {
        String actualResult = Main.timeBetweenLectures();
        String expectedResult = "Time between lectures is: 3 days or 74 hour(s) or 4440 minute(s) or 266400 seconds";
        Assertions.assertEquals(expectedResult, actualResult);
    }
}




