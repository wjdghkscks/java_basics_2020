package com.ict.edu08;

// 인터페이스 상속
// 인터페이스 구현 >>> implements
class Ex03 implements Ex01 {
	
// 1. 일반 클래스는 상속을 받으면 반드시 오버라이딩 필요
	@Override
	public void play() {}
	@Override
	public void sound() {}
}	
// 2. 추상 클래스가 상속을 받으면 오버라이딩을 할 필요 없음
abstract class Ex04 implements Ex01 {
		
	int k1 = 10;		// instance 변수
		
	public abstract void leftSound();
}
	
abstract class Ex05 implements Ex01 {
	
	int k1 = 10;		// instance 변수
}
	
// 3. 인터페이스가 상속을 받을때도 오버라이딩을 할 필요 없음
interface Ex06 extends Ex01 {

	int k1 = 10;	// static final
}
	
// 4. 단, 추상 클래스와 인터페이스 모두 일반 클래스가 상속받을 때 오버라이딩이 필요
class Ex07 extends Ex05{

	@Override
	public void play() {}

	@Override
	public void sound() {}
		
}

class Ex08 extends Ex04{

	@Override
	public void play() {}
	
	@Override
	public void sound() {}
	
	@Override
	public void leftSound() {}
}
