package com.ict.edu02;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 1) 바이트 스트림
//	- 모든 처리를 1byte씩 처리
//	- 대상: 영문자 + 사진, 음악, 동영상 등 byte로 이루어진 모든 파일
//	- 최상위 클래스: InputStream(입력), OutputStream(출력)

// 	FileOutputStream 주요 메소드 (바이트스트림 출력)
//		- write(int b):	'int b'에 아스키 코드 하나를 입력하여 문자 하나를 쓸 수 있음
//						'int b' 대신에 char 하나 사용 가능
//					>>> 영문자 대/소문자, 숫자, 일부 특수문자 쓰기 가능
//					>>>	영어 이외의 문자는 불가능
//		- write(byte[] b): byte 배열을 사용
//		- flush(): write() 뒤에 반드시 사용
//		- close(): open 한 스트림을 닫는 데 사용하며, 반드시 finally에서 처리

public class Ex02 {
	public static void main(String[] args) {
		
		String pathName = "C:" +File.separator+ "study" +File.separator+ "util" +File.separator+ "io01.txt";
		File file = new File(pathName);
		
		FileOutputStream fos = null;
		try {
			// 해당 파일이 없으면 생성되며, 기존 파일이 있다면 덮어쓰기를 진행
			fos = new FileOutputStream(file);
			
			// fos = new FileOutputStream(file, true);		// true를 붙이면 이어쓰기
			fos.write(65);
			fos.write(111);									// 오류 발생 >> 2번째 Add catch clause to surrounding try 선택
			fos.write(65);
			fos.write(13);
			
			// 숫자 대신에 char 사용
			fos.write('j');
			fos.write('a');
			fos.write('v');
			fos.write('a');
			
			// 줄변경	>> 13, 10
			fos.write(13);
			
			// byte 배열을 이용하여 여러 글자를 한 번에 입력하기
			byte[] b = {'b', 'o', 'y', 's', 13, 10, 'g', 'i', 'r', 'l', 's', 13, 10};
			fos.write(b);
			
			// String을 이용하여 여러 글자를 한 번에 입력하기
			String str = "Hello\n안녕\n123\n大韓\nWorld";
			byte[] b2 = str.getBytes();		// .getBytes()를 활용하여 String을 byte[]로 변환
			fos.write(b2);					// 영어가 아닌 문자도 사용 가능
			
			fos.flush();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {	// Add catch clause to surrounding try 를 통해 자동 생성
			e.printStackTrace();
		} finally {
			try {
				if(fos != null) fos.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
