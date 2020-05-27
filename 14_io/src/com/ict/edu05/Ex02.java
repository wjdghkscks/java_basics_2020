package com.ict.edu05;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

//[바이트 스트림과 문자 스트림의 연결]
//	- 기계어 '바이트 스트림'과 인간이 이해할 수 있는 '문자 스트림'을 연결

//	- OutputStreamWriter
//	· OutputStream (바이트 스트림) >> Writer (문자 스트림)
//	· 과정: OutputStream >> OutputStreamWriter >> Writer >> BufferedReader

public class Ex02 {
	public static void main(String[] args) {
		
		/*
		System.out.println("Hello World");
		*/
		
		OutputStreamWriter osw = null;
		BufferedWriter bw = null;
		
		try {
			
			osw = new OutputStreamWriter(System.out);		// System.out >> 모니터에 출력
			bw = new BufferedWriter(osw);
			
			bw.write("Welcome 대한민국");
			
			bw.flush();
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				osw.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
