package com.it_school.lecture14;

import java.time.LocalDate;
import java.util.List;

public class Reader implements Runnable {
    List<Number> list;


    Reader(List<Number> list) {
        this.list = list;

    }


    @Override
    public void run() {
        try {
            for (int i = 0; i < Integer.MAX_VALUE; i++) {
                Thread.sleep(1_000);
                System.out.println(list);
                list.clear();


                if (list.isEmpty()) {
                    LocalDate date = LocalDate.now();
                    System.out.println("For " + date + " the list is empty");
                }
            }


        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
