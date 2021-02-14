package com.it_school.lecture18.task1;

public class MyArray implements Runnable {
    private static  volatile String[] classArray;
    private final int minIndex;
    private  int maxIndex;

    MyArray(String[] array, int minIndex) {
        classArray = array;
        this.minIndex = minIndex;
        this.maxIndex = array.length;
    }

    MyArray(String[] array, int minIndex, int maxIndex){
        classArray = array;
        this.minIndex = minIndex;
        if (maxIndex < classArray.length){
            this.maxIndex = maxIndex;
        }
    }

    @Override
    public void run() {
        long start = System.currentTimeMillis();
        try {
            for (int index = minIndex; index < classArray.length; index++) {
                if (index % 3 == 0 && index % 5 == 0) {
                    classArray[index] = "FizzBuzz";

                } else if (index % 5 == 0) {
                    classArray[index] = "Buzz";

                } else if (index % 3 == 0) {
                    classArray[index] = "Fizz";

                } else {
                    classArray[index] = String.valueOf(index);

                }

            }

            //code for calculating method working time

            long end = System.currentTimeMillis();
            long workTime = end - start;
            System.out.println("Thread(s) fill  of " + classArray.length + " mln elements array in " + (workTime / 1000.) + " sec");
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}
