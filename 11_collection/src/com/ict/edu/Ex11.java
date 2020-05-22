package com.ict.edu;

import java.util.HashMap;
import java.util.Iterator;

// [Map 인터페이스]
//	- key와 Value를 매핑하는 구조로 이루어진 객체
//	- key는 중복될 수 없음
//	- key를 호출하면 value가 출력됨
//	- .keySet() 	>>> Key를 별도로 관리
//	- add() 로 추가 불가
//	- put(key, value)를 추가

public class Ex11 {
	public static void main(String[] args) {
		
	// map 생성			>>> (key를 숫자로 만들면 접근이 용이함)
		HashMap<Integer, String> map1 = new HashMap<Integer, String>();
		
		// 추가			>>> .put(k, v)
		map1.put(0, "한국");
		map1.put(1, "미국");
		map1.put(2, "중국");
		map1.put(3, "태국");
		map1.put(4, "영국");		// value의 중복은 상관없음
		map1.put(5, "한국");
		map1.put(6, "한국");
		map1.put(3, "영국");		// key 중복 → 덮어쓰기
		
		System.out.println(map1);
		
		System.out.println("1 ==============================");
		
		// 하나씩 출력	>>> .get(key)
		System.out.println(map1.get(4));
		
		System.out.println("2 ==============================");
		
			// key값을 순서대로 입력			>>> for문 사용 가능
			// map에서 value를 호출하는 방법	>>> .get(key)
		for (int i = 0; i < map1.size(); i++) {		// 조건식 범주: 이름.size()
			System.out.println(map1.get(i));		// key값에 규칙이 없으면 출력이 힘듦
		}											// 따라서 map에서 사용 X
		
		System.out.println("3 ==============================");
			// key값에 규칙이 없더라도 개선된 for문은 사용 가능
		for (Integer k : map1.keySet()) {			// .keySet()으로 관리
			System.out.println(map1.get(k));
		}
		
		System.out.println("4 ==============================");

	// key를 String으로 만들어 Map을 생성
		HashMap<String, String> map2 = new HashMap<String, String>();
		
		map2.put("이름", "고길동");
		map2.put("나이", "34");
		map2.put("주소", "서울시 도봉구 방학동");
		map2.put("성별", "남");
		map2.put("취미", "잠자기");
		
		System.out.println(map2.get("이름"));
		System.out.println(map2.get("나이"));
		System.out.println(map2.get("주소"));
		System.out.println(map2.get("성별"));
		System.out.println(map2.get("취미"));
		
		System.out.println("5 ==============================");
		
		// foreach를 활용한 출력
		for (String k : map2.keySet()) {
			System.out.println(map2.get(k));
		}
		
		System.out.println("6 ==============================");

		// Iterator를 활용한 출력
		Iterator<String> it = map2.keySet().iterator();		// 이름.keySet().iterator();
		while (it.hasNext()) {
			String res = (String) it.next();
			System.out.println(map2.get(res));
		}
		
	}
}
