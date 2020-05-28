package com.ict.edu01;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

public class Ex04 {
	public static void main(String[] args) {

	/*
	  http://www.kma.go.kr/XML/weather/sfc_web_map.xml
	  http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/
	  공공 데이터 포털 : https://www.data.go.kr
	*/
		
		// 정보 가져오기
		
		BufferedReader br = null;
		

		try {
			
			URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection conn = url.openConnection();
			
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
			String msg = null;
			while ((msg = br.readLine()) != null) {
				
				System.out.println(msg);
				
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
