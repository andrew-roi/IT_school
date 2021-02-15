package com.it_school.lecture18.task1;


class MyArray implements Runnable {
    private int[][] array;
    private final int threadCount;
    private final int elemCount;

    MyArray(int countOfElements, int countOfThreads) {
        array = new int[countOfElements][countOfElements];
        threadCount = countOfThreads;
        this.elemCount = countOfElements;
    }

    @Override
    public void run() {
        Thread[] threads = new Thread[threadCount];
        long start = System.currentTimeMillis();
        for (int i = 0; i < threadCount; i++) {
            threads[i] = new Thread(new Iter(threadCount, i, elemCount, array));
            threads[i].start();
        }
        for (Thread thread : threads) {
            try {
                thread.join();
            } catch (InterruptedException e) {
                e.printStackTrace();
                System.exit(1);
            }
        }
        long end = System.currentTimeMillis();
        long workTime = end - start;
        for (int[] ints : array) {
            for (int anInt : ints) {
                if (anInt != (int) Math.pow(12, 4))
                    throw new RuntimeException();
            }
        }
        System.out.println(threadCount + " thread(s) fill  of " + array[0].length * array[0].length / 1_000_000 +
                " " +
                "mln elements array in " + (workTime / 1000.) + " sec");
    }
}

class Iter implements Runnable {
    private final int step;
    private final int startValue;
    private final int elemCount;
    volatile private int[][] arrToFill;

    public Iter(int step, int startValue, int elemCount, int[][] arrToFill) {
        this.step = step;
        this.startValue = startValue;
        this.elemCount = elemCount;
        this.arrToFill = arrToFill;
    }

    public void run() {
        try {
            for (int i = startValue; i < elemCount; i += step) {
                for (int j = 0; j < elemCount; j++) {
                    arrToFill[i][j] = (int) Math.pow(12, 4);
                }
            }
        } catch (Exception exception) {
            System.out.println(exception.getMessage());
        }
    }
}