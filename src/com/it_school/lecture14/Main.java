package com.it_school.lecture14;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Number> list = new ArrayList<>();

        Writer writer = new Writer(list);
        Reader reader = new Reader(list);


        Thread readerThread = new Thread(reader);
        Thread writerThread = new Thread(writer);

        writerThread.start();
        readerThread.start();
    }

}
