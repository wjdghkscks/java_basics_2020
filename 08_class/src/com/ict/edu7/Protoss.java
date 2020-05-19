package com.ict.edu7;

// Unit 클래스가 추상 클래스이기 때문에
// 일반 클래스 Protoss는 반드시 오버라이딩을 해야 함
public class Protoss extends Unit {
	
	String name;
	int energy;
	boolean fly;
	
	public Protoss() {}

	public Protoss(String name, int energy, boolean fly) {
		this.name = name;
		this.energy = energy;
		this.fly = fly;
	}

	@Override
	public void decEnergy() {
		energy = energy - 2;
	}
	
}