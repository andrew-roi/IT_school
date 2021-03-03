package com.it_school.lecture18.task2;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.Timer;

/**
 * В городе успешно работает ювелирный магазин, так как к магазину постоянно приходят клиенты.
 * Из-за карантина в магазине не может одновременно находится больше 5 клиентов.
 * Клиенты прохотят мимо магазина 1 раз в 2-5 секунд и заходят в магазин если он открыт и в нем есть место.
 * Иначе клиент уходит. Магазин закрывается на 10-секундный перерыв один раз в 30 секунд.
 * В перерыв все клиенты выходят из магазина и новые не могут зайти. Каждый клиент находится в магазине
 * в промежутке от 1 до 8 секунд.
 */
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
