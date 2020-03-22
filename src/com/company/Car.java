package com.company;

public class Car {
    private final String model;
    private final int numberOfDoors;
    public int cost;
    public Human owner;

    public Car(String model, int numberOfDoors) {
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public String getModel() {
        return this.model;
    }

//    public void setOwner(Human owner) {
//        this.owner = owner;
//    }
//
//    public  Human getOwner() {
//        return owner;
//    }
}
