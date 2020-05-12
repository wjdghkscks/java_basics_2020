package com.ict.edu;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 입력을 받은 후 반복문 만들기
		
		System.out.print("원하는 반복 횟수 : ");
		int count = sc.nextInt();
		
		System.out.print("원하는 단어 : ");
		String str = sc.next();
		
		for (int i = 0; i < count; i++) {
			System.out.println((i+1) + ". " + str);
		}
		
	}
}
