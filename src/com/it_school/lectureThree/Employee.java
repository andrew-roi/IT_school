package com.it_school.lectureThree;

public class Employee {
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

}
