package com.ict.edu;

import java.util.ArrayList;
import java.util.Vector;

public class Ex09 {
	// [List 인터페이스]
	//	- 배열과 흡사한 구조를 가지며, 삽입/추가/삭제가 자유로움
	//	- 배열과 달리 크기를 미리 지정할 필요가 없음
	//	- 관련 클래스: Stack, ArrayList, Vector
	
	// [ArrayList & Vector]
	// - ArrayList: 멀티스레드 동기화를 지원하지 않음
	// - Vector: 멀티스레드 동기화를 지원함
	// - ArrayList와 Vector의 사용법은 같음
	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList<String>();
		
		// 추가, 삽입: add
		list.add("박찬호");
		list.add("손흥민");
		list.add("류현진");
		System.out.println(list);
		
		System.out.println("======================================");
		
		list.add(1, "기성용");
		System.out.println(list);
		
		System.out.println("======================================");

		Vector<String> vector = new Vector<String>();
		vector.add("기성용");
		vector.add("류현진");
		vector.add("손흥민");
		System.out.println(vector);
		
		vector.add(2, "박찬호");
		System.out.println(vector);

		System.out.println("======================================");
		
		// 검색
		//	>>> .search, .elementAt, .firstElement(), .lastElement 	>>> 없음
		//	>>> .elementAt, .firstElement(), .lastElement 			>>> vector에는 있음
		if (list.contains("박찬호")) {
			
			System.out.println(list.indexOf("박찬호") + "번에 위치");
			
			System.out.println("-------------------------");
			
			System.out.println("2번위치: " + list.get(2));
			
			System.out.println("-------------------------");

			System.out.println(list.lastIndexOf("박찬호"));
			
			System.out.println("-------------------------");

			list.set(0, "박세리");		// System.out.println(); 하면 치환 이전 문자가 같이 출력됨 
			
		} else {
			
			System.out.println("존재하지 않음");
			
		}
		
		System.out.println(list);
		
	
	}
}
