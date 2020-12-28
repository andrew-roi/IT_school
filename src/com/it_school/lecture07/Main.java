package com.it_school.lecture07;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        printArrayByRecursion(array, 0);
        ListAndStackImpl waiter = new ListAndStackImpl();
        waiter.add(1);
        waiter.add(7);
        waiter.insert(2, 10);
        waiter.set(3, 5);
        waiter.add(17);

        /*
        check the methods of list implementation
         */

        System.out.println(waiter.getByIndex(21)); // wrong index caught an exception
        System.out.println(waiter.capacity());//capacity of array
        System.out.println(waiter.size());//actual elements count in array
        System.out.println(Arrays.toString(waiter.toArray()));// check the insert into array
        System.out.println(waiter.contains(7));
        waiter.removeByIndex(2);
        System.out.println(Arrays.toString(waiter.toArray()));
        System.out.println(Arrays.toString(waiter.subList(0, 3).toArray()));
        System.out.println(waiter.getIndexByValue(0));
        System.out.println(waiter.getByIndex(3));

        System.out.println("=====================");

        /*
        check the methods of stack implementation
         */

        waiter.push(3);
        waiter.push(5);
        System.out.println(waiter.peek());
        System.out.println(waiter.pop());

    }

    public static void printArrayByRecursion(int[] array, int index) {


        if (array.length == index) {
            return;
        }
        System.out.println(array[index++]);
        printArrayByRecursion(array, index);
    }

}

