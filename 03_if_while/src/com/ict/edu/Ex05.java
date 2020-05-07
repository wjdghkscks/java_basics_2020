package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {

	// for문: 정해진 규칙에 따라 실행문을 반복 처리
	// for (초기식; 조건식; 증감식) {
	// 		조건식이 참일때 실행할 문장;
	// }
	// for문은 무조건 초기식부터 시작함. 조건식
	// 조건식은 boolean형 (boolean, 비교연산, 논리연산)
	// 조건식이 참이면 for문 안쪽 블록을 실행.
	// for문의 끝을 만나면 무조건 증감식으로 이동.
	// 증감식은 초기식을 증가하거나 감소하는 역할을 하고난 후, 다시 조건식으로 이동.
	// 조건식이 거짓이 되면 for문을 빠져나감.

	// 자바에서 if문, switch문, for문 안에서 만든 변수는 밖에서 사용할 수 없음.
		
	// 안녕하세요 10번 출력하기
		for (int i = 1; i < 11; i++) {
			System.out.println(i + ". Hello");
		}
		
		System.out.println("========================");
		
	// 0부터 10까지 출력하기
		for (int i = 0; i < 11; i++) {
			System.out.println(i);
		}
	
		System.out.println("========================");
		
	// 0부터 10까지 짝수만 출력하기
		for (int i = 0; i < 6; i++) {
			System.out.println(2 * i);
		}
		
		System.out.println("========================");
		
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		System.out.println("========================");
		// i의 값을 일일이 검사하지 않고 하나씩 건너뛰므로 좋은 코딩이 아님.
		for (int i = 0; i < 11; i = i + 2) {
			System.out.println(i);
		}
	}
}
