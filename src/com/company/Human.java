package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Human {
    String firstName;
    String lastName;
    Phone phone;
    Animal pet;
    private Car car;
    private Double salary = 3000.0;

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
        if (car.owner != null)
        {
            System.out.println("jezdisz samochodem " + car.owner.firstName + " "+ car.owner.lastName);
            this.car = car;
        }
        else {
            if (car.cost < 10*salary)
            {
                System.out.println("Kupiles samochod: " + car.getModel());
                this.car = car;

            }
            else
            {
                System.out.println("Nie stac Cie.");
            }

        }
    }

    public String toString() {
        return firstName + " " + lastName;
    }
}
