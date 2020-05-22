package com.ict.edu;

public class Ex09 {
	public static void main(String[] args) {

	// 다차원 배열: 1차원 배열이 여러개 모인 것
	// 가변 길이 배열: 1차원 배열 안에 존재하는 배열의 수가 일정하지 않은 배열
		
	// 선언: 자료형[][] 이름;
	// 생성: 이름 = new 자료형[1차원 배열의 수][];
	// 선언과 생성을 한 번에: 자료형[][] 이름 = new 자료형[1차원 배열의 수][];
		
		char[][] ch = new char[3][];
		
	// 데이터 저장
	
		char[] c1 = {'j', 'a', 'v', 'a'};
		char[] c2 = {'j', 's', 'p'};
		char[] c3 = {'a', 'n', 'd', 'r', 'o', 'i', 'd'};
		
		ch[0] = c1;
		ch[1] = c2;
		ch[2] = c3;
		
		
	// 출력하기
				
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {		// 각 배열의 길이에 맞춰서 범위를 지정
				System.out.println(ch[i][j]);
			}
		}
		
		System.out.println("=====================");
		
	// 선언, 생성, 데이터 저장을 한 번에
		
		int[][] k1 = {{1, 2}, {4, 5, 6, 7, 8}, {10, 20, 30}};
		
	// 출력하기
		for (int i = 0; i < k1.length; i++) {
			for (int j = 0; j < k1[i].length; j++) {
				System.out.println(k1[i][j]);
			}
		}
		
		

	}
}
