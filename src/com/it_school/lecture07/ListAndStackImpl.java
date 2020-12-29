package com.it_school.lecture07;


public class ListAndStackImpl implements IntList, IntStack {
    private int topIndex = -1; // helps to understand how many elements in the Stack
    private final int[] values = new int[10]; // default array with capacity 20 for Stack implementation


    private final int[] array = new int[10]; // default array with capacity 20 for List implementation
    int nextIndex = 0; // increments while add or remove element

    @Override
    public void add(int i) {
        array[nextIndex] = i;
        nextIndex++;
    }

    @Override
    public void insert(int index, int value) {
        nextIndex = index;
        array[nextIndex] = value;
    }

    @Override
    public void set(int index, int value) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        try {
            nextIndex = index;
            array[nextIndex] = value;
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.println("Not such index in the array");
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Something is wrong");
        }
    }

    @Override
    public int size() {
        return nextIndex;
    }

    @Override
    public int capacity() {
        return array.length;
    }

    @Override
    public int getByIndex(int index) throws ArrayIndexOutOfBoundsException, IllegalArgumentException {
        try {
            return array[index];
        } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
            System.out.print("No such index in array: ");
            return -1;
        } catch (IllegalArgumentException illegalArgumentException) {
            System.out.println("Not a number: ");
            return -1;
        }
    }

    @Override
    public Integer getIndexByValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (value == array[i]) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public boolean contains(int value) {
        for (int j : array) {
            if (j == value) {
                return true;
            }

        }
        return false;
    }

    @Override
    public void removeValue(int value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                array[i] = 0;
            }
        }
    }

    @Override
    public void removeByIndex(int index) {
        for (int i = 0; i < array.length; i++) {
            if (i == index) {
                array[i] = 0;

            }

        }
    }

    @Override
    public IntList subList(int fromIndex, int toIndex) {
        IntList intList = new ListAndStackImpl();
        for (int i = fromIndex; i < toIndex; i++) {
            intList.add(array[i]);
        }
        return intList;
    }

    @Override
    public int[] toArray() {
        int[] arr;
        arr = array;
        return arr;
    }


    @Override
    public void push(int value) {
        topIndex++;
        values[topIndex] = value;
    }

    @Override
    public int pop() {
        topIndex--;
        return values[topIndex];
    }

    @Override
    public int peek() {
        return values[topIndex];
    }
}