package com.ict.edu;

import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		
	// 숫자를 받아서 홀수/짝수를 구분
	
		Scanner sc = new Scanner(System.in);
		
		System.out.print("숫자 입력 : ");
		int su1 = sc.nextInt();
		String res = "";
		if (su1 % 2 == 0) {
			res = "짝수";
		} else {
			res = "홀수";
		}
		System.out.println("결과 : " + res);
		
		System.out.println("=========================");
		
	// 나라를 입력하면 수도를 출력
	// 1. 한국 - 서울	2. 중국 - 베이징	3. 일본 - 도쿄	/ 나머지는 데이터 없음
		
		System.out.print("국가 번호 입력: 1. 한국 2. 중국 3. 일본 >>> ");
		int number = sc.nextInt();
		res = "";
		if (number == 1) {
			res = "서울";
		} else if (number == 2) {
			res = "베이징";
		} else if (number == 3) {
			res = "도쿄";
		} else {
			res = "데이터 없음";
		}
		
		System.out.println("결과: " + res);
		
		System.out.println("=========================");
		
		System.out.print("나라 이름 입력: 한국/중국/일본 >>> ");
		String country = sc.next();
		res = "";
		
		switch (country) {
		case "한국": res = "서울"; break;
		case "중국": res = "베이징"; break;
		case "일본": res = "도쿄"; break;
		default: res = "데이터 없음"; break;
		}
		
		System.out.println("결과: " + res);
		
		System.out.println("=========================");
		
	// 근무시간이 8시간가지는 8590원, 그 이후로는 1.5배 적용
	// 근무시간을 입력하여 금액을 산정
		
		System.out.print("근무시간을 입력하시오. ");
		int time = sc.nextInt();
		int wage_h = 8590;
		int salary = 0;
		if (time > 8) {
			salary = (8 * wage_h) + (int)((1.5 * wage_h * (time - 8)));
		} else {
			salary = time * wage_h;			
		}
		System.out.println("총액 : " + salary + "원");
		
		System.out.println("=========================");
		
	// menu가 1이면 카페모카 3500, 2이면 카페라떼 4000, 3이면 아메리카노 3000, 4이면 과일주스 3500
	// 친구와 10000원을 내고 2잔을 마셨다.
	// 메뉴를 고른 결과와 잔돈을 출력하라. (부가세 10%)
		
		System.out.print("1.카페모카(3.5) 2.카페라떼(4.0) 3. 아메리카노(3.0) 4. 과일주스(3.5)\n메뉴 번호를 선택하세요 : ");
		int menu = sc.nextInt();
		System.out.print("몇 잔을 주문하시겠습니까? ");
		int count = sc.nextInt();
		System.out.print("돈을 넣어주세요. ");
		int input = sc.nextInt();
		
		String name = " ";
		int dan = 0;
		
		if (menu == 1) {
			name = "카페모카";
			dan = 3500;
		} else if (menu == 2) {
			name = "카페라떼";
			dan = 4000;
		} else if (menu == 3) {
			name = "아메리카노";
			dan = 3000;
		} else if (menu == 4) {
			name = "과일주스";
			dan = 3500;
		}
		
		int total = count * dan;
		int vat = (int)(0.1 * total);
		int output = input - (total + vat);
		
		System.out.println("------------------------------");
		
		System.out.println(name + " " + count + "잔을 주문하셨습니다.");
		System.out.println("총액은 " + total + "원 입니다. (VAT 제외)");
		System.out.println("잔돈은 " + output + "원 입니다. (VAT 포함)");
		
	}
}
