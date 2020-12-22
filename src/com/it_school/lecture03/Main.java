package com.it_school.lecture03;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Nikolay", "Shafranov");
        Employee employee2 = new Employee("Anatoliy", "Kotsarev", 3000.0);
        Employee employee3 = new Employee("Alex", "Buchmann");

        Employee manager1 = new Manager("Andrew", "Yovo");
        int[] employeesID = new int[2];
        employeesID[0] = employee1.getEmployeeId();
        employeesID[1] = employee2.getEmployeeId();

        Employee manager2 = new Manager("Vasiliy", "Volvo", 1000.0);
        int[] employees1ID = new int[1];
        employees1ID[0] = employee3.getEmployeeId();

        System.out.println(Arrays.toString(employeesID));
        System.out.println(Arrays.toString(employees1ID));


    }
}
