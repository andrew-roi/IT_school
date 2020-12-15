package com.it_school.lectureThree;

public class Manager extends Employee {
    private int[] subordinateId;

    public Manager(String name, String surName) {
        super(name, surName);
    }

    public Manager(String name, String surName, Double salary) {
        super(name, surName, salary);
    }

    public int[] getSubordinateId() {
        return subordinateId;
    }

    public void setSubordinateId(int[] subordinateId) {
        this.subordinateId = subordinateId;
    }
}
