package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex02 {
	public static void main(String[] args) {
		
		// [Set]
		// Set 인터페이스를 구현한 클래스 >>> HashSet, TreeSet;
		//	- 특징: 중복 및 정렬 불가
		//	- TreeSet은 항상 오름차순으로 자동 정렬
		
		// 컬렉션 생성: HashSet<제네릭 = 객체 타입 = 클래스> 참조 변수 = new HashSet<제네릭>();		>> 기본 생성자
		// 컬렉션 생성: TreeSet<제네릭 = 객체 타입 = 클래스> 참조 변수 = new TreeSet<제네릭>();		>> 기본 생성자
		
			HashSet<Integer> h1 = new HashSet<Integer>(); 						// HashSet은 import 필요
			HashSet<Double> h2 = new HashSet<Double>();					
			HashSet<Boolean> h3 = new HashSet<Boolean>();
			
			TreeSet<Character> h4 = new TreeSet<Character>();					// TreeSet은 import 필요
			TreeSet<String> h5 = new TreeSet<String>();
		
		// 해당 컬렉션에 객체 넣기	>>> 일반 객체로 만든 후 데이터를 넣어야 함 
			// 1) 박싱: 객체로 만들기
				Integer k1 = new Integer(10);
				Integer k2 = new Integer("20");
			
			// 2) 컬렉션에 넣기 (add)
				h1.add(k1);
				h1.add(k2);
				
				// 객체로 선언하지 않고 바로 데이터를 입력
				h1.add(new Integer(30));
				h1.add(new Integer("40"));
				
				// 오토박싱: 데이터를 자동으로 객체화하여 입력
				h1.add(50);
				h1.add(60);
				
			// Double형 넣기
				Double d1 = new Double(10);
				Double d2 = new Double("20");
				
				h2.add(d1);			
				h2.add(d2);
				// h2.add(10);							>> 오토박싱은 자료형이 일치하지 않으면 데이터를 넣을 수 없음
				h2.add(10.0);
				
			// Boolean형 넣기
				h3.add(true);
				h3.add(false);
				h3.add(true);							// 오류는 발생하지 않지만, 데이터가 중복이므로 들어가지 않음
														// 먼저 들어간 데이터가 뒤로 이동
			// Char형 넣기
				h4.add('j');							// 입력 단계에서 데이터 자동 정렬
				h4.add('a');
				h4.add('v');		
				h4.add('a');							// 오류는 발생하지 않지만, 데이터가 중복이므로 들어가지 않음
				
			// String형 넣기
				h5.add("java");							// 입력 단계에서 데이터 자동 정렬
				h5.add("html");
				h5.add("jsp");
				h5.add("css");
				h5.add("db");
				
			// 출력하기
			System.out.println("전체 내용 보기\n");
				
				System.out.println(h1);					// HashSet 으로 생성 >>> 정렬 X
				System.out.println(h2);
				System.out.println(h3);
				System.out.println(h4);					// TreeSet 으로 생성 >>> 컬렉션에 넣는 단계에서 정렬
				System.out.println(h5);
				
				System.out.println("=================================");
				
			// 언박싱: 일반적으로 사용하는 자료형으로 객체를 변환
			System.out.println("'개선된 for문'으로 h1 하나씩 꺼내기\n");		// 	1) 개선된 for문
				
				for (int k : h1) {
					System.out.print(k + " ");
				}
				System.out.println();
				
				System.out.println("=================================");
				
			System.out.println("'iterator'로 h2 하나씩 보기\n");				// 2) iterator
				
				Iterator<Double> it = h2.iterator();							// Iterator는 import 필요
				
				while (it.hasNext()) {											// .hasNext() : 다음 객체가 존재하면 true
					double res = (double) it.next();							// .next(): 다음 객체를 꺼내기 위해서 이동하고 반환함
					System.out.print(res + " ");
				}
				System.out.println();
				
				System.out.println("=================================");
				
			// h4 와 h5 출력
				
				for (char k : h4) {
					System.out.print(k + " ");
				}
				System.out.println();
				
				Iterator<Character> it2 = h4.iterator();
				while (it2.hasNext()) {
					Character res = (Character) it2.next();
					System.out.print(res + " ");
				}
				System.out.println();
				
				System.out.println("=================================");
				
				for (String k : h5) {
					System.out.print(k + " ");
				}
				System.out.println();
				
				Iterator<String> it3 = h5.iterator();
				while (it3.hasNext()) {
					String res = (String) it3.next();
					System.out.print(res + " ");
				}
				System.out.println();
	}
}
