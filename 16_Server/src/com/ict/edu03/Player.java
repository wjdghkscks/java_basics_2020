package com.ict.edu03;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

// 멀티 서버 만들기
//	- ArrayList에 사용자 정보를 넣기 위해 생성

public class Player implements Runnable {

	// 전역변수 생성
	Socket s ;
	Server server;
	
	InputStream is;
	InputStreamReader isr;
	BufferedReader br;
	
	OutputStream os;
	OutputStreamWriter osw;
	BufferedWriter bw ;
	
	String ip;
	
	
	
	public Player() {}
	
	
	
	public Player(Socket s,Server server){
		this.s = s ;
		this.server = server;
		
		try {
			is = s.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			os = s.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
			
			ip = s.getInetAddress().getHostAddress();
		} catch (Exception e) {
		}
	}
	
	
	
	@Override
	public void run() {
		try {
			while (true) {
				String msg = br.readLine();
				if(msg.equalsIgnoreCase("exit")) {
					break;
				}else {
					server.sendMsg(ip+": "+msg);
				}
			}
		} catch (Exception e) {
		} 
		
	}
}
