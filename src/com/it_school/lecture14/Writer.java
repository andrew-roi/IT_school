package com.it_school.lecture14;

import java.util.List;
import java.util.Random;

public class Writer implements Runnable {
    List<Number> list;

    public Writer(List<Number> list) {
        this.list = list;

    }

    @Override
    public void run() {
        try {

            list.add(new Random().nextInt(100));
            Thread.sleep(2_500);


        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
