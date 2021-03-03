package com.it_school.lecture02;

public class DisabledElevatorForDisabled extends AbstractElevator {

    DisabledElevatorForDisabled(int floor, int weight) {

        maxFloors = 10;
        maxWeight = 200;
        speed = 0.8;
        if (floor < maxFloors && weight < maxWeight && weight > 0) {
            this.floor = floor;
            this.weight = weight;
        } else {
            System.out.println("Maximum floor is 10");
        }
    }

    @Override
    public int getMaxWeight() {
        return maxWeight;
    }


    @Override
    public boolean moveToFloor(int floor, int weight) {
        if (floor == currentFloor || weight < getMaxWeight() && weight > 0 && floor >= 0 && floor < maxFloors) {
            currentFloor = floor;
            System.out.println("Be careful, passengers, we`re going to go!");
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
