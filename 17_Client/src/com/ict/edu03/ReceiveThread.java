package com.ict.edu03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;

public class ReceiveThread implements Runnable {

	Socket s;
	
	InputStream is;
	InputStreamReader isr;
	BufferedReader br;
	
	public ReceiveThread(Socket s) {

		this.s = s;
		
		try {
			is = s.getInputStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	
	
	@Override
	public void run() {
		try {
			while (true) {
				
				String msg = br.readLine();
				System.out.println(msg);
				
			}
		} catch (Exception e) {
		}
	}

}
