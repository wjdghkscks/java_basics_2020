package com.ict.edu02;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;

// Buffer를 사용한 FileInputStream
public class Ex08 {
	public static void main(String[] args) {

		String pathName
			= "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io03.txt";
		File file = new File(pathName);
		
		FileInputStream fis = null;
		// 속도 향상을 위해 Buffer를 사용
		BufferedInputStream bis = null;
		
		try {
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);		// 스트림 체인 방식
			
			/*
			1) 한 글자씩 읽어오는 방법
			int m = bis.read();
			System.out.println(m + ": " + (char)(m));
			
			2) while 사용
			int m = 0;
			while((m = bis.read() != -1) {
				System.out.println((char)(m));
			}
			
			3) 배열 사용
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			for (byte k : b) {
				System.out.println((char)(k));
			}
			*/
			
// 			4) String 사용
			byte[] b = new byte[(int)(file.length())];
			bis.read(b);
			String str = new String(b);
			System.out.println(str);
			
		} catch (Exception e) {
		} finally {
			try {
				if(bis != null) bis.close();
				if(fis != null) fis.close();
			} catch (Exception e2) {
			} 
		}
	}
}
