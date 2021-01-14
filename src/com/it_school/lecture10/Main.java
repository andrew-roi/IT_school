package com.it_school.lecture10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Vasiok", "Batman", 200.);
        Employee e2 = new Employee("Vasiok", "Batman", 200.);
        Employee e3 = new Employee("John", "Sina", 200.);
        Employee e4 = new Employee("Vasiok", "Sina", 200.);
        Employee e5 = new Employee("Vasiok", "Sina", 300.);
        Employee e6 = new Employee("Rita", "Faltojano", 1000.);
        System.out.println(e1.getEmployeeId());
        System.out.println(e2.getEmployeeId());
        System.out.println(e1.compareTo(e2));

        System.out.println("==============");
        List<Employee> employees = new ArrayList<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        employees.add(e4);
        employees.add(e5);
        System.out.println(e1.compare(e1, e2));//true,equals
        System.out.println(e2.compare(e2, e4));//true, equals
        System.out.println(e6.compare(e6, e5));//false, e6 salary more, different names
        System.out.println(e2.compare(e2, e3));//false, different names, salary are equals
        System.out.println(e3.compare(e3, e4));//false, different names, salary are equals
        System.out.println(e2.compare(e2, e5));//false, e5 salary more, different names

        System.out.println("==============");
        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " + employee.getEmployeeId() + " " + employee.getSalary());
        }
        employees.sort(Employee::compareTo);
        System.out.println("==============");

        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " + employee.getEmployeeId() + " " + employee.getSalary());
        }


        System.out.println("===================");

        List<Number> list = new ArrayList<>(); // list for the numbers sum
        list.add(1);
        list.add(4.5);
        list.add(7);
        System.out.println(sumOfDigits(list));


    }

    public static <T extends Number> double sumOfDigits(List<T> list) {
        double sum = 0;
        for (T t : list) {
            sum += t.doubleValue();
        }

        return sum;
    }


}