package com.ict.edu10;

public class Calc2 implements Add, Sub, Mul, Div{		// 다중 상속

	@Override
	public double plus(double s1, double s2) {
		return  s1 + s2;
	}

	@Override
	public double minus(double s1, double s2) {
		return s1 - s2;
	}

	@Override
	public double mul(double s1, double s2) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double div(double s1, double s2) {
		// TODO Auto-generated method stub
		return 0;
	}

}
