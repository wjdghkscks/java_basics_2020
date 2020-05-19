package com.ict.edu5;

// Tiger 클래스는 추상 클래스 Animal을 상속 받은 추상 클래스
// Tiger 클래스에서 body 를 완성하지 않았음
// 따라서 Cat 클래스에서 body 를 완성해야 함
class Cat extends Tiger{

	@Override
	public void like() {
		System.out.println("그루밍 하기");
	}
}

// 추상 클래스 2개를 상속받았으므로, 추상 클래스 2개를 한꺼번에 해결해야 함
//															>>> 강제 오버라이딩
class Cat2 extends Tiger2 {

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void like() {
		// TODO Auto-generated method stub
		
	}
	
}