package com.it_school.lecture02;

public interface Elevator {
    /**
     * @return maximum weight that elevator can lift
     */
    int getMaxWeight();

    /**
     * @return elevator's speed
     */
    double getSpeed();

    /**
     * Change floor
     *
     * @return true - if can move, false - otherwise
     */
    boolean moveToFloor(int floor, int weight);

    /**
     * @return true if entered parameter of weight more than maximum for this type of elevator;
     * Can answer for the question why elevator can`t move;
     */
    boolean isOverloadedElevator();

    /**
     * @return integer value of current floor.
     * Can answer for the question  why elevator can`t move;
     */
    int getCurrentFloor();
}
