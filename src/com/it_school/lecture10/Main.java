package com.it_school.lecture10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("Vasiok", "Batman", 1150.);
        Employee e2 = new Employee("Vasiok", "Batman", 200.);
        Employee e6 = new Employee("Rita", "Faltojano", 1000.);
        Employee e3 = new Employee("John", "Sina", 400.);
        Employee e4 = new Employee("Vasiok", "Sina", 200.);
        Employee e5 = new Employee("Vasiok", "Sina", 300.);


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
        employees.add(e6);

        Comparator<Employee> comparator = new EmployeeComparatorWithSalaryAndName();


        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee.getName() + " " + employee.getEmployeeId() + " " + employee.getSalary());
        }

        System.out.println("==============");
        employees.sort(comparator);

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