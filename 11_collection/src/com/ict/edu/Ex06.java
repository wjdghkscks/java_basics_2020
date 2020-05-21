package com.ict.edu;

import java.util.HashSet;

public class Ex06 {
	public static void main(String[] args) {
		
	// .toArray(): 컬렉션을 배열로 변경
		
	// 배열을 컬렉션으로 변경
		
		String[] str = {"java", "JAVA", "Java", "자바"};
		
		HashSet<String> set1 = new HashSet<String>();
		HashSet<String> set2 = new HashSet<String>();
		HashSet<String> set3 = new HashSet<String>();
		
		// 배열의 길이만큼 반복 실행
		for (String k : str) {
			set1.add(k);
		}
		
		System.out.println(set1);
		
		System.out.println("============================================");
		
		set2.addAll(set1);			// 인자 set1의 데이터를 모두 set2에 입력
		
		
		set2.add("HTML");			// "HTML" 추가
		set2.add("CSS");			// "CSS" 추가
		System.out.println(set2);
		
		System.out.println("============================================");
		
		set2.remove("자바");		// .remove로 데이터 일부를 삭제
		
		set2.add("jsp");
		set2.add("android");
		set2.add("Python");
		
		System.out.println(set1);
		System.out.println(set2);
		
		System.out.println("============================================");
		
		// set2의 정보를 set1에 추가
		for (String k : set2) {
			
			if (! set1.add(k)) {	// 중복된 항목이라서 데이터가 추가되지 않은 경우
				set3.add(k);
			}
		}
		
		System.out.println(set1);
		System.out.println("--------------------------------------------");
		System.out.println(set3);
		
	}
}
