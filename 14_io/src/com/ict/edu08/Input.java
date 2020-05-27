package com.ict.edu08;

import java.io.BufferedInputStream;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import com.ict.edu08.VO;

public class Input {
	public static void main(String[] args) {
		
		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io11.txt";
		File file = new File(pathName);
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		ObjectInputStream ois = null;
		
	// String으로 볼 수 있게 새 파일 생성
		String savePath = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io12.txt";
		File file2 = new File(savePath);
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			fis = new FileInputStream(file);
			bis = new BufferedInputStream(fis);
			ois = new ObjectInputStream(bis);
			
			fw = new FileWriter(file2);
			bw = new BufferedWriter(fw);
			
			ArrayList<VO> list = (ArrayList<VO>) ois.readObject();		// 역직렬화
			
			System.out.println("=============================");
			System.out.println("이 름\t총 점\t평 균\t학 점");
			System.out.println("=============================");
			
			for (VO k : list) {
				
				System.out.print(k.getName() + "\t");
				System.out.print(k.getSum() + "\t");
				System.out.print(k.getAvg() + "\t");
				System.out.println(k.getHak());
				
				bw.write(k.getName() + "\t");		// 탭이나 줄바꿈을 넣지 않으면 오류 발생
				bw.write(k.getSum() + "\t");
				bw.write((int) k.getAvg() + "\t");
				bw.write(k.getHak() + "\n");
			}
			
			bw.flush();
			
		} catch (Exception e) {
		} finally {
			try {
				bw.close();
				fw.close();
				ois.close();
				bis.close();
				fis.close();
			} catch (Exception e2) {
			}
		}
		
		
	}
}
