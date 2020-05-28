package com.ict.edu01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/*
[URL 클래스]
- URL(Uniform Resource Locator): 인터넷에서 접근 가능한 자원의 주소
								 원격지 서버 자원의 결과만 가져옴
								 final 클래스 >>> 상속이 불가능
 */

public class Ex02 {
	public static void main(String[] args) {

		// 해당 URL로 이동하여 데이터 읽기
		InputStream is = null;
		InputStreamReader isr = null;
		BufferedReader br = null;

		// 내PC에 데이터 저장
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "data01.txt";
		File file = new File(pathName);
		FileWriter fw = null;
		BufferedWriter bw = null;

		try {

			URL url = new URL("https://www.naver.com");
			System.out.println("프로토콜: " + url.getProtocol());
			System.out.println("포트: " + url.getPort());
			System.out.println("path: " + url.getPath());
			System.out.println("호스트: " + url.getHost());
			System.out.println("안내: " + url.getUserInfo());
			
			System.out.println("----------------------------");
			
			is = url.openStream();
			isr = new InputStreamReader(is);
			br = new BufferedReader(isr);
			
			String msg = null;
			StringBuffer sb = new StringBuffer();
			
			while ((msg = br.readLine()) != null) {
				sb = sb.append(msg + "\n");			// sb에 저장
			}
			
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			bw.write(sb.toString());				// sb를 파일에 저장
			bw.flush();

		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				bw.close();
				fw.close();
				br.close();
				isr.close();
				is.close();
			} catch (Exception e) {
			}
		}

	}
}
