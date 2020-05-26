package com.ict.edu2;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;

// Buffer를 사용한 FileOutputStream
public class Ex07 {
	public static void main(String[] args) {

		String pathName
			= "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io03.txt";
		File file = new File(pathName);

		FileOutputStream fos = null;
		// 속도 향상을 위한 Buffer 사용
		BufferedOutputStream bos = null;
		
		try {
			
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);	// 스트림 체인
			
			// byte & char
			bos.write(105);
			bos.write('c');
			bos.write('t');
			
			// byte[]
			byte[] b2 = {'e', 'd', 'u', 13, 13};
			bos.write(b2);
			
			// String
			String msg = "Hello World!";
			byte[] b3 = msg.getBytes();
			bos.write(b3);
			
			bos.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				if (bos != null) bos.close();
				if (fos != null) fos.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
