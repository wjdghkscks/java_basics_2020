package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;

public class Ex06 {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		ResultSet rs = null;
		int res = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("1. MEMBERS 테이블 보기");
		System.out.println("2. MEMBERS 테이블 레코드 추가");
		System.out.println("3. MEMBERS 테이블 레코드 삭제");
		System.out.println("4. MEMBERS 테이블 레코드 수정");
		System.out.print("\n원하는 작업을 선택하세요. ");
		
		int select = sc.nextInt();
		
// 1. MEMBERS 테이블 보기
		if (select == 1) {
			
			try {
				
				Class.forName("oracle.jdbc.OracleDriver");
				
				String url = "jdbc:oracle:thin:@203.236.220.76:1521:xe";
				String user = "C##sprite";
				String password = "7963";
				
				conn = DriverManager.getConnection(url, user, password);
				
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
			} finally {
				try {
					rs.close();
					stmt.close();
					conn.close();
				} catch (Exception e2) {
				}
			}
// 2. MEMBERS 테이블 레코드 추가	
		} else if (select == 2) {
			
			try {
				
				Class.forName("oracle.jdbc.OracleDriver");
				
				String url = "jdbc:oracle:thin:@203.236.220.76:1521:xe";
				String user = "C##sprite";
				String password = "7963";
				
				conn = DriverManager.getConnection(url, user, password);
				
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
				System.out.println("데이터 삽입 실패 2");
			} finally {
				try {
					rs.close();
					stmt.close();
					conn.close();
				} catch (Exception e2) {
				}
			}
			
// 3. MEMBERS 테이블 레코드 삭제
		} else if (select == 3) {
			
			try {
				
				Class.forName("oracle.jdbc.OracleDriver");
				
				String url = "jdbc:oracle:thin:@203.236.220.76:1521:xe";
				String user = "C##sprite";
				String password = "7963";
				
				conn = DriverManager.getConnection(url, user, password);
				
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
			} finally {
				try {
					rs.close();
					stmt.close();
					conn.close();
				} catch (Exception e2) {
				}
			}
			
// 4. MEMBERS 테이블 레코드 수정
		} else if (select == 4) {
			
			try {
				
				Class.forName("oracle.jdbc.OracleDriver");
				
				String url = "jdbc:oracle:thin:@203.236.220.76:1521:xe";
				String user = "C##sprite";
				String password = "7963";
				
				conn = DriverManager.getConnection(url, user, password);
				
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
				System.out.println("데이터 갱신 실패 2");
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
}
