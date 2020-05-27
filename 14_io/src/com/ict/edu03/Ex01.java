package com.ict.edu03;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

// [DataInputStream과 DataOutputStream]
//	- 기본 자료형을 주고 받을 때 사용
//	- 반드시 입력 및 출력 순서를 맞춰야 함
//	- BufferedOOOSteram와 마찬가지로 기본 생성자가 없으므로, 사용 시 FileOOOStream을 같이 활용
public class Ex01 {
	public static void main(String[] args) {

		String pathName = "C:" + File.separator + "study" + File.separator + "util" + File.separator + "io04.txt";
		File file = new File(pathName);
		
		FileOutputStream fos = null;
		DataOutputStream dos = null;
		
		FileInputStream fis = null;
		DataInputStream dis = null;
		
		try {
			fos = new FileOutputStream(file);
			dos = new DataOutputStream(fos);
			
			fis = new FileInputStream(file);
			dis = new DataInputStream(fis);
			
			// 쓰기: .writeOOO()			<<< OOO: 기본 자료형
			dos.writeByte(126);
			dos.writeShort(5422);
			dos.writeInt(124);
			dos.writeLong(123L);
			dos.writeFloat(34.14f);
			dos.writeDouble(57.1);
			dos.writeBoolean(true);
			dos.writeChar('f');
			
			dos.flush();
			
		// ↑↑↑작성 순서를 그대로 맞춰줘야 함↓↓↓
			
			// 읽기: .readOOO()				<<< OOO: 기본 자료형
			System.out.println(dis.readByte());
			System.out.println(dis.readShort());
			System.out.println(dis.readInt());
			System.out.println(dis.readLong());
			System.out.println(dis.readFloat());
			System.out.println(dis.readDouble());
			System.out.println(dis.readBoolean());
			System.out.println(dis.readChar());
			
		} catch (Exception e) {
		} finally {
			try {
				if(dos != null) dos.close();
				if(dis != null) dis.close();
				if(fos != null) fos.close();
				if(fis != null) fis.close();
			} catch (Exception e2) {
			}
		}

	}
}
