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
		
		System.out.println(str3 + str4);		// 메모리를 더 많이 차지
		System.out.println(res);
		
		System.out.println("==============================");
		
		// 3. equals(anObject) : boolean
		//	- 들어온 문자열과 현재 문자열이 같으면 true, 다르면 false
		//	- 대소문자를 구별함
		
		// 4. equalsIgnoreCase : boolean
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
		//	- 해당 문자열을 byte[]로 변환
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
		
			// 해당하는 문자가 없는 경우	>>> -1이 출력됨
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
		
		System.out.println("==============================");
		
		// 11. contains(String s) : boolean 
		//	- 인자로 들어온 문자열이 해당 문자열에 존재하는 지를 boolean으로 판단
		//	- 대소문자를 구별함
		//	- 인자에 char 를 넣으면 오류가 발생
		
		String str14 = "KOREA @ 대한민국";
		boolean b1 = str14.contains("@");
		System.out.println(b1);
		
		b1 = str14.contains("$");
		System.out.println(b1);
		
		b1 = str14.contains("kor");
		System.out.println(b1);

		b1 = str14.contains("KOR");
		System.out.println(b1);
		
		System.out.println("==============================");
		
		// 12. toCharArray() : char[]
		//	- 해당 문자열을 char[]로 만듦
		//	- 모든 문자 사용 가능 (getBytes[]는 영어와 숫자만 가능)
		String message2 = "java 자바 JAVA 大한";
		System.out.println(message2);
		
		System.out.println("------------------------------");
		
		byte[] m7 = message2.getBytes();
		for (byte k : m7) {
			System.out.println(k);
		}
		
		System.out.println("------------------------------");
		
		char[] m8 = message2.toCharArray();
		for (char k : m8) {
			System.out.println(k);
		}
		
		
		
		System.out.println("==============================");
		
		// 13. isEmpty() : boolean
		//	- (isㅁㅁㅁ 는 보통 boolean값에 많이 사용)
		//	- 해당 문자열이 없으면 true, 내용이 있으면 false
		
		String str15 = "";
		b1 = str15.isEmpty();
		System.out.println(b1);
		
		str15 = "대한민국";
		b1 = str15.isEmpty();
		System.out.println(b1);
		
		System.out.println("==============================");
		
		// 14. split(String regex) : String[]
		//	- String regex 는 구분자(나누는 기준)를 의미

		String str16 = "사과,딸기,망고 오렌지,파인애플,두리안";
		String[] arr1 = str16.split(",");
		for (String k : arr1) {
			System.out.println(k);
		}

		System.out.println("------------------------------");
		
		String[] arr2 = str16.split(" ");
		for (String k : arr2) {
			System.out.println(k);
		}
		
		System.out.println("------------------------------");
		
		// 14. split(String regex, int limit) : String[]
		//	- int limit 는 나눌 배열의 크기를 의미
		
		String[] arr3 = str16.split(",", 3);
		for (String k : arr3) {
			System.out.println(k);
		}
		
		System.out.println("------------------------------");
		
		String[] arr4 = str16.split(",", 7);	// 인자의 개수 이상의 숫자를 입력하면
		for (String k : arr4) {					// 인자의 개수만큼만 생성됨
			System.out.println(k);
		}
		
		System.out.println("==============================");
		
		// 15. substring(int beginIndex) : String
		//	- 시작 위치부터 끝까지 문자열 추출
		//	- charAt은 원하는 문자만 추출 가능
		//	- substring은 원하는 문자열을 추출하는 것이 가능
		
		String str17 = "010-7777-9999";
		String msg = str17.substring(4);
		System.out.println(msg);

		// 15. substring(int beginIndex, int endIndex) : String
		//	- 시작 위치부터 끝 위치 전까지 문자열 추출 (endIndex 미포함)

		msg = str17.substring(0, 3);
		System.out.println(msg);
		
		msg = str17.substring(4, 8);
		System.out.println(msg);
		
		String str18 = "920929-1";
		msg = str18.substring(7, 8);
		System.out.println(msg);
		
		msg = str18.substring(str18.indexOf("-") + 1, str18.indexOf("-") + 2);
		System.out.println(msg);
				
		System.out.println("==============================");
		
		// Quiz
		// 010-7777-9999	>>>		010-7777-XXXX 변경

		// 16. toLowerCase() : String
		//	- 모든 대문자를 소문자로 변경함
		// 16. toUpperCase() : String
		//	- 모든 소문자를 대문자로 변경함
		
		String str19 = "cOVId 19 ";
		msg = str19.toLowerCase();
		System.out.println(msg);		
		
		msg = str19.toUpperCase();
		System.out.println(msg);
		
		// 첫글자만 대문자로 바꾸기
		msg = str19.substring(0, 1).toUpperCase() + str19.substring(1).toLowerCase();
		System.out.println(msg);
		
		System.out.println("==============================");
		
		// 17. toString() : String
		//	- object 의 toString() : 모든 객체에 사용 가능
		//						    객체가 가지고 있는 정보나 값들을 문자열로 반환하는 메소드
		//							오버라이딩에 사용
		//	- String 의 toString() : 문자열 자체를 반환
		
		String str20 = "java 8 자바 8";
		msg = str20.toString();
		System.out.println(msg);
		System.out.println(str20);
		System.out.println(str20.toString());
		
		System.out.println("==============================");
		
		// 18. trim() : String
		//	- 해당 문자열의 앞/뒤의 공백을 제거 (중간 공백은 제거 X)
		String str21 = "    java    자바    JAVA   ";
		msg = str21.trim();
		System.out.println(str21.length());
		System.out.println(msg.length());
		
		System.out.println("==============================");
		
		// 19. valueOf(자료형) : static String
		//	- 어떤 자료형이든 String으로 변경시킴
		
		boolean bo1 = true;
		char ch1 = 'A';
		int num1 = 34;
		long num2 = 58L;
		float num3 = 3.14f;
		double num4 = 342.12;
		
		System.out.println(bo1);
		System.out.println(ch1);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		System.out.println(num4);
		
		System.out.println("------------------------------");
		
		// 자료형 연산
		// boolean형은 +1 불가능		
		// System.out.println(bo1 + 1);
		System.out.println(ch1 + 1);
		System.out.println(num1 + 1);
		System.out.println(num2 + 1);
		System.out.println(num3 + 1);
		System.out.println(num4 + 1);
		
		System.out.println("------------------------------");
		
		// 모든 자료형을 string으로 바꾸는 메소드
		System.out.println(String.valueOf(bo1)+1);
		System.out.println(String.valueOf(ch1)+1);
		System.out.println(String.valueOf(num1)+1);
		System.out.println(String.valueOf(num2)+1);
		System.out.println(String.valueOf(num3)+1);
		System.out.println(String.valueOf(num4)+1);
		
		System.out.println("------------------------------");
		
		// String 변형을 위한 편법
		System.out.println(bo1 + "");
		System.out.println(ch1 + "");
		System.out.println(num1 + "");
		System.out.println(num2 + "");
		System.out.println(num3 + "");
		System.out.println(num4 + "");
		
		System.out.println("==============================");
		
		// 20. Wrapper class
		//	- 각종 자료형의 형태를 가진 문자열을 진짜 자료형으로 변경하는 방법
		//	  (낮은 버전에서는 기본 자료형을 객체로 만들 때 사용했었음)
		
		// 문자열을 boolean형으로 변경 : Boolean.parseBoolean();
			// "true", "false"만 사용 가능
			
			String message = "true";
			boolean m1 = Boolean.parseBoolean(message);
			if (m1) {
				System.out.println("변경 성공");
			} else {
				System.out.println("변경 실패");
			}
			
			System.out.println("------------------------------");
			
		// 문자열을 int형으로 변경: Integer.parseInt();
			message = "241";
			int m2 = Integer.parseInt(message);
			System.out.println(message + 10);
			System.out.println(m2 + 10);
			
			System.out.println("------------------------------");
			
		// 문자열을 long형으로 변경: long.parseLong();
		//	- message = "241L";		>>> String에 L 포함 시 오류 발생
			message = "241";
			Long m3 = Long.parseLong(message);
			System.out.println(m3);
			System.out.println(message + 10);
			System.out.println(m3 + 10);
			
			System.out.println("------------------------------");
			
		// 문자열을 float형으로 변경: Float.parseFloat();
		//	- String에 f 포함 시 오류 발생
			message = "3.14f";
			float m4 = Float.parseFloat(message);
			System.out.println(m4);
			System.out.println(message + 10);
			System.out.println(m4 + 10);
		
			System.out.println("------------------------------");
			
		// 문자열을 double형으로 변경: Double.parseDouble();
			message = "3.14";
			Double m5 = Double.parseDouble(message);
			System.out.println(m5);
			System.out.println(message + 10);
			System.out.println(m5 + 10);
			
			System.out.println("------------------------------");
			
		// 문자열을 char형으로 변경하는 방법은 따로 없음
		//	>>> String.charAt(0) 을 사용
			message = "A";
			char m6 = message.charAt(0);
			System.out.println(m6);
			System.out.println(message + 10);
			System.out.println((char)(m6 + 10));
			
			
			
		
	}
}
