package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex01;

// [JUnit]
//	- eclipse에서 제공하는 메소드 단위 테스트 도구
//	- 블랙박스 테스트: 입력값을 넣은 후 예상값이 일치하면 성공, 일치하지 않으면 실패

//	- assertEquals: 기본형 변수 or 객체의 값이 예상값과 일치하는지 검사하는 메소드
//	- assertSame: 두 객체가 같은 객체인지 검사	>>> 주소가 일치하는 지 검사
//	- assertNull: null 인지 검사
//	- assertNotNull: null이 아닌지 검사
//	- assertTrue(a): a가 참인지 검사
//	- assertArrayEquals(a, b): 배열 a, 배열 b가 일치하는지 확인

public class Ex01_Test {

// 테스트 실행 전 >>> 실행할 메소드의 클래스 객체 생성
	
	Ex01 t1;		// 객체 선언
	
	@Before			// annotation : 컴파일러에게 지시를 내림
	public void testBefore() {
		
		System.out.println("실행 클래스의 객체 생성");
		t1 = new Ex01();	// 객체 생성
		
	}
	
// 테스트를 실행하는 메소드
	@Test
	public void addTest() {
		
		int res = t1.add(10, 20);
		
		assertEquals(30, res);
		
	}
	
	@Test
	public void subTest() {
		
		int res = t1.sub(20, 10);
		
		assertEquals(10, res);
		
	}
	
	
// 테스트 실행 후
	@After			// annotation
	public void testAfter() {
		
		System.out.println("테스트 실행 후 메소드 실행");
		
	}

}
