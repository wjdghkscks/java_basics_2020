package com.ict.edu04;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

// [BufferedReader]
//	- readLine()
//	- 한 줄씩 읽으며, 더이상 읽을 수 없을 때 null

public class Ex04 {
	public static void main(String[] args) {
		
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io07.txt";
		File file = new File(pathName);
		
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			
			fr = new FileReader(file);
			br = new BufferedReader(fr);
			
			/*
			// 한 줄 읽기
			String msg = br.readLine();
			System.out.println(msg);
			*/
			
			// 전체 줄 읽기
			String msg = null;
			String str = "";			// null 오류가 발생할 수 있기 때문
			
			StringBuffer sb = new StringBuffer();		// String 누적 저장 시 사용
			
			while ((msg = br.readLine()) != null) {
				
				// 출력하기
				// System.out.println(msg);
				
				// 저장하기
				// str = str + msg + "\n";				String은 누적 저장하지 않는 게 좋음	
				// str = str.concat(msg + "\n");		>>> StringBuffer를 사용
				
				sb.append(msg + "\n");					// String 누적 저장 시 사용
				
			}
			System.out.println(sb.toString());
			
		} catch (Exception e) {
		} finally {
			try {
				br.close();
				fr.close();
			} catch (Exception e2) {
			}
		}
		
		
	}
}
