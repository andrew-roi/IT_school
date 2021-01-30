package com.it_school.lecture15;


import java.util.Date;

public abstract class Order {
    String number;
    Date date = new Date();



    void close() {


    }

    boolean confirm() {

        return false;
    }
}
