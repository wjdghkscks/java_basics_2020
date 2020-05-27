package com.ict.edu02;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

// 문서 파일 읽어오기
public class Ex05 {
	public static void main(String[] args) {
		
		String pathName = "C:" +File.separator+ "study" +File.separator+ "util" +File.separator+ "io02.txt";
		File file = new File(pathName);
		
		FileInputStream fis = null;
		
		try {
			
			fis = new FileInputStream(file);
			
			byte[] b = new byte[(int)(file.length())];
			fis.read(b);
			
			String str = new String(b);
			
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
		} catch (IOException e) {
		} finally {
			try {
				if(fis != null) fis.close();
			} catch (IOException e) {
			}
		}
		
		
	}
}
