package com.company.devices;

import com.company.creaturs.Human;

public class Car extends Device{
//    private final String model;
    private final int numberOfDoors;
//    public int cost;
//    public Human owner;
    public Car(String mark, String model, Integer yearOfProduction, int numberOfDoors) {
        super(mark, model, yearOfProduction);

        this.numberOfDoors = numberOfDoors;

    }

    public String getModel() {
        return this.model;
    }

    public String toString() {
        return model + " " + cost;
    }
//    public void setOwner(Human owner) {
//        this.owner = owner;
//    }
//
//    public  Human getOwner() {
//        return owner;
//    }
}
