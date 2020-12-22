package com.it_school.lecture02;

public class ServiceElevator extends AbstractElevator implements Elevator {

    ServiceElevator(int floor, int weight) {

        maxFloors = 10;
        speed = 5.0;
        maxWeight = 1000;
        if (floor < maxFloors && weight < maxWeight && weight > 0) {
            this.floor = floor;
            this.weight = weight;
        } else {
            System.out.println("Maximum floor is 10");
        }
        this.floor = floor;
        this.weight = weight;
    }

    @Override
    public int getMaxWeight() {

        return maxWeight;
    }

    @Override
    public double getSpeed() {

        return 5.0;
    }

    @Override
    public boolean moveToFloor(int floor, int weight) {
        if (floor == currentFloor || weight < getMaxWeight() && weight > 0 && floor >= 0 && floor < maxFloors) {
            currentFloor = floor;
            System.out.println("Well, starting to go up!");
            return true;
        } else {
            System.out.println("Invalid value for floor or weight");
            return false;
        }

    }

    @Override
    public boolean isOverloadedElevator() {

        return weight > getMaxWeight();
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
