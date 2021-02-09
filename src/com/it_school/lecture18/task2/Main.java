package com.it_school.lecture18.task2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Timer;

public class Main {

    public static void main(String[] args) {

        Queue<Client> queue = new LinkedList<>();
        Store shop = new Store(true, queue);
        Timer timer = new Timer();
        timer.schedule(shop, 1_000, 30_000);
        Store.AddClient addCustomer = new Store.AddClient();
        Store.DeleteClient deleteCustomer = new Store.DeleteClient();
        timer.schedule(addCustomer, 1000, 1000 + (new Random().nextInt(4) * 1000));
        timer.schedule(deleteCustomer, 1000, 1000 + (new Random().nextInt(4) * 1000));

    }
}
