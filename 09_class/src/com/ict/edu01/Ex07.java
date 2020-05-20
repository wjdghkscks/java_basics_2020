package com.ict.edu01;

// 추상 클래스: 추상 메소드를 가지고 있는 클래스
abstract class Abs{
	int data = 10000;
	public abstract void printData();
}

class AbsTest extends Abs {
	@Override
	public void printData() {
		System.out.println("data1: " + data);
	}
}

class AbsTest2 {
	// 추상 클래스를 상속받지 않고 바로 객체를 생성
	Abs abs = new Abs() {
		// @Override		>> 오버라이딩이 아니기때문에, 굳이 적지 않아도 괜찮다
		public void printData() {
			System.out.println("data2: " + data);
		}
	};
}

class AbsTest3 {
	public void play() {
		new Abs() {
			public void printData() {
				System.out.println("data3: " + data);
			}
		}.printData();;
	}
}


public class Ex07 {
	public static void main(String[] args) {
		
		AbsTest absTest = new AbsTest();
		absTest.printData();
		
		System.out.println("=====================");
		
		AbsTest2 absTest2 = new AbsTest2();
		absTest2.abs.printData();
		
		System.out.println("=====================");
		
		AbsTest3 absTest3 = new AbsTest3();
		absTest3.play();
		
	}
}
