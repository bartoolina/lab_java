package com.company.devices;

import com.company.Seleable;
import com.company.creaturs.Human;

public abstract class Device implements Seleable {
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

    @Override
    public void sale(Human buyer, Human seller, int price) {
        if (buyer.cash >= price) {
            buyer.cash -= price;
            seller.cash += price;
        } else {
            System.out.println(buyer.firstName + " " + buyer.lastName +
                    " nie ma wystarczajacej gotowki, zeby kupic " + this.mark);
        }
    }
}
