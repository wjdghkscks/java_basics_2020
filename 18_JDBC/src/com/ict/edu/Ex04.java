package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		int res = 0;
		
		try {
			
		// 드라이버 로딩
			Class.forName("oracle.jdbc.OracleDriver");
									
		// 접속 정보
			String url = "jdbc:oracle:thin:@203.236.220.76:1521:xe";
			String user = "C##sprite";
			String password = "7963";
									
		// Oracle 접속
			conn = DriverManager.getConnection(url, user, password);
								
		// SQL문
			String sql = "DELETE FROM members WHERE m_name = '희동이' OR m_reg = null";
			
		// 구문 생성
			stmt = conn.createStatement();
					
		// INSERT, UPDATE, DELETE
			res = stmt.executeUpdate(sql);
			
			if (res > 0) {
				
				System.out.println("삭제 성공");
				
			// SELECT
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
				System.out.println("삭제 실패 1");
			}
			
		} catch (Exception e) {
			System.out.println("삽입 실패 2");
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
