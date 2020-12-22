package com.it_school.lecture06;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public enum Color {

    RED, GREEN, BLUE, WHITE, BLACK;
    String hex;

    void setColor(String hex) {
        String regex = "^#[0-9a-f]{1,6}";
        Matcher matcher = Pattern.compile(regex).matcher(hex);
        if (matcher.find()){
            this.hex = hex;
            System.out.println(hex);
        }else{
            System.out.println("not hex");
        }
    }
}
