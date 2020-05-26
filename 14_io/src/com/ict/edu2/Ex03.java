package com.ict.edu2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 1) 바이트 스트림
//	- 모든 처리를 1byte씩 처리
//	- 대상: 영문자 + 사진, 음악, 동영상 등 byte로 이루어진 모든 파일
//	- 최상위 클래스: InputStream(입력), OutputStream(출력)

//	FileInputStream 주요 메소드
//		- read(): 결과가 아스키코드(int) 숫자 하나로 출력되므로
//				  >>> char 형변환을 통해 문자로 변경하여 사용
//		- read(byte[] b): 결과가 아스키코드 숫자의 배열로 출력되며, 배열 크기를 저장해야 함
//						 >>> 1byte씩 배열에 저장하고, 읽는 수만큼 반환
//		- close(): open 한 스트림을 닫는 데 사용하며, 반드시 finally로 처리

public class Ex03 {
	public static void main(String[] args) {
		
		String pathName = "C:" +File.separator+ "study" +File.separator+ "util" +File.separator+ "io01.txt";
		File file = new File(pathName);
		
		FileInputStream fis = null;			// finally에서 close()를 사용하기 위해 null 입력
		
		try {
			
			fis = new FileInputStream(file);
			
	/*
	// 한 글자 읽어오기 : read()	>>> 숫자로 출력
	int k = fis.read();
	System.out.println(k + ":" + (char)(k));
	
	---------------------------------------------------------------------

	// 그림, 소리, 영상 등 파일을 읽는 방법
	int k2 = 0;
	while (true) {
		k2 = fis.read();
	// 읽어온 숫자가 -1이면 더이상 읽을 수 없음
		if (k2 == -1) break;
		System.out.print(k2 + ":" + (char)(k2) + " ");
		}
	
	---------------------------------------------------------------------
	
	// 한글자씩 계속 읽어오는 방법				>> 알파벳 이외의 문자는 읽을 수 없음
	int k2 = 0;
	while ((k2 = fis.read()) != -1) {
		System.out.print((char)k2);
	}
	*/
			/*
			// 한글자씩 읽어오는 방법 - 배열	>> 알파벳 이외의 문자는 읽을 수 없음
			byte[] b = new byte[(int)(file.length())];	// 배열 길이 >> (int)file.length
			fis.read(b);	// 한 글자씩 읽은 후 byte[] b에 넣어줌
			for (byte k : b) {
				System.out.print((char)(k));
			}
			*/
			
			// 한글자씩 읽어오는 방법 - String
			byte[] b = new byte[(int)(file.length())];
			fis.read(b);
			String str = new String(b);
			System.out.println(str);			// 알파벳 이외의 문자도 읽을 수 있음
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
				try {
					if(fis != null) fis.close();
				} catch (IOException e) {
				}
		}
		
		
	}
}
