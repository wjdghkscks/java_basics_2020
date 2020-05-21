package com.ict.edu;

import java.util.HashSet;
import java.util.Iterator;

public class Ex03_main {
	public static void main(String[] args) {
		
	// private 변수값 입력 또는 변경 방법
		
		// 1) 기본 생성자 > setter()
		Ex03 p1 = new Ex03();
			p1.setName("둘리");
			p1.setAge(24);
			p1.setWeight(105.4);
		
		// 2) 인자가 있는 생성자에 값 입력
		Ex03 p2 = new Ex03("희동이", 3, 40.5);
		Ex03 p3 = new Ex03("마이콜", 17, 56.3);
		
		
	// 객체를 저장하는 방법
		
		// 1) 배열
		Ex03[] arr = new Ex03[3];
			arr[0] = p1;
			arr[1] = p2;
			arr[2] = p3;
			
			// 이름 꺼내기		>> for문 활용
			for (int i = 0; i < arr.length; i++) {
				System.out.print(arr[i].getName() + " ");
			}
			System.out.println();
			
			for (Ex03 k : arr) {
				System.out.print(k.getName() + " ");
			}
			System.out.println();
			
			System.out.println("============================================");
			
		// 2) 컬렉션
		HashSet<Ex03> set1 = new HashSet<Ex03>();				// 박싱
			set1.add(p1);
			set1.add(p2);
			set1.add(p3);
			set1.add(new Ex03("공실이", 21, 49.5));				// 자료를 제한없이 추가로 입력할 수 있음
			
			// 이름 꺼내기
			for (Ex03 k : set1) {
				System.out.print(k.getName() + " ");
			}
			System.out.println();
			
			Iterator<Ex03> it = set1.iterator();
			while (it.hasNext()) {
				Ex03 res = (Ex03) it.next();
				System.out.print(res.getName() + " ");
			}
			System.out.println();
			
			System.out.println("============================================");
			
		// .contains : 포함 여부 확인
			// 객체 p1이 있는지 확인
			if (set1.contains(p1)) {
				System.out.println("있다");
			} else {
				System.out.println("없다");
			}
			
			System.out.println("============================================");
			
			// 크기 구하기
			System.out.println("set1의 크기: " + set1.size());
			
			System.out.println("============================================");
			
			// 이름 "마이콜"이 있는지 확인	>>> 있으면 객체를 삭제, 없으면 유지
			for (Ex03 k : set1) {
				if (k.getName().contains("마이콜")) {			// String은 .equals로 같은지 여부를 확인 가능
					set1.remove(k);
					break;										// 컬렉션 set1의 내용이 변경되었으므로
				}												// 더이상 for 문을 실행하면 안됨	>>> break;
			}
			for (Ex03 k : set1) {
				System.out.print(k.getName() + " ");
			}
			System.out.println();
			
			System.out.println("============================================");
			
			// 크기 구하기
			System.out.println("set1의 '마이콜'이 있는 객체 삭제 후 크기: " + set1.size());
			
			System.out.println("============================================");
			
			// .clear() : 모두 삭제
			
			set1.clear();
			System.out.println("set1 객체 모두 삭제 후 크기: " + set1.size());
			
			System.out.println("============================================");
			
			// .isEmpty() : 비어있는지 확인
			boolean result = set1.isEmpty();
			if (result) {
				System.out.println("비어있습니다.");
			} else {
				System.out.println("비어있지 않습니다.");
			}
			
	}
}
