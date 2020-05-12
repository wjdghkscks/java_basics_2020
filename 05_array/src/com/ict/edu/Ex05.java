package com.ict.edu;

public class Ex05 {
	public static void main(String[] args) {
		
		// 성적 입력
		String[] name = {"홍", "김", "이", "박", "고"};
		int[] kor = {80, 90, 80, 70, 100};
		int[] eng = {80, 95, 85, 70, 100};
		int[] math = {100, 100, 100, 100, 100};
		
		// 초기값 설정
		int[] sum = new int[5];
		double[] avg = new double[5];
		String[] grade = new String[5];
		int[] rank = {1, 1, 1, 1, 1};
		
		// 총점, 평균, 학점 구하기
		
		for (int i = 0; i < sum.length; i++) {
			// 총점
			sum[i] = kor[i] + eng[i] + math[i];
			// 평균
			avg[i] = (int)((sum[i] / 3.0) * 10.0) /10.0;
			// 학점
			if (avg[i] >= 90) {
				grade[i] = "A학점";
			} else if (avg[i] >= 80) {
				grade[i] = "B학점";
			} else if (avg[i] >= 70) {
				grade[i] = "C학점";
			} else {
				grade[i] = "D학점";
			}
		}
				
		// 순위 구하기
		
		for (int i = 0; i < rank.length; i++) {
			for (int j = 0; j < rank.length; j++) {
				if (avg[i] < avg[j]) {
					rank[i]++;
				}
			}
		}		
		
		// 출력하기
		
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		System.out.println("-------------------------------------");
		for (int i = 0; i < rank.length; i++) {
			System.out.print(name[i] + "\t");
			System.out.print(sum[i] + "\t");
			System.out.print(avg[i] + "\t");
			System.out.print(grade[i] + "\t");
			System.out.println(rank[i]);
		}
		
	}
}
