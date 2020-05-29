package com.ict.edu03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

// 멀티 서버 만들기
public class Server implements Runnable {

	ServerSocket ss = null;
	
	// 정보를 받기 위한 스트림
		InputStream is;
		InputStreamReader isr;
		BufferedReader br;
		
		OutputStream os;
		OutputStreamWriter osw;
		BufferedWriter bw;
		
	// 여러명의 접속자 정보를 받아서 처리하기 위한 컬렉션 Player
		ArrayList<Player> list;
		
		
		
		public Server() {
			try {
				
				list = new ArrayList<Player>();
				ss = new ServerSocket(7788);
				System.out.println("멀티 서버 대기 중 ......");
				new Thread(this).start();
				
			} catch (Exception e) {
			}
		}
		
		
		
		@Override
		public void run() {
			try {
				while(true) {
					Socket s = ss.accept();
					Player player = new Player(s, this);
					new Thread(player).start();
					list.add(player);
				}
				
			} catch (Exception e) {
			}
		}
		
		
		
		// 리스트안에 존재하는 모든 클라이언트들에게 메세지 전달하기 
		public void sendMsg(String msg) {
			try {
				msg += System.getProperty("line.separator");
				System.out.println(list.size());
				for (Player player : list) {
					player.bw.write(msg);
					player.bw.flush();
				}
			} catch (Exception e) {
			}
			
		}
		
		public static void main(String[] args) {
			new Server();
		}
	}
