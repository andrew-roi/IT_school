package com.it_school.lecture12;

import java.util.ArrayList;
import java.util.List;


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

        for (int j = 0; j < rows.size(); j++) {

            Row o = report.rows.get(j);
            System.out.print(o.cells[0] + " " + o.cells[1] + " " + o.cells[2]);
            System.out.println();

        }
    }
}
