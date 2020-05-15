package com.ict.edu;

public class Ex02 {
	// String 클래스와 주요 메소드
	public static void main(String[] args) {
		
		String str = "ict인재개발원 2강의장";
		
		// 1. charAt(int index) : char
		//	- 위치 정보가 숫자로 들어오면, 해당 위치의 글자를 반환
		
		char c1 = str.charAt(7);	// 괄호안의 숫자는 위치 정보
		System.out.println(c1);		// 따라서 6번째 글자 '개' 반환
		
		// 모두 대문자로 만들기
		// 소문자 - 32 = 대문자
		String str2 = "대한민국 I love you 2020";	// 공백도 카운트
		for (int i = 0; i < str2.length(); i++) {
			char c2 = str2.charAt(i);
			if (c2 >= 'a' && c2 <= 'z') {
				c2 = (char)(c2 - 32);
				System.out.print(c2);
			} else {
				System.out.print(c2);
			}
		}
		System.out.println();
		
		System.out.println("==============================");
		
		// 2. concat(String str) : String
		//	- 들어온 문자열을 현재 문자열과 합침
		
		String str3 = "대한민국";
		String str4 = "KOREA";
		
		String res = str3.concat(str4);
		
		System.out.println(str3 + str4);
		System.out.println(res);
		
		System.out.println("==============================");
		
		// 3. equals(anObject) : boolean
		//	- 들어온 문자열과 현재 문자열이 같으면 true, 다르면 false
		//	- 대소문자를 구별함
		// 4. equalsIgnoreCase : 
		//	- 들어온 문자열과 현재 문자열이 같으면 true, 다르면 false
		//	- 대소문자를 구별하지 않음
		
		String str5 = "Korea";
		String str6 = "KOREA";
		
		if (str5.equals(str6)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		if (str5.equalsIgnoreCase(str6)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
		System.out.println("==============================");
		
		// 5. format(String format, Object... args) : static String
		//	- 형식을 지정하고, 형식에 맞춰 생성
		
		String str7 = "ICT 인재 개발원";
		String res2 = String.format("%s", str7);
		System.out.println(res2);
		
		// 남는 자리는 비워 둠
		res2 = String.format("%20s", str7);
		System.out.println(res2);
		
		// 모자란 자리는 상관하지 않음
		res2 = String.format("%6s", str7);
		System.out.println(res2);
				
		System.out.println("==============================");
		
		// 6. getBytes() : byte[]
		//	- 해당 문자열을 byte[] 배열로 변환
		//	- 보통 입/출력 할 때 사용 (영어 대/소문자만 가능)
		
		String str8 = "java";
		byte[] b = str8.getBytes();
		for (int i = 0; i < b.length; i++) {
			System.out.print(b[i]+" ");
		}
		System.out.println();
		
		// 반대로 해당 byte[]를 문자열로 만들기
		String str9 = new String(b);
		System.out.println(str9);
		
		System.out.println("==============================");
		
		// 7. indexOf(int ch), indexOf(String str) : int
		//	- char 나 String 이 들어오면
		// 	  해당 문자열에 char 나 String의 위치값을 알려줌
		//	  해당하는 문자나 문자열이 없는 경우 '-1'이 출력됨
		
			// 소문자 r 의 위치값 찾기
		String str10 = "BufferedReader";
		int k1 = str10.indexOf('r');
		System.out.println(k1);
		
			// String 찾기	>>> 문자열이 시작하는 위치값이 출력됨
		k1 = str10.indexOf("er");
		System.out.println(k1);
		
			// 해당하는 문자가 없는 경우
		k1 = str10.indexOf('K');
		System.out.println(k1);
		
		System.out.println("==============================");
		
		// 7. indexOf(int ch, int fromIndex)	 : int
		//	  indexOf(String str, int fromIndex) : int
		//	- int fromIndex 는 시작 위치를 말함
		//	- 2번째, 3번째 문자 혹은 문자열을 찾기 위함	
		
		// 위에서 'r'의 위치값은 5
		// 6부터 다시 'r'을 찾으면, 2번째 'r'을 찾을 수 있음
		k1 = str10.indexOf('r', str10.indexOf('r')+1);
		System.out.println(k1);
		
		k1 = str10.indexOf("er", str10.indexOf("er") + 1);
		System.out.println(k1);
		
		System.out.println("==============================");
		
		// 8. lastIndexOf(int ch), lastIndexOf(String str) : int
		//	- 마지막 문자 혹은 문자열을 찾을 때 사용
		
		k1 = str10.lastIndexOf('d');
		System.out.println(k1);
		
		k1 = str10.lastIndexOf("er");
		System.out.println(k1);
		
		System.out.println("==============================");
		
		// 9. length() : int
		//	- 해당 문자열의 길이를 구함	(길이는 1부터 시작)
		//	- for문에 많이 사용
		
		String str11 = "abcABC123가나다";
		k1 = str11.length();
		System.out.println(k1);
		
		System.out.println("==============================");
		
		// 10. replace(char oldChar, char newChar)					  : String
		//	   replace(CharSequence target, CharSequence replacement) : String
		//	- 새로운 문자 혹은 문자열을 받아서 치환
		
		String str12 = "대한민국";
		String str13 = str12.replace("대한민국", "KOREA");
		System.out.print(str12 + " >>> ");
		System.out.println(str13);
		
		str12 = str12.replace("한", "한 ♥ ");
		System.out.println(str12);
		
		// to be continued..
		
		
		
	}
}
