package com.ict.edu;

import java.util.HashSet;
import java.util.Scanner;

public class Ex04_main {
	public static void main(String[] args) {
	
	// 컬렉션을 이용하여
	// 3명의 이름, 국어, 영어, 수학 점수 입력받기
	// 총점, 평균, 학점, 순위 구하기 (void)
	// 출력하기
	
		Scanner sc = new Scanner(System.in);
		
		HashSet<Ex04> person = new HashSet<Ex04>();
		
		// 값 입력받기
		while (true) {			// 갯수 제한 없이 넣을 수 있으므로
								// while문을 사용
			Ex04 p = new Ex04();
			
			System.out.print("이름: ");
			String name = sc.next();
			System.out.print("국어 점수: ");
			int kor = sc.nextInt();
			System.out.print("영어 점수: ");
			int eng = sc.nextInt();
			System.out.print("수학 점수: ");
			int math = sc.nextInt();
			
			p.setName(name);
			p.s_sum(kor, eng, math);
			
			person.add(p);
			
			System.out.print("계속할까요? Y/N ");
			String str = sc.next();
			if (str.equalsIgnoreCase("N")) break;		// 잘못 입력한 경우까지 고려해서 수정
			
		}
		
		// 순위 구하기
		for (Ex04 k : person) {
			for (Ex04 j : person) {
				if (k.getSum() < j.getSum()) {
					k.setRank(k.getRank() + 1);
				}
			}
		}
		
		// 정렬까지 하려면 .toArray() 를 사용하여 배열로 바꿔서 처리
		
		// 출력
		System.out.println("-------------------------------------");
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		System.out.println("-------------------------------------");
		for (Ex04 k : person) {
			System.out.print(k.getName() + "\t");
			System.out.print(k.getSum() + "\t");
			System.out.print(k.getAvg() + "\t");
			System.out.print(k.getHak() + "\t");
			System.out.println(k.getRank());
		}
		
	}
}
