package com.it_school.lecture10;

//comparing two Employees using  value of salary and names
public class Comparator {
    public int compare(Employee o1, Employee o2) {
        int k;
        int i;
        k = Double.compare(o1.getSalary(), o2.getSalary());

        if (o1.getName().equals(o2.getName())) {
            i = 0;

        } else {
            i = -1;
        }
        return Integer.compare(k, i);

    }
}
