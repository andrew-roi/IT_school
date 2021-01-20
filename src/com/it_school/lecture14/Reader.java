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
            Thread.sleep(1_000);
            if (!list.isEmpty()) {
                System.out.println(list);
                list.clear();
            }else {
                LocalDate date = LocalDate.now();
                System.out.println("For " + date + " the list is empty");
            }



        } catch (InterruptedException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
