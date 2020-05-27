package com.ict.edu05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Scanner;

// [바이트 스트림과 문자 스트림의 연결]
//	- 기계어 '바이트 스트림'과 인간이 이해할 수 있는 '문자 스트림'을 연결

//	- InputStreamReader
//	· InputStream (바이트 스트림) >> Reader (문자 스트림)
//	· 과정: InputStream >> InputStreamReader >> Reader >> BufferedReader

public class Ex01 {
	public static void main(String[] args) {
		
		/*
		Scanner sc = new Scanner(System.in);
		
		System.out.print("원하는 문자를 입력하세요: ");
		String msg = sc.next();
		System.out.println(msg);
		*/
		
		System.out.print("원하는 문자를 입력하세요: ");
		InputStreamReader isr = null;
		BufferedReader br = null;
		try {
			
			isr = new InputStreamReader(System.in);		// System.in >>> 키보드 입력을 받음
			br = new BufferedReader(isr);
			String msg = br.readLine();
			System.out.println("받는 문자: " + msg);
			
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				isr.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
	}
}
