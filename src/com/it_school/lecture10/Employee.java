package com.it_school.lecture10;


import java.util.Comparator;

public class Employee implements Comparable<Employee>, Comparator<Employee> {
    private static int classCounterID;
    private int id;
    private double salary;
    private String surname;
    private String name;

    Employee(String inputName, String inputSurname) {
        this.name = inputName;
        this.surname = inputSurname;
        this.id = classCounterID++;

    }

    Employee(String inputName, String inputSurname, Double inputSalary) {
        this(inputName, inputSurname);
        this.salary = inputSalary;

    }

    int getEmployeeId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surname;
    }

    public void setSurName(String surName) {
        this.surname = surName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }


    @Override
    public int compareTo(Employee o) {
        if (this.id > o.id) {
            return 1;
        } else if (this.id == o.id) {
            return 0;
        } else return -1;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        if (o1.getSalary() >= o2.getSalary()) {
            if (o1.getName().equals(o2.getName())) {
                return o1.getName().compareTo(o2.getName());
            }
        }
        return -1;
    }


}
