package com.company;

public class Main {

    public static void main(String[] args) {
		Animal dog = new Animal("dog");
		dog.name = "Akita";

		dog.feed();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.takeForWalk();
		dog.feed();

		Human me = new Human();
		me.firstName = "Marcin";
		me.lastName = "Nowak";
		me.pet = new Animal("mouse");
		me.pet.name = "Myszojeleń";
		me.pet.feed();

		me.car = new Car("Audi", 3);


		System.out.println(dog.name);
		System.out.println(me.pet.name);

    }
}
