package com.it_school.lecture09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;


public class Main {
    public static void main(String[] args) {
         changeKeyWithValuesInMap();
        try {
            System.out.println("Enter something ");
            System.out.println(printMap());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void changeKeyWithValuesInMap() {
        Map<String, Integer> map = new HashMap<>();
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);
        map.put("d", 4);
        map.put("e", 5);
        map.put("f", 6);
        map.put("g", 7);
        map.put("h", 8);
        map.put("i", 9);
        map.put("j", 10);

        HashMap<Integer, String> rev = new HashMap<>();
        for (Map.Entry<String, Integer> entry : map.entrySet())
            rev.put(entry.getValue(), entry.getKey());

        System.out.println(rev);
    }

    public static String printMap() throws IOException {
        Map<String, Integer> map1 = new HashMap<>(5);
        int i = 1;
        String s = "";
        int index = 0;

        try {
            while (index <= map1.size()) {
                s = readStringFromTerminal();
                map1.put(s, i);
                ++index;
            }
            if (map1.containsKey(s)) {
                ++i;
            } else return " No matches";

        } catch (IllegalArgumentException iae) {
            System.err.println("123");
        } catch (NullPointerException nullPointerException) {
            System.err.println("321");
        }

        return s + " " + i;
    }

    public static String readStringFromTerminal() throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        return reader.readLine();
    }
}

