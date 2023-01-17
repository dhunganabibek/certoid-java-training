package com.bibekdhungana;


//abstract class
// we can not create object of this class (we can only create a reference)
//Dog d = new Dog(); ----- not posible
// Dog d ---- possible


//abstract method  
// abstract method have no implementation
public abstract class Dog {
	public Dog(int a) {
		System.out.println("Dog abstract constructor");
	}
	
	public void sound() {
		System.out.println("Parent Dog: Woof Woof");
	}
	
	
}

