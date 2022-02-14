package com.austin.zookeeper;

public class Mammal {
//	Member Variables
	private int energyLevel = 0;
	
// Constructors
	public Mammal(){
	}
	
	public Mammal(int x) {
		setEnergyLevel(x);
	}
// Methods
	
// Getters and Setters
	public int getEnergyLevel() {
		System.out.println("Energy: " + energyLevel);
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}
