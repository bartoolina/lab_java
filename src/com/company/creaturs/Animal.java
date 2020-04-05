package com.company.creaturs;

import com.company.Seleable;

import java.io.File;

public class Animal implements Edible, Seleable {
    // zdefiniowac raz i tylko przy tworzeniu obiektu
    public final String species;
    protected Double weight;
    public String name;
    File pic;
    // static - stała
    public static final Double DEFAULT_DOG_WEIGHT = 10.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 1.0;
    public static final Double DEFAULT_LION_WEIGHT = 30.0;

    public Animal(String species) {
        this.species = species;
        switch (species) {
            case "dog":
                this.weight = DEFAULT_DOG_WEIGHT;
                break;
            case "mouse":
                this.weight = DEFAULT_MOUSE_WEIGHT;
                break;
            case "lion":
                this.weight = DEFAULT_LION_WEIGHT;
                break;
        }

    }

    public void feed(){
        if ( weight > 0){
            weight++;
            System.out.println(name + " thx for food bro, my weight is now " + weight);
        } else {
            System.out.println(name + " I can't eat, I'm dead.");
        }
    }

    public void takeForWalk(){
        if (weight > 0) {
            weight--;
            if (weight <= 0) {
                weight = 0.0;
                System.out.println(name + " I was walking and now i'm dead");
            }else {

                System.out.println(name + " I'm walking, my weight is now " + weight);
            }
        } else {
            weight = 0.0;
            System.out.println(name + " I can't walk, I'm dead.");
        }
    }

    @Override
    public void beEaten() {
        if (this instanceof Human) {
            System.out.println("bez kanibalizmu");
//            throw new Exception("kanibalizm!");
        } else {
            System.out.println("papa");
            this.weight = 0.0;
        }
    }

//    @Override
//    public void sale() {
//        if (this instanceof Human){
//            System.out.println("Nie da się już handlować ludzmi. Nie te czasy.");
//        } else {
//            System.out.println("sprzedane");
//        }
//    }

    @Override
    public void sale(Human buyer, Human seller, int price) {
        if (buyer.cash >= price) {
            buyer.cash -= price;
            seller.cash += price;
            System.out.println(seller.firstName + " " + seller.lastName + " sprzedal " +
                    buyer.firstName + " " + buyer.lastName + " " + this.name + " za cene " +
                    price);
        } else {
            System.out.println(buyer.firstName + " " + buyer.lastName + " nie ma wystarczajacej gotowki.");
        }
    }
}
