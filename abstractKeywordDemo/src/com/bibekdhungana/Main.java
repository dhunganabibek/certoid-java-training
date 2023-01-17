package com.bibekdhungana;

public class Main {

	public static void main(String[] args) {
		//abstract keyword
		//work as filter and hiding implementation details.
		
		//abstract keyword can be applied with methods and class (variable can not be abstract) 
		
		//abstract method: method that does not have definition
		
		
		Dog d = new ChildDog(10); //or new Dog();
		//who is creating new Dog() to access instance sound method of dog class.
		d.sound();
		
		
		
		
	}

}
