package com.company;

import java.io.File;

public class Animal {
    // zdefiniowac raz i tylko przy tworzeniu obiektu
    final String species;
    private Double weight;
    public String name;
    File pic;
    // static - stała
    public static final Double DEFAULT_DOG_WEIGHT = 10.0;
    public static final Double DEFAULT_MOUSE_WEIGHT = 1.0;
    public static final Double DEFAULT_LION_WEIGHT = 30.0;

    public Animal(String species) {
        this.species = species;
        if (species == "dog"){
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (species == "mouse"){
            this.weight = DEFAULT_MOUSE_WEIGHT;
        } else if ( species == "lion"){
            this.weight = DEFAULT_LION_WEIGHT;
        }

    }

    void feed(){
        if ( weight > 0){
            weight++;
            System.out.println(name + " thx for food bro, my weight is now " + weight);
        } else {
            System.out.println(name + " I can't eat, I'm dead.");
        }
    }

    void takeForWalk(){
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
}
