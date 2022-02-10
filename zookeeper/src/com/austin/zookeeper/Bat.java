package com.austin.zookeeper;

public class Bat extends Mammal{
	public Bat() {
		super.setEnergyLevel(300);
	}

	public void fly() {
		System.out.println("Woosh!");
		super.setEnergyLevel(-50);
	}
	
	public void eatHumans() {
		System.out.println("Chomp! Slurp!");
		super.setEnergyLevel(+25);
	}
	
	public void attackTown() {
		System.out.println("Help!");
		super.setEnergyLevel(-100);
	}
}
