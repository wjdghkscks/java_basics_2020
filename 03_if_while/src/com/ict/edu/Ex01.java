package com.ict.edu;

public class Ex01 {
	public static void main(String[] args) {
		// 단순 if: 조건식이 참일때만 실행, 거짓일때는 if문 무시
		// 조건식: boolean, 비교연산, 논리연산
		// 형식: if(조건식){
		// 조건식이 참일 때 실행 문장;
		// 조건식이 참일 때 실행 문장;
		// }
		// 단, 실행문장이 한 줄 일때는 { } 생략 가능, 여러줄일때는 무조건 작성

		// int k1 이 60 이상이면 합격.
		int k1 = 67;
		String str = "초기값";
		if (k1 >= 60) {
			str = "합격";
		}
		System.out.println("결과 : " + str);

		// int k2 가 60 이상이면 합격, 60 미만은 불합격.
		int k2 = 59;
		str = "초기값";
		if (k2 >= 60) {
			str = "합격";
		}
		if (k2 < 60) {
			str = "불합격";
		}
		System.out.println("결과 : " + str);

		// int k3 가 60 이상이면 합격, 60 미만은 불합격.
		int k3 = 62;
		str = "불합격";
		if (k3 >= 60) {
			str = "합격";
		}
		System.out.println("결과 : " + str);

		System.out.println();

		// 홀수 짝수 판별
		int k4 = 7;
		str = "홀수";
		if (k4 % 2 == 0) {
			str = "짝수";
		}
		System.out.println("결과 : " + str);

		// 대문자, 소문자 판별
		char k5 = 'G';
		str = "소문자";
		if (('A' <= k5) && (k5 <= 'Z')) {
			str = "대문자";
		}
		System.out.println("결과 : " + str);

		// 1 또는 3이면 남자, 아니면 여자
		int k6 = 1;
		str = "여자";
		if ((k6 == 1) || (k6 == 3)) {
			str = "남자";
		}
		System.out.println("결과 : " + str);

		// 근무시간이 8시간까지는 시간당 8590원이고, 8시간을 초과한 시간만큼은 1.5배를 지급한다.
		// 현재 근무한 시간이 10시간이다. 총 얼마를 받아야 하는가?
		int time = 10;
		int dan = 8590;
		int pay = time * dan;

		if (time > 8) {
			pay = (int) ((dan * 8) + (dan * 1.5 * (time - 8)));
		}
		System.out.println("결과 : " + pay + "원");

		// 두 수중 큰 값을 출력하시오.
		int k7 = 10;
		int k8 = 15;
		int result = k7;

		if (k7 < k8) {
			result = k8;
		}
		System.out.println("결과 : " + result);
	}
}
