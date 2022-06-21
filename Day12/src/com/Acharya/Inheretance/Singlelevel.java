package com.Acharya.Inheretance;

class Animal {
		void eat()
		{
			System.out.println("Eating...");
		}
	}
class Dog extends Animal
{
	void bark()
	{
		System.out.println("Barking...");
	}
}
public class Singlelevel{
	public static void main(String[] args) {
		Animal a=new Animal();
		Animal a1=new Dog();
		Dog d=new Dog();
		a.eat();
		a1.eat();
		d.bark();
	}
}
