package com.ict.edu4;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		
	// 오버로딩
	//	- 하나의 클래스 안에서 같은 이름의 메소드가 여러 개 존재하는 것
	//	- 인자의 자료형이나 갯수가 다르기 때문에 오류가 발생하지 않음
	//	- 메소드 사용자의 편의성(다양한 자료형 입력)을 위해 사용
	
	// 오버라이딩
	//	- 상속 관계에서 부모 메소드와 자식 메소드가 같은 것
	//	- 자식 클래스가 부모 메소드는 그대로 가져오지만,
	//	  메소드의 내용은 자식 클래스에 맞게 변경하여 사용함
	//	** 은닉화 (캡슐화) 	>> 부모 메소드의 내용은 숨겨짐
	//	** 다형성 			>> 같은 메소드를 호출하더라도 다른 내용을 실행
		
		Animal d = new Dog();
		Animal c = new Cat();
		
		System.out.println(d.eyes);
		System.out.println(d.legs);
		d.like();
		d.sound();
		
		System.out.println("-----------------------");
		
		System.out.println(c.eyes);
		System.out.println(c.legs);
		c.like();
		c.sound();
		
		System.out.println("-----------------------");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. 고양이 2. 강아지");
		System.out.print("선택하세요. ");
		int su = sc.nextInt();
		System.out.println("-----------------------");
		
		/*
		 if(su == 1) {
		 	Cat cat = new Cat();
		 	cat.sound();
		 	cat.like();
		 	cat.hobby();
		 } else if(su == 2) {
		 	Dog dog = new Dog();
		 	dog.sound();
		 	dog.like();
		 	dog.hobby();
		 }
		 */
		
		Animal a = null;
		if (su == 1) {
			a = new Cat();
		} else if (su == 2) {
			a = new Dog();
		}		
		a.sound();
		a.like();
		// a.hobby();		>>> 자식만 가지고 있는 메소드이기 때문에 사용 불가
		//						따라서 부모 클래스에 오버라이딩을 해야 함
		
		
	}	
}
