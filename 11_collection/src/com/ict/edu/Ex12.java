package com.ict.edu;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Set;

public class Ex12 {
	public static void main(String[] args) {
		
		// 대한민국, 캐나다, 영국, 스위스의 수도를 각각 HashMap에 저장
		// key = 나라 / value = 수도
		// 나라(key)를 입력받으면 수도(value)를 출력하는 프로그램
		
		HashMap<String, String> map = new HashMap<String, String>();
		
		map.put("대한민국", "서울");
		map.put("한국", "서울");
		map.put("korea", "서울");
		map.put("캐나다", "오타와");
		map.put("영국", "런던");
		map.put("스위스", "베른");
		
		Set<String> set = map.keySet();		// .keySet()의 반환형은 Set<String>
		// System.out.println(set);
		Scanner sc = new Scanner(System.in);
		
		esc: while (true) {
			
			System.out.print("국가명을 입력하세요 >> ");
			String str = sc.next();
			str = str.toLowerCase();		// 대/소문자 구별을 없애기 위해 추가
											// 한글에는 영향이 없음
			if (set.contains(str)) {
				
				String res = map.get(str);
				System.out.println(str + "의 수도는 " + res + "입니다.");
				
			} else {
				System.out.println("데이터가 존재하지 않습니다.");
			}
			
			while (true) {
				System.out.print("계속할까요? (Y/N) ");
				String msg = sc.next();
				if (msg.equalsIgnoreCase("y")) {
					continue esc;
				} else if (msg.equalsIgnoreCase("n")) {
					break esc;
				} else {
					System.out.println("\n잘못입력하셨습니다.\n");
					continue;
				}
			}
			
		}
		
		
	}
}
