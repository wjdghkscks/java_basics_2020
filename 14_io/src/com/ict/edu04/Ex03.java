package com.ict.edu04;

import java.io.File;
import java.io.FileReader;

// FileInputStream
//	- read()
//	- int(아스키코드) >> char 형변환, read(byte[] b)

// FileReader
//	- read()
//	- int(유니코드) >> char 형변환, read(char[] b)

public class Ex03 {
	public static void main(String[] args) {
		
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io06.txt";
		File file = new File(pathName);
		
		FileReader fr = null;
		
		try {
			
			fr = new FileReader(file);
			
			/*
			// 한 글자 읽기: 모든 글자를 읽어올 수 있음
			int k = fr.read();
			System.out.println(k + ": " + (char)(k));
			
			// 전체 읽기
			int k = 0;
			while ((k = fr.read()) != -1) {
				System.out.print((char)(k));
			}
			
			// char 배열
			char[] c = new char[(int)file.length()];
			fr.read(c);
			for (char k : c) {
				System.out.print(k);
			}
			*/
			
			// String
			char[] c = new char[(int)file.length()];
			fr.read(c);
			String msg = new String(c);
			System.out.println(msg);
			
		} catch (Exception e) {
		} finally {
			try {
				fr.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
