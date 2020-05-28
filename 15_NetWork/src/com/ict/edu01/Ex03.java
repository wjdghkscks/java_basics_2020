package com.ict.edu01;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

/*

[URLConnection 클래스]
- 원격지 서버 자원의 결과는 물론 원격 서버의 헤더 정보들을 가져올 수 있음

*/

public class Ex03 {
	public static void main(String[] args) {
		
		BufferedReader br = null;
		
		try {
			
			URL url = new URL("https://www.naver.com");
			URLConnection conn = url.openConnection();
			
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			System.out.println("인코딩: " + conn.getContentEncoding());
			System.out.println("길이: " + conn.getContentLength());
			System.out.println("문서타입: " + conn.getContentType());
			
			System.out.println("================================");
			
			// 인터넷 정보는 헤더와 바디로 구성
			// 웹 브라우저는 헤더 정보를 해석 및 실행
			
			// 헤더 정보를 받는 방법 1) ↓↓↓ 2) 웹 페이지에서 F12
			Map<String, List<String>> list = conn.getHeaderFields();
			
			for (String k : list.keySet()) {
				
				System.out.println(list.get(k));
				
			}
			
			
		} catch (Exception e) {
		} finally {
			try {
				br.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
