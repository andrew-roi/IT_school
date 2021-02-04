package com.it_school.lecture13.test;

import com.it_school.lecture13.java.Main;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class MainTest {


    private Main main;

    @BeforeEach
    public void init() {
        main = new Main();
    }

    @Test
    public void testValidReturnOfFormatting() {
        String actualResult = Main.formattingDate();
        String expectedResult = "19:32 2021/01/29";
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
        String expectedResult = "120 7200";
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testValidReturnOfDuration() {
        String actualResult = Main.timeBetweenLectures();
        String expectedResult = "74 4440 266400";
        Assertions.assertEquals(expectedResult, actualResult);
    }
}




