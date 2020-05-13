package com.ict.edu;

public class Ex08 {
	public static void main(String[] args) {
		
	// 다차원 배열: 1차원 배열이 여러개 모인 것
	// 고정 길이 배열: 1차원 배열 안에 존재하는 배열의 수가 일정한 배열
		
	// 선언과 생성을 한 번에
	// char[][] ch;
	// ch = new char[3][2];
		
		char[][] ch = new char[3][2];
		
	// 데이터 저장 (고정 길이 배열에서만 가능)
		ch[0][0] = 'a';
		ch[0][1] = 'A';
		
		ch[1][0] = 'b';
		ch[1][1] = 'B';
		
		ch[2][0] = 'c';
		ch[2][1] = 'C';
		
	// 출력하기
		
		for (int i = 0; i < ch.length; i++) {
			for (int j = 0; j < ch[i].length; j++) {
				System.out.println(ch[i][j]);
			}
		}
		System.out.println("=====================");
		
	// 선언, 생성, 데이터 저장을 한 번에
	// int[][] k1 = new int[3][2];
		
		int[][] k1 = {{1, 2}, {10, 20}, {100, 200}};
		
		char[][] k2 = {{'a', 'A'}, {'b', 'B'}, {'c', 'C'}};
		
		String[][] k3 = {{"java", "jsp", "android"}, {"html", "css", "js"}};
		
		for (int i = 0; i < k3.length; i++) {
			for (int j = 0; j < k3[i].length; j++) {
				System.out.println(k3[i][j]);
			}
		}
		
		System.out.println("=====================");
		
	// 1차원 배열을 만들어서 배열에 넣기 (고정 길이, 가변 길이 모두 사용 가능)
		
		int[][] su = new int[2][4];
		
		int[] s1 = {1, 2, 3, 4};
		int[] s2 = {10, 20, 30, 40};
		
		su[0] = s1;
		su[1] = s2;
		
		for (int i = 0; i < su.length; i++) {
			for (int j = 0; j < su[i].length; j++) {
				System.out.println(su[i][j]);
			}
		}
		

	}
}
