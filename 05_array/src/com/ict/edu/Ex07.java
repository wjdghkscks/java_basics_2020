package com.ict.edu;

public class Ex07 {
	public static void main(String[] args) {
		
	// 다차원 배열: 1차원 배열이 여러 개 모인 것
	// 종류: 고정 길이, 가변 길이
	// 고정 길이: 1차원 배열 안에 존재하는 배열의 수가 일정한 배열
	// 가변 길이: 1차원 배열 안에 존재하는 배열의 수가 일정하지 않은 배열
	
	// 고정 길이 배열
	// 1. 선언: 자료형[][] 이름;
	
		int[][] su;
		
	// 2. 생성: 이름 = new 자료형[1차원 배열의 수][1차원 배열 안에 존재하는 배열의 수];
		
		su = new int[2][3];
		
	// 3. 데이터 저장
		
		su[0][0] = 10;
		su[0][1] = 20;
		su[0][2] = 30;
		
		su[1][0] = 100;
		su[1][1] = 200;
		su[1][2] = 300;
		
	// 주소확인 (생성 ID 확인)
		
		System.out.println(su);
		System.out.println(su[0]);
		System.out.println(su[1]);
		
		System.out.println("==================");
	
	// 다차원 배열의 출력
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}
		
		
		
	}
}
