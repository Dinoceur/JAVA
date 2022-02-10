package com.austin.zookeeper;

public class Mammal {
	private int energyLevel = 0;

	public Mammal(){
	}
	
	
	public int getEnergyLevel() {
		System.out.println("Energy: " + energyLevel);
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	
}
