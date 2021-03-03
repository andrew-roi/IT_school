package com.it_school.lecture09;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/**
 * 1. Добавить в карту Map<String, Integer> 10 записей. Поменять местами ключи и значения (ключи становятся значениями, значения становятся ключами).

 * 2. Пользователь вводит с клавиатуры любые строки. Нужно посчитать сколько раз какая строка была введена. Вывести 2 строки, которые вводились чаще остальных.
 */
public class Main {
    public static void main(String[] args) throws IOException {
        changeKeyWithValuesInMap();
        Map<String, Integer> firstMap = new HashMap<>();
        Map<String, Integer> secondMap = new HashMap<>();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numb = 1;

        //read strings from terminal
        try {
            while (numb <= 5) {
                System.out.println("Введите строку: ");
                String key = reader.readLine();
                if (!firstMap.containsKey(key)) {
                    firstMap.put(key, 1);
                } else {
                    int count = firstMap.get(key);
                    count++;
                    firstMap.put(key, count);

                }
                numb++;
            }
            System.out.println(firstMap);
            countOfRepeats(firstMap, secondMap);

            //if something gonna wrong throwing an exception
        } catch (Exception ex) {
            System.err.println("Exception!");
            ex.printStackTrace();

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
        System.out.println(map);
        System.out.println(rev);
    }

    public static void countOfRepeats(Map<String, Integer> map1, Map<String, Integer> map2) {

        if (map2.size() == 2) {
            System.out.println(map2);
            return;
        }
        int maxValue = Collections.max(map1.values());
        String[] keys = map1.keySet().toArray(new String[0]);
        for (int i = 0; i < map1.size(); i++) {
            if (map1.get(keys[i]) == maxValue) {
                map2.put(keys[i], maxValue);
                map1.remove(keys[i]);
                countOfRepeats(map1, map2);
            }
        }

    }

}


