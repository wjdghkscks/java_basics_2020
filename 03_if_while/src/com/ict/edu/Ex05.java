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
	// 증감식은 초기식을 증가하거나 감소하는 역할을 하며, 이후 다시 조건식으로 이동.
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
			
		System.out.println("========================");
		
	// 0부터 50까지 7의 배수만 출력
		for (int i = 0; i < 51; i++) {
			if (i % 7 == 0) {
				System.out.println(i);
				// 출력 후 한 줄 띄우기
			}
		}
			
		System.out.println("========================");
		
	// a ~ g
		for (char i = 'a'; i < 'h'; i++) {
			System.out.print(i+"\t");
			// 옆으로 출력하기
			// \t는 tab을 의미하는 이스케이프 문자
			}
		System.out.println();
		
		System.out.println("가나\n다라");
		// \n은 줄바꿈을 의미하는 이스케이프 문자
		
		// System.out.println() : 줄 바꾸기
		// System.out.print() : 존재하지 않음
		// System.out.println(변수나 데이터) : 출력 후 줄 바꾸기
		// System.out.print(변수나 데이터) : 옆으로 출력하기
		// 
		// 이스케이프 문자
		//	 \t : tab을 의미
		//	 \n : 줄바꿈을 의미

		System.out.println("========================");
		
	// 구구단 5단을 출력하기
		for (int i = 1; i < 10; i++) {
			System.out.println("5 X " + i + " = " + (5 * i));
		}
		
		System.out.println("========================");

	// 0 이 4개씩 적힌 정사각형 만들기
		for (int i = 0; i < 4; i++) {
			System.out.print(0);
			System.out.print(0);
			System.out.print(0);
			System.out.println(0);			
		}
		
		System.out.println();
		
		for (int i = 0; i < 4; i++) {
			System.out.println("0 0 0 0");
		}
				
		System.out.println();
		
		for (int i = 1; i < 17; i++) {
			System.out.print("0 ");
			if (i % 4 == 0) {
				System.out.println();
			}
		}
		
		System.out.println("========================");

	// 0 ~ 10 누적합 (합계)
		int sum = 0;	// 이전 값을 기억시키는 변수
		for (int i = 0; i < 11; i++) {
			sum = sum + i;	// i의 누적합을 구하는 방법
		}
		System.out.println("합: " + sum);
		
	// 0 ~ 10 홀수의 합계
		int odd = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 != 0) {
				odd = odd + i;
			}
		}
		System.out.println("홀수의 합: " + odd);
		
	// 0 ~ 10 짝수의 합계
		int even = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 == 0) {
				even = even + i;
			}
		}
		System.out.println("짝수의 합: " + even);
		
		System.out.println();
		
	// 0 ~ 10 홀수, 짝수의 합계
		odd = 0;
		even = 0;
		for (int i = 0; i < 11; i++) {
			if (i % 2 != 0) {
				odd = odd + i;
			} else {
				even = even + i;
			}
		}
		System.out.println("홀수의 합: " + odd);
		System.out.println("짝수의 합: " + even);
		System.out.println("총합: " + (even + odd));
		
	// 7! (7 * 6 * 5 * 4 * 3 * 2 * 1) 의 값 구하기
		sum = 1;
		for (int i = 1; i < 8; i++) {
			sum = sum * i;
		}
		System.out.println("7! = " + sum);
		
		sum = 1;
		for (int i = 7; i > 0; i--) {
			sum = sum * i;
		}
		System.out.println("7! = " + sum);
	}
}
