package com.it_school.lecture15;


import javax.print.attribute.standard.OrientationRequested;
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
