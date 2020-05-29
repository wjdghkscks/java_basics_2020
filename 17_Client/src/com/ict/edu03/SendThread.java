package com.ict.edu03;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class SendThread implements Runnable {

	Socket s;
	
	Scanner sc = new Scanner(System.in);
	
	OutputStream os;
	OutputStreamWriter osw;
	BufferedWriter bw;
	
	public SendThread(Socket s) {
		this.s = s;
		
		try {
			os = s.getOutputStream();
			osw = new OutputStreamWriter(os);
			bw = new BufferedWriter(osw);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
	@Override
	public void run() {
		
		try {
			while (true) {
				System.out.println("입력: ");
				String msg = sc.nextLine();
				msg += System.getProperty("line.separator");
				
				bw.write(msg);
				bw.flush();
			}
		} catch (Exception e) {
		}
		
	}
	
}
