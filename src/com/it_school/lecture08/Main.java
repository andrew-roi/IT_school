package com.it_school.lecture08;

import java.util.*;
/**
 1. Написать метод, который принимает на вход очередь строк и возвращает ее перевернутую версию.
 Входную очередь изменять нельзя.
 2. Написать метод, который принимает на вход очередь строк, удаляет из нее все строки, длина которых > 4 и возвращает ее.
 Входную очередь изменять нельзя.
 3. Написать метод, который принимает на вход список строк с дубликатами и возращает список из уникальных значений.
 Напишите 2 его версии - с использованием Set и без.
 Входящий список изменять нельзя.
 */
public class Main {
    public static void main(String[] args) {

        //code for 1 and 2 tasks
    Queue<String> queue = new LinkedList<>();
    String[] strings = {"One", "Two","Three","Four", "Five","BigInteger"};
        for (String s: strings) {
            queue.offer(s);
        }

        System.out.println(queue);
        System.out.println(ReverseQueue(queue));
        System.out.println("===================");
        System.out.println(sizeValidation(queue));
        System.out.println("===================");


        //code for 3 task
        List<String> list = new ArrayList<>();
        list.add("Java Developer");
        list.add("PipeLines");
        list.add("Apple Watch");
        list.add("Java Developer"); // already exist in list
        System.out.println(validationWithList(list));
        System.out.println(validationWithSet(list));
    }

    public static Queue<String> ReverseQueue(Queue<String> queue){
        Deque<String> queue1 = new LinkedList<>();
        for (String element : queue){
            queue1.addFirst(element);
        }
        return queue1;
    }

    public static Queue<String> sizeValidation(Queue<String> queue) {
        Queue<String> queue1 = new LinkedList<>();
        for (String element : queue) {
            if (element.length() <= 4) {
                queue1.offer(element);
            }
        }
        return queue1;
    }
    public static List<String> validationWithSet(List<String> stringList) {
        Set<String> set = new HashSet<>(stringList);
        return new ArrayList<>(set);
    }

    public static List<String> validationWithList(List<String> stringList) {
        List<String> newList = new ArrayList<>();
        for (String str : stringList) {
            if (!newList.contains(str)) {
                newList.add(str);
            }
        }
        return newList;
    }
}
