package com.ict.edu03;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;

// PrintStream
//	- 모든 자료형의 출력이 가능
//	- 보통 화면이나 파일 출력에 사용 (출력 전용)

public class Ex02 {
	public static void main(String[] args) {
		
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io05.txt";
		File file = new File(pathName);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		PrintStream ps = null;
		
		try {
			// 화면에 출력
			System.out.println(true);
			System.out.println(10);
			System.out.println(24.1);
			System.out.println('c');
			System.out.println("Hello");
			System.out.println("Hello");
			
			// 파일에 출력
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			ps = new PrintStream(bos);
			
			ps.println(true);
			ps.println(10);
			ps.println(24.1);
			ps.println('c');
			ps.println("Hello");
			ps.println("대한민국");
			
			ps.flush();
		} catch (Exception e) {
		} finally {
			try {
				ps.close();		// if(ps != null) 을 생략한 축약형
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
