package com.it_school.lecture15;

public class Customer {
    String location;
    String name;
    private Order orders;

    void setOrder() {

    }

    void receiveOrder() {

    }

    Customer() {


    }

    Customer(String location, String name, Order orders) {
        this.location = location;
        this.name = name;
        this.orders = orders;
    }
}
