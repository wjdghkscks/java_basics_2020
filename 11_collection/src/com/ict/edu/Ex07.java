package com.ict.edu;

import java.util.HashSet;
import java.util.TreeSet;

public class Ex07 {
	public static void main(String[] args) {
		
	// 로또 번호 생성
	//	- 숫자 1 ~ 45
	//	- 랜덤으로 중복없이 6가지 숫자 오름차순으로 추출
		
		TreeSet<Integer> Lotto = new TreeSet<Integer>();	// TreeSet은 입력시 오름차순으로 자동 정렬
		
		for (int i = 0; i < 6; i++) {
			
			int k = (int)(Math.random() * 45) + 1;			// Math.random() 은 0.0 ~ 1.0 사이에서 임의로 추출
			
			// 중복시 노카운트 처리
			if (! Lotto.add(k)) {
				i--;
			}
			
		}
		
		// 출력하기
		System.out.println(Lotto);
		
	}
}
