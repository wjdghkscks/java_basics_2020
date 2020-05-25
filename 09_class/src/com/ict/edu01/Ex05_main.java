package com.ict.edu01;

import com.ict.edu01.Ex05.Inner02;

public class Ex05_main {
	public static void main(String[] args) {
	// 내부 클래스 Inner01은 별도로 객체 생성을 할 수 없음
		// Inner01 inner01 = new Inner01();
		// 				>>> 외부 클래스를 통해서 객체를 생성해야 함
		
		Ex05 e5 = new Ex05();
		System.out.println(e5.name);
		
		// System.out.println(e5.age);	>>> private이므로 출력 불가
		
		e5.play();
		
		System.out.println("==============================");
		
	// Member 내부 클래스
		Ex05.Inner01 inner01 = new Ex05().new Inner01();		// 객체가 2번 만들어지기 때문에 권장하지 않는 방법
		
		System.out.println("==============================");

		Ex05.Inner01 inner02 = e5.new Inner01();				// 내부 클래스는 주소값에 $가 들어감
		
		System.out.println("==============================");
		
		inner02.prn();
		
		System.out.println("==============================");
		
	// static 내부 클래스 호출
		System.out.println(Inner02.a3);
		System.out.println(Inner02.a4);
		Inner02.go2();
		
	// static 내부 클래스는 단독으로 만들 수 있음
		Inner02 test = new Inner02();
		System.out.println(test.a1);
		System.out.println(test.a2);
		test.go();		

	}
}
