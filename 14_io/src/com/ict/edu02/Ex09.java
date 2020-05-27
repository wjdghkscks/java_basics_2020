package com.ict.edu02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// Buffer를 사용한 파일 복사하기
public class Ex09 {
	public static void main(String[] args) {

		// 읽는 위치
		String pathName1 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "video.mp4";
		File file1 = new File(pathName1);

		// 쓰는 위치
		String pathname2 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "video_copy.mp4";
		File file2 = new File(pathname2);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fis = new FileInputStream(file1);
			bis = new BufferedInputStream(fis);
			
			fos = new FileOutputStream(file2);
			bos = new BufferedOutputStream(fos);
			
			int b = 0;
			while ((b = bis.read()) != -1) {
				bos.write(b);
			}
			bos.flush();
		} catch (Exception e) {
		} finally {
			try {
				if(bos != null) bos.close();
				if(fos != null) fos.close();
				if(bis != null) bis.close();
				if(fis != null) fis.close();
			} catch (Exception e2) {
			}
		}
		

	}
}
