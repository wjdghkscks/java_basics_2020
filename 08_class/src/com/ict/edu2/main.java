package com.ict.edu2;

public class main {
	public static void main(String[] args) {
		
		DCaPhone dca = new DCaPhone();
		dca.call();			// 부모 클래스
		dca.sms();			// 부모 클래스
		dca.dca();			// DCaPhone 클래스
		
		System.out.println("=====================");
		
		MP3Phone mp3 = new MP3Phone();
		
		mp3.call();			// 부모 클래스
		mp3.sms();			// 부모 클래스
		mp3.sound();		// MP3Phone 클래스
		
		System.out.println("=====================");
		
		GamePhone gp = new GamePhone();
		
		gp.call();			// 부모 클래스
		gp.sms();			// 부모 클래스
		gp.play();			// GamePhone 클래스
		
		System.out.println("=====================");
		
		Phone p1 = new DCaPhone();
		p1.call();			// 객체 생성 시 '부모클래스 객체이름 = new 자식클래스생성자' 으로도 생성 가능
		p1.sms();			// 공통 속성인 부모의 속성은 사용 가능
		// p1.dca();		>>> 단, 자식 클래스의 속성은 사용 불가
		
	}
}
