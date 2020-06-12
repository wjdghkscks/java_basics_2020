package com.ict.edu2;

import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. MEMBERS 테이블 보기");
		System.out.println("2. MEMBERS 테이블 레코드 추가");
		System.out.println("3. MEMBERS 테이블 레코드 삭제");
		System.out.println("4. MEMBERS 테이블 레코드 수정");
		System.out.print("\n원하는 작업을 선택하세요. ");
		
		int su = sc.nextInt();
		
		
		switch (su) {
		
		case 1: DAO.getInstance().getSelect(); break;
		
		case 2: DAO.getInstance().getSelect();
				System.out.print("새로 생성할 아이디: ");
				String new_id = sc.next();
			
				System.out.print("비밀번호: ");
				String new_pw = sc.next();
			
				System.out.print("이름: ");
				String new_name = sc.next();
				
				System.out.print("나이: ");
				String new_age = sc.next();
			
				DAO.getInstance().getInsert(new_id, new_pw, new_name, new_age);
			
				break;
				
		case 3: DAO.getInstance().getSelect();
				System.out.print("삭제할 아이디를 입력하세요. ");
				String del_id = sc.next();
			
				DAO.getInstance().getDelete(del_id);
		
				break;
				
		case 4: DAO.getInstance().getSelect();
				System.out.print("나이를 수정할 아이디를 입력하세요. ");
				String re_id = sc.next();
				
				System.out.print("수정할 나이를 입력하세요. ");
				String re_age = sc.next();
			
				DAO.getInstance().getUpdate(re_age, re_id);
				
				break;
		}
		
		System.out.println("\n수고하셨습니다.");
		
		
		
	}
}
