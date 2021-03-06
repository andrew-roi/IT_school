package com.it_school.lecture12;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Нужно исправить 2 бага - 1 compile-time баг и 1 run-time баг. Также проведите рефакторинг.
 * Рефакторинг - изменения кода, которые делают его читабельнее и
 * проще для дальнейшей поддержки/развития, не изменяя изначальных функций кода.
 */

public class Main {
    public static void main(String[] args) {
        Report report = new Report();
        List<Row> rows = new ArrayList<>();

        Row row1 = new Row();
        row1.cells[0] = "a";
        row1.cells[1] = "b";
        row1.cells[2] = "c";
        rows.add(row1);
        Row row2 = new Row();
        row2.cells[0] = "d";
        row2.cells[1] = "e";
        row2.cells[2] = "f";
        rows.add(row2);

        report.rows = rows;

        IntStream.range(0, rows.size()).mapToObj(j -> report.rows.get(j)).forEach(o -> {
            System.out.print(o.cells[0] + " " + o.cells[1] + " " + o.cells[2]);
            System.out.println();
        });
    }
}
