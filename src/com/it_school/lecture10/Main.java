package com.it_school.lecture10;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Взять Employee из ДЗ 3.

 * 0. Написать generic-метод, который принимает список любых чисел (целых, дробных) и возвращает их сумму.
 *
 * Отличная инфа про generics из первоисточника:
 *
 * Input: List<Integer> [4 7 2]
 *
 * Output: 13
 * Input: List<Double> [1.5, 6.0, 3.0]
 *
 * Output: 10.5

 * 1. Класс Employee должен реализовывать интерфейс Comparable и сортировать сотрудников по id
 * 2. Написать компаратор, который сравнивает сотрудников по зарплате
 * 3. Написать компаратор, который сравнивает сотрудников по зарплате, если она одинаковая - то по имени.
 * Создать список сотрудников (3-4 шт.) и продемонстрировать что сортировка работает правильно, т.е. вызвать Collections.sort(collection) и Collections.sort(collection, comparator)
 */
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