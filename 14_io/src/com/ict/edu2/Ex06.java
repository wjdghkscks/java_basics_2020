package com.ict.edu2;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// 사진, 영상, 음악 파일 복사하기
public class Ex06 {
	public static void main(String[] args) {

		// 사진, 영상, 음악은 무조건 1byte씩 처리

		// 읽는 위치
		String pathName1 = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "video.mp4";
		File file1 = new File(pathName1);

		// 쓰는 위치
		String pathname2 = "C:" + File.separator + "study" + File.separator + "video_copy.mp4";
		File file2 = new File(pathname2);

		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			fis = new FileInputStream(file1);
			fos = new FileOutputStream(file2);

			int k = 0;
			while ((k = fis.read()) != -1) {
				fos.write(k);
			}
			fos.flush();
		} catch (Exception e) {
		} finally {
			try {
				try {
					System.out.println("파일 전송이 완료되었습니다.");
					if (fis != null) fis.close();
					if (fos != null) fos.close();
				} catch (Exception e2) {
				}
			} finally {
			}
		}
	}
}
