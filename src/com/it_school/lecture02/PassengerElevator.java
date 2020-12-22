package com.it_school.lecture02;

public class PassengerElevator extends AbstractElevator implements Elevator {


    PassengerElevator(int floor, int weight) {

        maxFloors = 10;
        maxWeight = 400;
        speed = 1.0;
        if (floor < maxFloors && weight < maxWeight && weight > 0) {
            this.floor = floor;
            this.weight = weight;
        } else {
            System.out.println("Floor count or weight have invalid value");
        }

    }

    @Override
    public int getMaxWeight() {
        return maxWeight;
    }

    @Override
    public double getSpeed() {
        return speed;
    }

    @Override
    public boolean moveToFloor(int floor, int weight) {
        if (floor == currentFloor || weight < getMaxWeight() && weight > 0 && floor >= 0 && floor < maxFloors) {
            currentFloor = floor;
            System.out.println("Come on passengers");
            return true;
        } else {
            System.out.println("Invalid value for floor or weight");
            return false;
        }
    }

    @Override
    public boolean isOverloadedElevator() {
        return weight > maxWeight;
    }

    @Override
    public int getCurrentFloor() {
        if (floor < 0) {
            System.out.println("Floor can`t be negative");
            return 0; // or maybe -1? Print Error?
        }
        return floor;
    }


}
