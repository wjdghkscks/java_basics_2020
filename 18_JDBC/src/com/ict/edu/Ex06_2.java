package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex06_2 {
	
	// main 메소드가 static이므로, 전역변수에도 static 지정
	static Scanner sc = new Scanner(System.in);
	static Connection conn = null;
	static Statement stmt = null;
	static ResultSet rs = null;
	static int res = 0;
	
	// main메소드가 static이므로, 불러오는 메소드도 static이어야 함
	// 1. MEMBERS 테이블 보기
	public static void getSelect() {
		try {
			String sql = "SELECT * FROM members ORDER BY idx";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				System.out.print(rs.getString(1) 	+ "\t");
				System.out.print(rs.getString(2) 	+ "\t");
				System.out.print(rs.getString(3) 	+ "\t");
				System.out.print(rs.getString(4) 	+ "\t");
				System.out.print(rs.getString(5) 	+ "\t");
				System.out.println(rs.getString(6));
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	// 2. MEMBERS 테이블 레코드 추가
	public static void getAdd() {
		try {
			System.out.print("새로 생성할 아이디: ");
			String new_id = sc.next();
			
			System.out.print("비밀번호: ");
			String new_pw = sc.next();
			
			System.out.print("이름: ");
			String new_name = sc.next();
			
			System.out.print("나이: ");
			int new_age = sc.nextInt();
			
			String sql = "INSERT INTO members VALUES(members_seq.nextval, '" + new_id + "', '" + new_pw + "', '" + new_name + "', " + new_age + ", SYSDATE)";
			
			stmt = conn.createStatement();
			
			res = stmt.executeUpdate(sql);
			
			if (res > 0) {
				
				System.out.println("데이터 삽입 성공");
				System.out.println();
				
				sql = "SELECT * FROM members ORDER BY idx";
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getString(1) 	+ "\t");
					System.out.print(rs.getString(2) 	+ "\t");
					System.out.print(rs.getString(3) 	+ "\t");
					System.out.print(rs.getString(4) 	+ "\t");
					System.out.print(rs.getString(5) 	+ "\t");
					System.out.println(rs.getString(6));
				}
			} else {
				System.out.println("데이터 삽입 실패 1");
			}
		} catch (Exception e) {
		} 
	}
	
	// 3. MEMBERS 테이블 레코드 삭제
	public static void getDelete() {
		try {
			System.out.print("삭제할 아이디를 입력하세요. ");
			String del_name = sc.next();
			
			String sql = "DELETE FROM members WHERE m_id = '" + del_name + "'";
			
			stmt = conn.createStatement();
			res = stmt.executeUpdate(sql);
			
			if (res > 0) {
				System.out.println("데이터 삭제 성공");
				sql = "SELECT * FROM members ORDER BY idx";
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getString(1) 	+ "\t");
					System.out.print(rs.getString(2) 	+ "\t");
					System.out.print(rs.getString(3) 	+ "\t");
					System.out.print(rs.getString(4) 	+ "\t");
					System.out.print(rs.getString(5) 	+ "\t");
					System.out.println(rs.getString(6));
				}
			} else {
				System.out.println("데이터 삭제 실패 1");
			}
		} catch (Exception e) {
			System.out.println("데이터 삭제 실패 2");
		}
	}
	
	// 4. MEMBERS 테이블 레코드 수정
	public static void getFix() {
		
		try {
			System.out.print("나이를 수정할 아이디를 입력하세요. ");
			String re_id = sc.next();
			
			System.out.print("수정할 나이를 입력하세요. ");
			int re_age = sc.nextInt();
			
			String sql = "UPDATE members SET m_age = " + re_age + " WHERE m_id = '" + re_id + "'";
			
			stmt = conn.createStatement();
			
			res = stmt.executeUpdate(sql);
			
			if (res > 0) {
				System.out.println("데이터 갱신 성공");
				sql = "SELECT * FROM members ORDER BY idx";
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getString(1) 	+ "\t");
					System.out.print(rs.getString(2) 	+ "\t");
					System.out.print(rs.getString(3) 	+ "\t");
					System.out.print(rs.getString(4) 	+ "\t");
					System.out.print(rs.getString(5) 	+ "\t");
					System.out.println(rs.getString(6));
				}
			} else {
				System.out.println("데이터 갱신 실패 1");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
	}
	
	
	// main
	public static void main(String[] args) {
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@203.236.220.76:1521:xe";
			String user = "C##sprite";
			String password = "7963";
			
			conn = DriverManager.getConnection(url, user, password);
			
			// Oracle 접속 완료
			
			System.out.println("1. MEMBERS 테이블 보기");
			System.out.println("2. MEMBERS 테이블 레코드 추가");
			System.out.println("3. MEMBERS 테이블 레코드 삭제");
			System.out.println("4. MEMBERS 테이블 레코드 수정");
			System.out.print("\n원하는 작업을 선택하세요. ");
			
			int su = sc.nextInt();
			
			switch (su) {
				case 1: getSelect(); break;
				case 2: getAdd(); break;
				case 3: getDelete(); break;
				case 4: getFix(); break;
			}
			
			System.out.println("\n수고하셨습니다.");
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		
	}
}
