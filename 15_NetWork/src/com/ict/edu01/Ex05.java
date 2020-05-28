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

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.InputSource;

/*

[파싱]
- 페이지(문서, html 등)에서 내가 원하는 데이터를 특정 패턴 혹은 순서로 추출해 가공할 수 있는 포맷

1) XML
- XML(eXtensible Markup Language): 확장될 수 있는 표시 언어
								   사용자가 태그를 만들어서 사용할 수 있음
								   <시작태그 속_성="값"> 내용 </끝태그>
 								   * Markup Language: 태그
 								   * 
- XML 파싱: XML로 구성된 데이터에서 원하는 데이터만 추출, 가공하는 방법
			DOM(Document Object Modeling) 방식 >> 웹 브라우저가 태그를 해석 및 표현하는 방식
*/

public class Ex05 {
	public static void main(String[] args) {

		// 파일 저장
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "오늘날씨.txt";
		File file = new File(pathName);
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		
		// [파싱] XML 데이터 불러오기
		BufferedReader br = null;
		
		try {
			
			
			
		// [파싱] XML데이터 불러오기	>>> URLConnection 사용
			URL url = new URL("http://www.kma.go.kr/XML/weather/sfc_web_map.xml");
			URLConnection conn = url.openConnection();
			
			br = new BufferedReader(new InputStreamReader(conn.getInputStream()));
			
		// [파싱] XML 데이터값을 저장
			String msg = null;
			StringBuffer sb = new StringBuffer();
			
			while ((msg = br.readLine()) != null) {
				sb.append(msg + "\n");
			}
			
			
			System.out.println("======================================================");
			
		// [파싱] 저장한 XML 데이터 읽기
			InputSource is = new InputSource(new StringReader(sb.toString()));
			
			// Document < DocumentBuilder < DocumentBuilderFactory
			DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(is);
			
		// 파일 저장
			StringBuffer sb2 = new StringBuffer();
			
			// [파싱] 원하는 태그 찾기
			NodeList locals = document.getElementsByTagName("local");
			
			for (int i = 0; i < locals.getLength(); i++) {
				
			// [파싱] 태그(element) 텍스트 구하기
				String txt = locals.item(i).getFirstChild().getNodeValue();
				System.out.print(txt + " ");
				
			// [파싱] 태그 속성(attribute) 구하기
				String att1 = ((Element)(locals.item(i))).getAttribute("desc");
				String att2 = ((Element)(locals.item(i))).getAttribute("ta");
				System.out.println(att1 + " " + att2);
				
				// sb2에 누적 저장
				sb2.append(txt + " ");
				sb2.append(att1 + " ");
				sb2.append(att2 + "\n");
				
			}
			
		// 파일 저장하기
				fw = new FileWriter(file);
				bw = new BufferedWriter(fw);
			
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
