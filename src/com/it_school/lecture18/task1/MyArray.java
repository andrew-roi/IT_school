package com.it_school.lecture18.task1;

public class MyArray implements Runnable {
    String[] array;

    MyArray(String[] array) {
        this.array = array;
    }

    @Override
    public void run() {
        try {
            long start = System.currentTimeMillis();
            for (int index = 0; index < 5_000_000; index++) {
                if (index % 3 == 0 && index % 5 == 0) {
                    array[index] = "FizzBuzz";
                    System.out.println(array[index]);
                } else if (index % 5 == 0) {
                    array[index] = "Buzz";
                    System.out.println(array[index]);
                } else if (index % 3 == 0) {
                    array[index] = "Fizz";
                    System.out.println(array[index]);
                } else {
                    array[index] = String.valueOf(index);
                    System.out.println(array[index]);
                }


            }
            //code for calculating method working time
            long end = System.currentTimeMillis();
            long workTime = end - start;
            System.out.println("One thread fill  of " + array.length + " mln elements array in " + (workTime / 1000.) + " sec");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
