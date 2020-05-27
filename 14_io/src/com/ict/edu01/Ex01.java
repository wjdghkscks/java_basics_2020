package com.ict.edu01;

import java.io.File;

// [File 클래스]
//	- 특정 위치에 존재하는 파일이나 디렉토리(폴더)를 처리하는 클래스

// 주요 생성자 >>> File(String 경로), File(String 상위경로, 하위경로), File(File 상위경로, String 하위경로)
//				   기본 생성자가 존재하지 않음

// 주요 메소드
//	- createNewFile() : 파일을 생성하면 true, 아니면 false
//	- mkdir(), mkdirs() : 디렉토리 생성
//	- delete() : 파일/디렉토리 삭제
//	- isDirectory() : 디렉토리이면 true, 아니면 false
//	- isFile() : 파일이면 true, 아니면 false
//	- list() : 특정 위치의 파일/디렉토리들을 String[]에 담아 놓는 것
//	- length() : 파일의 크기를 byte로 표시
//	- getAbsolutePath() : 절대 경로 표시
//	- getCanonicalPath() : 정규화 경로 표시
//	- getPath() : 상대 경로 표시

public class Ex01 {
	public static void main(String[] args) {
		
		// String pathName = "C:\\study\\util";			>> 운영 체제가 Windows
		// String pathName = "C:/study/util";			>> 운영 체제가 Linux, Unix
		// 운영체제와 상관없이 주소를 작성하는 방법		>> File.separator
		
		String pahtName = "C:" +File.separator+ "study" +File.separator+ "javastudy";
		
		File file = new File(pahtName);		// File 객체 생성
		String[] arr = file.list();
		
		// 파일 목록 불러오기
		for (String k : arr) {
			// System.out.println(k);
			File file2 = new File(pahtName, k);
			// System.out.println(file2);
			
			if (file2.isDirectory()) {
				System.out.println("디렉토리: " + file2 + " 크기가 존재하지않음");
			} else {
				System.out.println("파일: " + file2 + ", 크기: " + file2.length() + "byte");
			}
		}
		
	}
}
