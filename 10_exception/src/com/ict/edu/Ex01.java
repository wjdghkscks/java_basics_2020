package com.ict.edu;

// [예외 처리] exception(), try~ catch~
//	- 목적: 비정상적인 종료를 정상적인 종료로 유도하여,
//			예외 발생 시 예외를 처리
//	- 형식
//		try {
//			 예외가 발생할 수 있는 문장들;
//			 예외가 발생할 수 있는 문장들;
//			 예외가 발생할 수 있는 문장들;
//		} catch(예외 객체 e) {
//			 예외 객체 처리 문장;
//		}

public class Ex01 {
	public static void main(String[] args) {
		
		// 예외 처리
		try {
			int[] var = {10, 20, 30};
			for (int i = 0; i <= var.length; i++) {
				System.out.println(1);
				System.out.println(2);
				System.out.println("var[" + i + "] = " + var[i]);
				System.out.println(3);
				System.out.println(4);
				System.out.println("------------------");
			}
		} catch (Exception e) {
			System.out.println("예외 발생");
		}
		
		System.out.println("수고하셨습니다.");
	}
}
