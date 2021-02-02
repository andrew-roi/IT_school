package com.it_school.lecture07.test;

import com.it_school.lecture07.java.IntList;
import com.it_school.lecture07.java.ListAndStackImpl;
import org.junit.Test;

import java.util.Arrays;

public class ListAndStackImplTest {
    private final int[] values = new int[10]; // default array with capacity 10 for Stack and List implementation
    int nextIndex = 0; // increments while add or remove element

    @Test
    public void add() {
        values[nextIndex] = 1;
        nextIndex++;
        System.out.println(Arrays.toString(values));
    }

    @Test
    public void removeValue() {
        for (int i = 0; i < values.length; i++) {
            if (values[i] == 10) {

                int[] newArray = new int[values.length - 1];
                int[] newArray2 = new int[values.length - 1];
                int[] newArray3 = new int[values.length - 1];

                System.arraycopy(values, 0, newArray, 0, i);
                System.arraycopy(values, ++i, newArray2, i, i);
                System.arraycopy(newArray, 0, newArray3, 0, i);
                System.arraycopy(newArray2, i, newArray3, i, i);

                System.out.println(Arrays.toString(newArray3));
                break;
            }
        }
    }

    @Test
    public void getByIndex() throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        try {
            System.out.println(values[nextIndex]);
        } catch (ArrayIndexOutOfBoundsException boundsException) {
            System.out.print("No such index in array: ");

        } catch (IllegalArgumentException illegalException) {
            System.out.println("Not a number: ");

        }
    }

    @Test
    public void isEmpty(){
        System.out.println(values.length == 0);
    }

    @Test
    public void subList() {
        IntList intList = new ListAndStackImpl();
        for (int i = 0; i < 3; i++) {
            intList.add(values[i]);
        }
        System.out.println(intList.toString());
    }

    @Test
    public void pop()throws ArrayIndexOutOfBoundsException {
        try{

            nextIndex--;
            System.out.println(values[nextIndex]);
        }catch (ArrayIndexOutOfBoundsException ex){
            System.out.println(ex.getMessage());
        }
    }
    @Test
    public void peek() {
        System.out.println(values[nextIndex]);
    }

    @Test
    public void push() {
        values[nextIndex] = 3;
        nextIndex++;
        values[nextIndex] = 4;
        nextIndex++;
        System.out.println(Arrays.toString(values));
    }
}
