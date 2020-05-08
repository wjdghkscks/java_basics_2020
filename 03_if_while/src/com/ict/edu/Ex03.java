package com.ict.edu;

public class Ex03 {
	public static void main(String[] args) {
		
		// 중첩 if 문 : if 문을 여러개 사용한 조건문
		// 형식 : if(조건식1) {
		//			 조건식1이 참일 때의 실행 문장;
		//			 조건식1이 참일 때의 실행 문장;
		// 			} else if(조건식2) {
		//			 조건식1은 거짓이고, 조건식2는 참인 경우의 실행 문장;
		//			 조건식1은 거짓이고, 조건식2는 참인 경우의 실행 문장;
		// 			} else if(조건식3) {
		//			 조건식1,2는 거짓이고, 조건식3은 참인 경우의 실행 문장;
		//			 조건식1,2는 거짓이고, 조건식3은 참인 경우의 실행 문장;
		// 			} else {
		//			 조건식1,2,3 모두 거짓인 경우의 실행 문장;
		//			 조건식1,2,3 모두 거짓인 경우의 실행 문장;
		//			}
		
		// int k1의 점수가 90 이상이면 A학점, 80 이상이면 B학점, 70 이상이면 C학점, 나머지 F
		int k1 = 98;
		String res = "";
		if (k1 >= 90) {
			res = "A학점";
		} else if (k1 >= 80) {
			res = "B학점";
		} else if (k1 >= 70) {
			res = "C학점";
		} else {
			res = "F";
		}
		System.out.println("결과 : " + res);
		
		// char k2의 대문자/소문자/숫자/기타문자 판별
		char k2 = 2;
		if (k2>='A' && k2<='Z') {
			res = "대문자";
		} else if (k2>='a' && k2<='z') {
			res = "소문자";
		} else if (k2>=0 && k2<=9) {
			res = "숫자";
		} else {
			res = "기타문자";
		}
		System.out.println("결과 : " + res);
		
		
		// char k3가 A, a 면 아프리카 / B, b 이면 브라질 / C, c 이면 캐나다 / 나머지 한국
		char k3 = 'c';
		if (k3=='A' || k3=='a') {
			res = "아프리카";
		} else if (k3=='B' || k3=='b') {
			res = "브라질";
		} else if (k3=='C' || k3=='c') {
			res = "캐나다";
		} else {
			res = "한국";
		}
		System.out.println("결과 : " + res);		
		
		// menu가 1이면 카페모카 3500원 / 2이면 카페라떼 4000원 / 3이면 아메리카노 3000원 / 4이면 과일주스 3500
		// 친구와 2잔을 10000원을 내고 먹었다. 잔돈은 얼마인가? (단, 부가세 10% 포함 / 메뉴는 통일)
		int menu = 3;
		int dan = 0;
		int su = 0;
		int price = 0;
		String name = "";
		int vat = (int)(0.1 * price);
		int input = 0;
		int change = 0;
		if (menu == 1) {
			dan = 3500;
			su = 2;
			price = dan * su;
			name = "카페모카";
			vat = (int)(0.1 * price);
			input = 10000;
			change = input - (price + vat);
		} else if (menu == 2) {
			dan = 4000;
			su = 2;
			price = dan * su;
			name = "카페라떼";
			vat = (int)(0.1 * price);
			input = 10000;
			change = input - (price + vat);
		} else if (menu == 3) {
			dan = 3000;
			su = 2;
			price = dan * su;
			name = "아메리카노";
			vat = (int)(0.1 * price);
			input = 10000;
			change = input - (price + vat);
		} else if (menu == 4){
			dan = 3500;
			su = 2;
			price = dan * su;
			name = "과일주스";
			vat = (int)(0.1 * price);
			input = 10000;
			change = input - (price + vat);
		}
		System.out.println("잔돈 : " + change + "원");
		System.out.println("===== 리팩토링: 중복 코딩을 줄이자 =====");
		
		int dan2 = 0;
		String name2 = "";
		
		if (menu == 1) {
			dan2 = 3500;
			name2 = "카페모카";
		} else if (menu == 2) {
			dan2 = 4000;
			name2 = "카페라떼";
		} else if (menu == 3) {
			dan2 = 3000;
			name2 = "아메리카노";
		} else if (menu == 4) {
			dan2 = 3500;
			name2 = "과일주스";
		}
		int su2 = 2;
		int price2 = dan2 * su2;
		int vat2 = (int)(0.1 * price2);
		int input2 = 10000;
		int change2 = input2 - (price2 + vat2);		// 계산이 필요한 값들을 아래쪽에 위치
		
		System.out.println("잔돈 : " + change2 + " 원");
		
		System.out.println("=============");
	
	}
}
