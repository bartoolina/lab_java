package com.company;

import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {
//		Animal dog = new Animal("dog");
//		dog.name = "Akita";
//
//		dog.feed();
//		dog.takeForWalk();
//		dog.takeForWalk();
//		dog.takeForWalk();
//		dog.takeForWalk();
//		dog.takeForWalk();
//		dog.takeForWalk();
//		dog.takeForWalk();
//		dog.takeForWalk();
//		dog.takeForWalk();
//		dog.takeForWalk();
//		dog.takeForWalk();
//		dog.takeForWalk();
//		dog.takeForWalk();
//		dog.feed();

		Human me = new Human();
		me.firstName = "Marcin";
		me.lastName = "Nowak";
		me.pet = new Animal("mouse");
		me.pet.name = "Myszojeleń";
		me.pet.feed();

		Car audi =new Car("Audi", 3);
		audi.cost = 20000;
		me.setCar(audi);
		audi.owner = me;

		Human wife = new Human();
		wife.firstName = "Ania";
		wife.lastName = "Nowak";
		wife.setCar(audi);


//		System.out.println(dog.name);
//		System.out.println(me.pet.name);

		System.out.println("my salary is: " + me.getSalary());

    }
}
