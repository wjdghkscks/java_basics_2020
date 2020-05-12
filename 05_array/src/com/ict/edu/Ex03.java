package com.ict.edu;

import java.util.Arrays;
import java.util.Comparator;

public class Ex03 {
	public static void main(String[] args) {
		
	// 배열 정렬하기
		
		int[] su1 = {3, 4, 9, 5, 6, 1, 7, 2, 10, 8};
		
		int tmp = 0;	// 자리 바꾸기를 위한 변수
		
		for (int i = 0; i < su1.length - 1; i++) {
			for (int j = i + 1; j < su1.length; j++) {
				
				// 오름차순: su[i] > su[j]
				// 내림차순: su[i] < su[j]
				
				if (su1[i] > su1[j]) {		// 자리 바꾸기
					tmp = su1[i];			// tmp = su[j];
					su1[i] = su1[j];		// su[j] = su[i];
					su1[j] = tmp;			// su[i] = tmp;
				}
			}
		}
		
	//출력하기
		
		for (int k : su1) {
			System.out.print(k + " ");
		}
		
		
		System.out.println("\n=================================");
		
		
		int[] su2 = {3, 4, 9, 5, 6, 1, 7, 2, 10, 8};
		
		// Arrays 클래스는 배열 복사, 정렬, List로 변환하는 클래스
		// sort() 메스드로 오름차순만 가능함
		Arrays.sort(su2);
		// 출력하기
		for (int k : su2) {
			System.out.print(k + " ");
		}
	}
}
