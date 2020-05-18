package com.ict.edu;

import java.util.Random;
	// Random 클래스를 상속 받아서 사용	>>> 비효율적인 방법 (코드가 길어짐, 상속을 Random에 사용)
public class Ex03 extends Random {
	public static void main(String[] args) {
		
		// main 메소드도 static이기 때문에
		// static 지역 변수를 만들 수 없음
		// int num = nextInt(10)+1;
		
		// static 메소드가 아니라 사용 불가
		// int num = nextInt(10)+1;
		// System.out.println(num);
		
		// play 메소드를 사용하기 위해서는 현재 클래스를 객체로 만들어야 함
		Ex03 e3 = new Ex03();
		e3.play();
		
	}
	
	public void play() {
		
		int num = nextInt(10)+1;	// 1 ~ 10
		System.out.println(num);
		
	}
	
}
