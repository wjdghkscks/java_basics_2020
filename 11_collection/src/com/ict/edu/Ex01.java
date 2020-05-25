package com.ict.edu;

public class Ex01 {
	
	// [제네릭과 컬렉션 (자료구조)]
	
	// 제네릭: 컬렉션이 어떤 객체로 구성되어 있는지를 표시하는 객체 타입
	// 컬렉션: 객체들을 모아서 관리하는 인터페이스
	
	// 형식: 컬렉션<제네릭>
	// Collection<E>가 최상위 컬렉션
	// Collection<E>를 상속받는 자식들: Set<E>, List<E>, Queue<E>
	// API
	//	- <T>: 객체 타입
	//	- <E>: 요소, 컬렉션 안에 존재하는 객체 하나
	//	- Map 형식: <K, V> Key(키값), Value(데이터값)
	//				key와 value는 1:1로 대응
	//				key를 호출 시 value가 출력
	
	// Collection의 주요 메소드
	
	// 1. add(E e) : boolean
	//	- 해당 컬렉션에 인자로 들어온 객체를 추가하며, 성공하면 true / 실패하면 false
	//	- 리턴값을 잘 받지 않음
	
	// 2. addAll(Collection<? extends E> c) : boolean
	//	- 특정 컬렉션의 모든 요소들을 다른 컬렉션에 추가
	
	// 3. clear() : void
	//	- 모든 요소 삭제
	
	// 4. contains(Object o) : boolean
	//	- 인자로 들어온 객체가 해당 컬렉션에 존재하면 true / 존재하지 않으면 false
	
	// 5. isEmpty() : boolean
	//	- 해당 컬렉션이 비어있으면 true, 비어있지 않으면 false
	
	// 6. iterator() : Iterator<E>
	//	- 컬렉션 안에 존재하는 객체들을 순서대로 접근하기 위한 Iterator 객체를 반환
	//	- 컬렉션 안에 존재하는 객체를 하나씩 꺼내서 작업할 때 사용
	
	// 7. remove(Object o) : boolean
	//	- 인자로 들어오는 객체를 삭제하며, 성공하면 true / 실패하면 false

	// 8. size() : int
	//	- 컬렉션 안에 존재하는 객체의 수를 출력
	//	- for문에서 사용
	
	// 9. toArray() : Object[]
	//	- 컬렉션을 배열로 만들 때 사용

}
