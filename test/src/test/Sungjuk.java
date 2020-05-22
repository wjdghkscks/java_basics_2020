package test;

import java.util.Scanner;

public class Sungjuk {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Person[] arr = new Person[5];
		
		// 정보 입력 받기
		for (int i = 0; i < arr.length; i++) {
			
			Person student = new Person();
			
			System.out.print("이름 : ");
			student.setName(sc.next());
			System.out.print("국어 성적: ");
			int kor = sc.nextInt();
			System.out.print("영어 성적: ");
			int eng = sc.nextInt();
			System.out.print("수학 성적: ");
			int math = sc.nextInt();
			
			int sum = student.s_sum(kor, eng, math);
			student.setSum(sum);
			
			double avg = student.s_avg();
			student.setAvg(avg);
			
			String hak = student.s_hak();
			student.setHak(hak);
			
			arr[i] = student;
			
			System.out.println("----------------");
			
		}
		
		// 순위 구하기
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (arr[i].getSum() < arr[j].getSum()) {
					arr[i].setRank(arr[i].getRank() + 1);
				}
			}
		}
		
		// 정렬하기
		Person tmp = new Person(); 
		
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i+1; j < arr.length; j++) {
				if (arr[i].getRank() > arr[j].getRank()) {
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}
			}
		}
		
		// 출력하기
		System.out.println("이 름\t총 점\t평 균\t학 점\t순 위");
		System.out.println("========================================");
		
		for (int i = 0; i < arr.length; i++) {
			
			System.out.print(arr[i].getName() + "\t");
			System.out.print(arr[i].getSum() + "\t");
			System.out.print(arr[i].getAvg() + "\t");
			System.out.print(arr[i].getHak() + "\t");
			System.out.print(arr[i].getRank() + "\t");
			System.out.println();
			
			}
	}
}
