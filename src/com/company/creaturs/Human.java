package com.company.creaturs;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    public String firstName;
    public String lastName;
    Phone phone;
    public Animal pet;
    private Car car;
    private Double salary = 3000.0;
    public Double cash = 1000.0;

    public static final Double DEFAULT_HUMAN_WEIGHT = 70.0;

    public Human() {
//        super(species);

        super("Homo Sapiens");
        this.weight = DEFAULT_HUMAN_WEIGHT;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        if (car.owner != null) {
            System.out.println("jezdisz samochodem " + car.owner.firstName + " " + car.owner.lastName);
            this.car = car;
        } else {
            if (car.cost < 10 * salary) {
                System.out.println("Kupiles samochod: " + car.getModel());
                this.car = car;

            } else {
                System.out.println("Nie stac Cie.");
            }

        }
    }

    public String toString() {
        return firstName + " " + lastName;
    }

    @Override
    public void sale(Human buyer, Human seller, int price) {
        System.out.println("nie mozna sprzedac ani kupic czlowieka.");
    }
}
