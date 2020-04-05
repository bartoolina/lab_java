package com.company.devices;

import com.company.creaturs.Human;

public class Device {
    protected final String model;
    private final String mark;
    protected final Integer yearOfProduction;
    public int cost;
    public Human owner;

    public Device(String mark, String model, Integer yearOfProduction) {
        this.model = model;
        this.mark = mark;
        this.yearOfProduction = yearOfProduction;
    }
}
