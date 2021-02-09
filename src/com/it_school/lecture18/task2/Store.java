package com.it_school.lecture18.task2;

import java.util.Queue;

import java.util.TimerTask;

public class Store extends TimerTask {

    private static boolean isOpen;
    private static Queue<Client> queue;


    Store(boolean isOpen, Queue<Client> queue) {
        Store.isOpen = isOpen;
        Store.queue = queue;
    }

    private void goToTimeOut() throws InterruptedException {
        isOpen = false;
        System.out.println("Магазин ушел на перерыв. Клиентов было: " + queue.size());
        Thread.sleep(10_000);
        queue.clear();
    }

    @Override
    public void run() {

        try {

            goToTimeOut();
            System.out.println("Магазин снова работает. Клиентов: " + queue.size());
            isOpen = true;
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }

    }


    static class AddClient extends TimerTask {

        @Override
        public void run() {
            if (queue.size() < 5 && isOpen) {
                queue.add(new Client());
                System.out.println("Новый покупатель. Клиентов: " + queue.size());
            }
        }
    }

    static class DeleteClient extends TimerTask {

        @Override
        public void run() {
            if (queue.size() >= 1) {
                queue.remove();
                System.out.println("Покупатель ушел. Клиентов: " + queue.size());
            }
        }
    }
}

