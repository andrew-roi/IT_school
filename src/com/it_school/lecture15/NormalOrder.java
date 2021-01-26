package com.it_school.lecture15;

import java.util.Date;

public class NormalOrder extends Order {
    String number;
    Date date = new Date();

    void dispatch() {

    }

    boolean receive() {
        return false;
    }

    @Override
    void close() {
        super.close();
    }

    @Override
    boolean confirm() {

        return super.confirm();
    }
}