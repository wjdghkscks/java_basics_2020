package com.ict.edu07;

public class Zerg extends Unit {
	
	String name;
	int energy;
	boolean fly;
	
	public Zerg() {}
	
	public Zerg(String name, int energy, boolean fly) {
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}

	@Override
	public void decEnergy() {
		energy = energy - 9;
	}
	
}