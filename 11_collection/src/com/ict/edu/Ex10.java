package com.ict.edu;

import java.util.LinkedList;

public class Ex10 {
	
	// [Queue 인터페이스]
	//	- FIFO (First-IN-First-OUT)
	//	- 구현 클래스 : LinkedList

	public static void main(String[] args) {
	
		LinkedList<String> list = new LinkedList<String>();
		
	// 추가, 삽입
	//	>> .add, .addFirst, .addLast, .offer, .offerFirst, .offerLast
		list.add("고길동");
		list.offer("도우너");
		list.addFirst("둘리");
		list.offerFirst("희동이");
		list.addLast("둘리");
		list.offerLast("희동이");
		
		System.out.println(list);
		
		System.out.println("1 ------------------------------------------");
		
	// 검색
	//	>> .
		if (list.contains("둘리")) {
			System.out.println(list);
			System.out.println(list.indexOf("둘리") + "번에 위치");
			System.out.println(list.lastIndexOf("둘리") + "번에 위치");
			System.out.println(list.getFirst());
			System.out.println(list.getLast());
			System.out.println(list.get(list.indexOf("둘리")));
		}
		
		System.out.println("2 ------------------------------------------");
		
	// 삭제
	//	>> .remove(Object), .remove(index), .removeFirst(), .removeLast()
		System.out.println(list);
		
		list.removeFirst();
		list.remove("둘리");
		list.remove(2);
		list.removeLast();
		
		System.out.println(list);

		System.out.println("3 ------------------------------------------");
		
	// 출력
		for (String k : list) {
			System.out.println(k);
		}
		
	}
}
