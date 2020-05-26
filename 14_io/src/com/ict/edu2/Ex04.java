package com.ict.edu2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

// 문서 파일 생성하기
public class Ex04 {
	public static void main(String[] args) {
		
		String pathName = "C:" +File.separator+ "study" +File.separator+ "util" +File.separator+ "io02.txt";
		File file = new File(pathName);			// File 객체 생성
		
		FileOutputStream fos = null;			// FileOutputStream 객체 선언
		try {
			
			fos = new FileOutputStream(file);	// fos 값 입력
			
			String str = "Phone: 010-1234-5678\n이름: 정환찬\n나이: 27세";
			
			byte[] b = str.getBytes();
			fos.write(b);
			
			fos.flush();						// write()가 끝나면 반드시 사용
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally {
			try {
				if(fos != null) fos.close();	// FileOutputStream을 닫는 데 사용
			} catch (IOException e) {
			}
		}
		
	}
}
