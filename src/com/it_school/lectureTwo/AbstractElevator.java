package com.it_school.lectureTwo;

public abstract class AbstractElevator implements Elevator{
    protected int floor;
    protected int weight;
    protected int currentFloor;
    protected int maxWeight;
    protected double speed;
    protected int maxFloors;
    public double getSpeed(){
        return  speed;
    }
}
