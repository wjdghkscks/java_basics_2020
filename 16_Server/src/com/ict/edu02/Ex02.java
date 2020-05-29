package com.ict.edu02;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

/*
[echo Server 에코 서버] - 서버
- 받은 내용을 그대로 돌려 주는 서버
- 생성 순서: input > output
*/

// 정보를 받기 위한 스트림 - 문자 스트림

public class Ex02 implements Runnable {

	ServerSocket ss = null;

	InputStream is;
	InputStreamReader isr;
	BufferedReader br;

	OutputStream os;
	OutputStreamWriter osw;
	BufferedWriter bw;

	public Ex02() {
		try {
			
			ss = new ServerSocket(7777);
			System.out.println("에코 서버 대기 중......");
			new Thread(this).start();
			
		} catch (Exception e) {
		}
	}

	
	@Override
	public void run() {
		try {
			while (true) {

				Socket s = ss.accept();
				
			// 클라이언트가 전송한 메시지 받기
				is = s.getInputStream();
				isr = new InputStreamReader(is);
				br = new BufferedReader(isr);
				
				String msg = br.readLine();
				System.out.println("(" + s.getLocalAddress() + ") 받은 메시지: " + msg);
				
			// 클라이언트에게 메시지 전송하기
				os = s.getOutputStream();
				osw = new OutputStreamWriter(os);
				bw = new BufferedWriter(osw);
				
				msg += System.getProperty("line.separator");	// 라인의 끝 표시 >>> 문자 스트림에서는 반드시 추가
				bw.write(msg);
				bw.flush();

			}
		} catch (Exception e) {
			System.out.println(e);
		}

	}

	public static void main(String[] args) {
		new Ex02();
	}
}
