package com.austin.zookeeper;

public class Gorilla extends Mammal {
	public void throwSomething() {
		System.out.println("Yeet!");
		this.setEnergyLevel(-5);
	}
	
	public void eatBananas() {
		System.out.println("Nom Nom Yummy!");
		this.setEnergyLevel(+10);
	}
	
	public void climb() {
		System.out.println("I Climb Tree!");
		this.setEnergyLevel(-10);
	}
}
