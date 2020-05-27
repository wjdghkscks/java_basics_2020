package com.ict.edu05;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//[바이트 스트림과 문자 스트림의 연결]
//	- 기계어 '바이트 스트림'과 인간이 이해할 수 있는 '문자 스트림'을 연결

public class Ex03 {
	public static void main(String[] args) {
		
		/*
		System.out.println("Hello World");
		*/
		
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		InputStreamReader isr = null;
		BufferedReader br = null;
		
		try {
			
			osw = new OutputStreamWriter(System.out);		// System.out >>> 모니터에 출력
			bw = new BufferedWriter(osw);
			
			isr = new InputStreamReader(System.in);			// System.in  >>> 키보드 입력을 받음
			br = new BufferedReader(isr);
			
			bw.write("원하는 문자: ");
			bw.flush();
			
			String msg = br.readLine();
			bw.write("받은 내용: " + msg);
			bw.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				isr.close();
				bw.close();
				osw.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
