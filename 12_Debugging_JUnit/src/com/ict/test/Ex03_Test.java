package com.ict.test;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.ict.junit.Ex01;
import com.ict.junit.Ex02;
import com.ict.junit.Ex03;

public class Ex03_Test {

	Ex01 t1;
	Ex02 t2;
	Ex03 t3;
	
	@Before
	public void beforeTest() {
		
		System.out.println("객체 생성");
		t1 = new Ex01();
		t2 = new Ex02();
		t3 = new Ex03();
		
	}
	
	@Test
	public void test() {
		
		assertEquals(9, t1.add(2, 7));
		assertEquals(-5, t1.add(2, -7));
		assertEquals(5, t1.add(-2, 7));
		assertEquals(-9, t1.add(-2, -7));
		
		assertEquals(5, t1.sub(7, 2));
		
		assertEquals(72, t2.mul(8, 9));
		
	}
	
	@Test
	public void divTest() {

		int res = t3.div(9, 3);
		
		assertEquals(3, res);
		
	}
	
	@After
	public void afterTest() {
		
		System.out.println("메소드 실행");
		
	}

}
