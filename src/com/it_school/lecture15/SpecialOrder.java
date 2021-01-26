package com.it_school.lecture15;

import java.util.Date;

public class SpecialOrder extends Order {
    String number;
    Date date = new Date();


    @Override
    boolean confirm() {
        return super.confirm();
    }

    @Override
    void close(){
        super.close();
    }

}
