package com.ict.edu10;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Output {
	public static void main(String[] args) {
		
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io14.txt";
		File file = new File(pathName);
		
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		ObjectOutputStream oos = null;
		
		try {
			
			fos = new FileOutputStream(file);
			bos = new BufferedOutputStream(fos);
			oos = new ObjectOutputStream(bos);
			
			ArrayList<VO> list = new ArrayList<VO>();
			
			Scanner sc = new Scanner(System.in);
			
			esc: while (true) {
				
				System.out.print("이름: ");
				String name = sc.next();
				System.out.print("국어 성적: ");
				int kor = sc.nextInt();
				System.out.print("영어 성적: ");
				int eng = sc.nextInt();
				System.out.print("수학 성적: ");
				int math = sc.nextInt();
				
				VO person = new VO(name, kor, eng, math);
				list.add(person);
				
				while (true) {
					System.out.print("계속 입력하시겠습니까? (Y/N) ");
					String msg = sc.next();
					if (msg.equalsIgnoreCase("y")) {
						continue esc;
					} else if (msg.equalsIgnoreCase("n")) {
						break esc;
					} else {
						System.out.println("\n잘못 입력하셨습니다.\n");
						continue;
					}
				}
			}
			
			oos.writeObject(list);	// 직렬화
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
