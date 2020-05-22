package com.ict.edu;

import java.util.ArrayList;
import java.util.Iterator;
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
		
		System.out.println("1 ======================================");
		
		list.add(1, "기성용");
		System.out.println(list);
		
		System.out.println("2 ======================================");

		Vector<String> vector = new Vector<String>();
		vector.add("기성용");
		vector.add("류현진");
		vector.add("손흥민");
		System.out.println(vector);
		
		vector.add(2, "박찬호");
		System.out.println(vector);

		System.out.println("3 ======================================");
		
		// 검색	>>> indexOf
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
		
		System.out.println("4 ======================================");
		
		if (vector.contains("기성용")) {
			System.out.println(vector);
			System.out.println(vector.indexOf("기성용") + " >>> 기성용 위치 ");
			System.out.println(vector.get(2));
			System.out.println(vector.lastIndexOf("기성용") + "번째 위치");
			System.out.println(vector.elementAt(1));
			System.out.println(vector.firstElement());
			System.out.println(vector.lastElement());
		}
		
		System.out.println("5 ======================================");
		
		// 치환
		System.out.println(vector);
		vector.set(1, "차두리");
		vector.setElementAt("박세리", 2);
		System.out.println(vector);
		
		System.out.println("6 ======================================");

		// 크기
		System.out.println(list.size());
		System.out.println(vector.size());
		
		System.out.println("6 ======================================");

		// 출력
		for (String k : list) {
			System.out.println(k);
		}
		
		System.out.println("7 ======================================");

		Iterator<String> it = vector.iterator();
		while (it.hasNext()) {
			String res = (String) it.next();
			System.out.println(res);
		}
		
	}
}
