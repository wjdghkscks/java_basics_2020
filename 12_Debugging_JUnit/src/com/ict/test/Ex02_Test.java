package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex02;

public class Ex02_Test {

	Ex02 t2;
	
	@Before
	public void testBefore() {
		
		System.out.println("객체 생성");
		t2 = new Ex02();
		
	}
	
	@Test
	public void mulTest() {

		int res = t2.mul(10, 20);
		
		assertEquals(200, res);
		
	}

	@After
	public void testAfter() {
		
		System.out.println("메소드 실행");
		
	}
	
	
}
