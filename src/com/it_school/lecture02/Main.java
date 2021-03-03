package com.it_school.lecture02;

import java.util.ArrayList;
/**
 * Написать иерархию классов, во главе которой находится интерфейс Elevator (лифт). Необходимые реализации:
 * <p>
 * <p>
 * <p>
 * пассажирский лифт
 * грузовой лифт
 * лифт для инвалидов
 * <p>
 * <p>
 * Необходимые методы в примере (можно добавить свои, но перечисленные 3 метода - обязательные):
 * public interface Elevator {
 * <p>
 *
 * @return maximum weight that elevator can lift
 * <p>
 * <p>
 * int getMaxWeight();
 * @return elevator's speed
 * <p>
 * double getSpeed();
 * <p>
 * Change floor
 * @return true - if can move, false - otherwise
 * <p>
 * boolean moveToFloor(int floor,int weight);
 * <p>
 * }
 * Перед движением лифта выполнить проверку, может ли он двигаться.
 * <p>
 * В Main-классе создать объекты всех реализаций, поместить их в массив, попробовать переместить каждый лифт на -3, 9999, 8 и 1 этажи.
 * <p>
 * Предусмотреть случаи:
 * движение лифта на тот же этаж, где он сейчас находится
 * перегруз лифта
 * UPDATE: реализация метода moveToFloor в каждом лифте должны отличаться (чем - на ваше усмотрение)
 */


public class Main {
    public static void main(String[] args) {
        // создание объектов;
        Elevator passengerElevator = new PassengerElevator(2, 300);
        Elevator serviceElevator = new ServiceElevator(4, 600);
        Elevator disabledElevator = new DisabledElevatorForDisabled(2, 100);

        //добавление элементов в список
        ArrayList<Elevator> list = new ArrayList<>();
        list.add(passengerElevator);
        list.add(serviceElevator);
        list.add(disabledElevator);

        //вызов всех методов у объекта типа лифт
        for (Elevator o : list) {
            o.moveToFloor(1, 100);
            o.moveToFloor(8, 300);
            o.moveToFloor(-3, 100);
            o.moveToFloor(999, 200);
            System.out.println("=======================");

        }

    }
}
