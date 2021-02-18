package com.it_school.lecture21;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Supplier<Integer> supplier = () -> {
            try {
                Thread.sleep(500);
            } catch (InterruptedException exception) {
                exception.printStackTrace();
            }
            return new Random().nextInt(10);
        };
        System.out.println(supplier.get());

        Stream.generate(supplier)
                .map(x -> x = (int) Math.pow(x, 3))
                .filter(k -> k > 100)
                .limit(100)
                .forEach(System.out::println);

    }
}
