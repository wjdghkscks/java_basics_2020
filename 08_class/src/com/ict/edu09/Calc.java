package com.ict.edu09;

public class Calc implements Add, Sub, Oper {
	// Add, Sub, Oper에 있는 모든 추상 메소드를 오버라이딩
	
	@Override		//  Add의 추상 메소드 plus를 구현
	public double plus(double s1, double s2) {
		return s1 + s2;
	}

	@Override		//  Sub의 추상 메소드 minus를 구현
	public double minus(double s1, double s2) {
		return s1 - s2;
	}

	@Override		//  Oper의 추상 메소드 mul을 구현
	public double mul(double s1, double s2) {
		return s1 * s2;
	}

	@Override		//  Oper의 추상 메소드 div를 구현
	public double div(double s1, double s2) {
		return s1 / s2;
	}
	
}
