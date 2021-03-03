package com.it_school.lecture07;

import java.util.Arrays;

/**
 * 1. Напечатать в консоль элементы массива с помощью рекурсии.
 * 2. Написать класс, который реализует все интерфейсы ниже:
 * interface IntStack {
 * void push(int value);
 *
 * int pop(); // remove and get value on top of Stack
 *
 * int peek(); // get value on top of Stack
 * public interface IntList {
 *
 * void add(int i);
 * <
 *
 * Insert element by index. All elements from the right will be shifted to right
 *
 * void insert(int index,int value);
 *
 * Overwrite value by index
 *
 * void set(int index,int value);
 *
 * @return actual number of elements in the list
 *
 * int size();
 *
 *
 * *@return how many elements list can contain
 *
 * int capacity();
 *
 * int getByIndex(int index);
 *
 * @return index of first value occurrence.Return null if no value in the list.
 * <p>
 * Integer getIndexByValue(int value);
 *
 * boolean contains(int value);
 *
 * void removeValue(int value);
 *
 * void removeByIndex(int index);
 *
 * IntList subList(int fromIndex,int toIndex);
 *
 * int[]toArray();
 *
 * }
 */

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7};
        printArrayByRecursion(array, 0);
        ListAndStackImpl listAndStack = new ListAndStackImpl();
        listAndStack.add(1);
        listAndStack.add(7);
        listAndStack.insert(2, 10);
        listAndStack.set(3, 5);
        listAndStack.add(17);

        /*
        check the methods of list implementation
         */
        System.out.println(listAndStack.size());
        System.out.println(listAndStack.getByIndex(21)); // wrong index caught an exception
        System.out.println(listAndStack.capacity());//capacity of array
        System.out.println(listAndStack.size());//actual elements count in array
        System.out.println(Arrays.toString(listAndStack.toArray()));// check the insert into array
        System.out.println(listAndStack.contains(7));
        listAndStack.removeByIndex(1);
        listAndStack.removeValue(10);
        System.out.println(Arrays.toString(listAndStack.toArray()));
        System.out.println(Arrays.toString(listAndStack.subList(0, 3).toArray()));
        System.out.println(listAndStack.getIndexByValue(0));
        System.out.println(listAndStack.getByIndex(3));
        System.out.println(listAndStack.isEmpty());

        System.out.println("=====================");

        /*
        check the methods of stack implementation
         */

        listAndStack.push(3);
        listAndStack.push(5);
        System.out.println(listAndStack.peek());
        System.out.println(listAndStack.pop());

    }

    public static void printArrayByRecursion(int[] array, int index) {


        if (array.length == index) {
            return;
        }
        System.out.println(array[index++]);
        printArrayByRecursion(array, index);
    }

}

