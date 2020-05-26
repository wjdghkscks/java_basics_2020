package com.ict.edu;

import java.io.File;
import java.io.IOException;

// 파일 생성하기
public class Ex02 {
	public static void main(String[] args) {

		System.out.println("0 ================");	// 파일 생성
		
		String pahtName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "test.txt";
		File file = new File(pahtName);

		try {
			boolean res = file.createNewFile();
			if (res) {
				System.out.println("파일 생성 성공");
			} else {
				System.out.println("파일 생성 실패");
			}
		} catch (IOException e) {
			System.out.println("파일 생성 실패");
			System.out.println("잘못된 경로입니다.");
		}

		System.out.println("1 ================");	// 디렉토리 생성

		String pahtName2 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "test";

		File file2 = new File(pahtName2);

		boolean res2 = file2.mkdir();

		if (res2) {
			System.out.println("디렉토리 생성 성공");
		} else {
			System.out.println("디렉토리 생성 실패");
		}

		System.out.println("2 ================");	// 파일 삭제

		String pahtName3 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "test.txt";
		File file3 = new File(pahtName3);

		boolean res3 = file3.delete();
		if (res3) {
			System.out.println("파일 삭제 성공");
		} else {
			System.out.println("파일 삭제 실패");
		}

		System.out.println("3 ================");	// 디렉토리 삭제

		String pahtName4 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "test";

		File file4 = new File(pahtName4);

		boolean res4 = file4.delete();

		if (res4) {
			System.out.println("디렉토리 삭제 성공");
		} else {
			System.out.println("디렉토리 삭제 실패");
		}

		System.out.println("4 ================");	// 끝
		
	}
}
