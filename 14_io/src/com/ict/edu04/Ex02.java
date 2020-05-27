package com.ict.edu04;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Ex02 {
	public static void main(String[] args) {

		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io07.txt";
		File file = new File(pathName);

		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {

			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);

			// 숫자
			bw.write(97);
			// 숫자 대신 char
			bw.write('k');

			// 배열
			char[] c = { 'j', 'a', 'v', 'a' };
			bw.newLine();
			bw.write(c);
			bw.newLine();	// 줄바꿈 시 \n 대신에 .newLine() 사용

			// String
			bw.write("korea");
			bw.newLine();	
			bw.write("대한민국");
			bw.newLine();
			bw.write("大韓");
			bw.newLine();
			bw.write("12345");

			fw.flush();
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}

	}
}
