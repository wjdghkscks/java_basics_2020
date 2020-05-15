package com.ict.edu;

public class Ex01 {
	
	// String 클래스와 주요 메소드
	
	public static void main(String[] args) {
		
		// String 객체를 생성하는 여러가지 방법
		
		String str1 = "abc";
		 
		char data[] = {'a', 'b', 'c'};
		String str2 = new String(data);
		
		byte[] data2 = {97, 98, 99};
		String str3 = new String(data2);
		
		String data3 = "ABC";
		String str4 = new String(data3);
		
		String str5 = new String("ABC");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		
		System.out.println("==================================================");
		
		// char, int, double 등 숫자를 저장하는 자료형은 
		// '같다'라는 표현을 '=='로 사용
		
		// 그러나 String(문자열)은 '==' 사용하면 안됨
		// String에서 사용 시, (데이터가 아닌) '주소가 같다'를 물어보는 것이기 때문
		// 따라서 String은 equals(), equalsIgnoreCase() 메소드를 사용
		// 결과는 boolean형으로 출력 (반환형)
		
		if (str1 == str2) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if (str4 == str5) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");	// 주소가 다르기 때문에 "다르다"가 출력
		}
		
		System.out.println("--------------------------------------------------");
		
		if (str1.equals(str2)) {			// .equals()는 대소문자를 구분
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		if (str3.equalsIgnoreCase(str4)) {	// .equalsIgnoreCase()는 대소문자 구분 X
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		
	}
	
	
}
