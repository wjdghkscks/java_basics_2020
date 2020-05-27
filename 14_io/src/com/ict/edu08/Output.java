package com.ict.edu08;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Output {
	public static void main(String[] args) {

		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io11.txt";
		File file = new File(pathName);

		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;

		Scanner sc = new Scanner(System.in);
		
		try {

			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);

			ArrayList<VO> list = new ArrayList<VO>();
			
			/* String만을 받기 때문에 int로 추가로 변환하는 과정이 발생
			 
			for (int i = 0; i < 5; i++) {
				
				InputStreamReader isr = null;
				BufferedReader br = null;

				System.out.print("이름 >>> ");
				isr = new InputStreamReader(System.in);
				br = new BufferedReader(isr);
				String name = br.readLine();

				System.out.print("국어 점수 >>> ");
				isr = new InputStreamReader(System.in);
				br = new BufferedReader(isr);
				String k = br.readLine();

				System.out.print("영어 점수 >>> ");
				isr = new InputStreamReader(System.in);
				br = new BufferedReader(isr);
				String e = br.readLine();

				System.out.print("수학 점수 >>> ");
				isr = new InputStreamReader(System.in);
				br = new BufferedReader(isr);
				String m = br.readLine();
				
			*/
				
			for (int i = 0; i < 5; i++) {
				System.out.print("이름 >>> ");
				String name = sc.next();
				System.out.print("국어 점수 >>> ");
				int kor = sc.nextInt();
				System.out.print("영어 점수 >>> ");
				int eng = sc.nextInt();
				System.out.print("수학 점수 >>> ");
				int math = sc.nextInt();
				
				VO person = new VO(name, kor, eng, math);
				list.add(person);
			}

			oos.writeObject(list);		// 직렬화
			oos.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				oos.close();
				bos.close();
				fos.close();
			} catch (Exception e2) {
			}
		}

	}
}
