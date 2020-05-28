package com.ict.edu01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.URL;
import java.net.URLConnection;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/*

[파싱]
- 페이지(문서, html 등)에서 내가 원하는 데이터를 특정 패턴 혹은 순서로 추출해 가공하는 것

2) json
- '속성-값' 또는 '키-값' 쌍으로 구성된 데이터 오브젝트 전달을 위해
  (인간이 읽을 수 있는) 텍스트를 사용하는 개방형 표준 포맷

*/

public class Ex06 {
	public static void main(String[] args) {
		// [파싱] json 파일 불러오기
		BufferedReader br = null;
		
		
		// 파일 저장
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "도서관.txt";
		File file = new File(pathName);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		try {
			
		// [파싱] json 파일 불러오기	>>> URLConnection 사용
			URL url = new URL("http://openapi.seoul.go.kr:8088/sample/json/SeoulLibraryTime/1/5/");
			
			URLConnection conn = url.openConnection();
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
		// 데이터값 변수 저장
			String msg = null;
			StringBuffer sb = new StringBuffer();
			
			while ((msg = br.readLine()) != null) {
				// System.out.println(msg);
				sb.append(msg + "\n");
			}
			
			
			System.out.println("======================================================");
		// 파일 저장하기
			StringBuffer sb2 = new StringBuffer();
			
			fw = new FileWriter(file);
			bw = new BufferedWriter(fw);
			
			
			
		// [파싱] json 파일 읽기		>> json을 읽는 외부 라이브러리 연결하기
									// 프로젝트 우클릭 > Build Path > Configure Build Path > Libraries 탭 >
									// Add External JARs > json 파일 선택 > Apply
			
			// [파싱] 원하는 데이터에 접근하기 위한 Object 생성
			JSONParser parser = new JSONParser();
			JSONObject object1 = (JSONObject) parser.parse(sb.toString());
			JSONObject object2 = (JSONObject) object1.get("SeoulLibraryTime");
			JSONArray j_arr = (JSONArray) object2.get("row");
			
			
			/* [파싱] json 데이터 전체 저장
			for (Object k : j_arr) {
				
				System.out.println(k);
				
				sb2.append(k + "\n");
				
			}
			*/
			
			// [파싱] json 데이터 중 원하는 데이터만 선별하여 저장 
			for (Object k : j_arr) {
				
				JSONObject object3 = (JSONObject) k;
				
				String name = (String) object3.get("LBRRY_NAME");
				String tel = (String) object3.get("TEL_NO");
				String addr = (String) object3.get("ADRES");
				
				System.out.println(name + "\t" + tel + "\t" + addr + "\n");
				
				sb2.append(name + "\t" + tel + "\t" + addr + "\n");
				
			}
			
			
		// 파일 저장하기
			bw.write(sb2.toString());			
			bw.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				bw.close();
				fw.close();
			} catch (Exception e2) {
			}
		}

	}
}
