package com.ict.edu3;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
	
	// 컬렉션 출력을 위한 메소드 생성
	public static void listPrn(ArrayList<VO> list) {
		System.out.println();
		System.out.println("IDX\tID\tPW\tNAME\tAGE\tREG");
		for (VO vo : list) {
			System.out.print(vo.getIdx() 	+ "\t");
			System.out.print(vo.getM_id() 	+ "\t");
			System.out.print(vo.getM_pw() 	+ "\t");
			System.out.print(vo.getM_name() + "\t");
			System.out.print(vo.getM_age() 	+ "\t");
			System.out.println(vo.getM_reg().substring(0, 10));
		}
	}
	
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. MEMBERS 테이블 보기");
		System.out.println("2. MEMBERS 테이블 레코드 추가");
		System.out.println("3. MEMBERS 테이블 레코드 삭제");
		System.out.println("4. MEMBERS 테이블 레코드 수정");
		System.out.print("\n원하는 작업을 선택하세요. ");
		int su = sc.nextInt();
		
		// 데이터를 담을 컬렉션 생성
		ArrayList<VO> list = null;
		
		switch (su) {
		
		case 1:	list = DAO.getInstance().getSelect();
				
				// 여기서 출력
				listPrn(list);
				
				break;
		
		case 2: 
				System.out.print("새로 생성할 아이디: ");
				String new_id = sc.next();
			
				System.out.print("비밀번호: ");
				String new_pw = sc.next();
			
				System.out.print("이름: ");
				String new_name = sc.next();
				
				System.out.print("나이: ");
				String new_age = sc.next();
			
				list = DAO.getInstance().getInsert(new_id, new_pw, new_name, new_age);
				
				listPrn(list);
				
				break;
				
		case 3: list = DAO.getInstance().getSelect();
				listPrn(list);
		
				System.out.print("삭제할 아이디를 입력하세요. ");
				String del_id = sc.next();
			
				list = DAO.getInstance().getDelete(del_id);
		
				listPrn(list);
				
				break;
				
		case 4: list = DAO.getInstance().getSelect();
				System.out.print("나이를 수정할 아이디를 입력하세요. ");
				String re_id = sc.next();
				
				System.out.print("수정할 나이를 입력하세요. ");
				String re_age = sc.next();
			
				list = DAO.getInstance().getUpdate(re_age, re_id);
				
				listPrn(list);
				
				break;
		}
		
		System.out.println("\n수고하셨습니다.");
		
		
		
	}
}
