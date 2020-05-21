package com.ict.edu;

import java.util.Iterator;
import java.util.Stack;

public class Ex08 {
	public static void main(String[] args) {
		
	// [List 인터페이스]
	//	- 배열과 흡사한 구조를 가지며, 삽입/추가/삭제가 자유로움
	//	- 배열과 달리 크기를 미리 지정할 필요가 없음
	//	- 관련 클래스: Stack, ArrayList, Vector
	
	// [Stack]
	//	- LIFO(Last IN First OUT): 마지막에 들어온 데이터가 먼저 나감
	//	- .add, .push, .addElement		>>> 추가
	//	- .add(index, E)				>>> 삽입
	//	- .pop							>>> 맨 위에 존재하는 객체를 삭제하고, 그 객체를 반환
	//	- .peek							>>> 맨 위에 존재하는 객체를 반환
	//	- .search						>>> 거꾸로 검색 (오른쪽부터 1로 시작)
	//	- .indexOf						>>> 검색 (왼쪽부터 0으로 시작)
	//	- .elementAt()					>>> 검색 (왼쪽부터 0으로 시작)
	//	- .get(index)					>>> 추출 (왼쪽부터 0으로 시작)
	//	- .firstElement()				>>> 맨 처음 객체 추출
	//	- .lastElement()				>>> 마지막 객체 추출
	//	- .setElement(Element, index)	>>> 치환
		
		Stack<String> st = new Stack<String>();
		// 추가
		st.add("둘리");				// 자리값 0
		st.addElement("공실이");	// 자리값 1
		st.push("마이콜");			// 자리값 2
		System.out.println(st);
		
		System.out.println("======================================");
		
		// 삽입
		st.add(0, "고길동");
		st.add(3, "희동이");
		System.out.println(st);
		
		System.out.println("======================================");
		
		// 마지막 객체 보기 - peek
		System.out.println("반환: " + st.peek());
		System.out.println(st);
		
		System.out.println("======================================");
		
		// 마지막 객체 보기 - pop
		System.out.println("반환: " + st.pop());
		System.out.println(st);
		
		System.out.println("======================================");
		
		// 위치값
		if (st.contains("둘리")) {
			System.out.println("앞에서 " + (st.indexOf("둘리")+1) + "번째 위치");
			System.out.println("뒤에서 " + st.search("둘리") + "번째 위치");
			System.out.println("앞에서 3번째는 " + (st.get(3)+1));
			System.out.println("앞에서 3번째는 " + (st.elementAt(3)+1));
			System.out.println(st.firstElement());
			System.out.println(st.lastElement());
			System.out.println(st.size() + "개");
		} else {
			System.out.println("존재하지 않음");
		}
		
		System.out.println("======================================");
		
		// 치환
		st.setElementAt("도우너", 2);
		System.out.println(st);
		
		System.out.println("======================================");

		// 중복 가능
	
		st.add("둘리");
		st.add(3, "둘리");
		System.out.println(st);
		
		System.out.println("======================================");
		
		// 출력
		for (String k : st) {
			System.out.println(k);
		}
		
		System.out.println("======================================");
		
		Iterator<String> it = st.iterator();
		while (it.hasNext()) {
			String res = (String) it.next();
			System.out.println(res);
		}
		
		System.out.println("======================================");

		// 거꾸로 나오면서 삭제하기
		while (! st.isEmpty()) {
			System.out.println("'" + st.pop() + "' 삭제됨. " + st.size() + "개 남음");
		}
	}
}
