package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {
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
			//String sql = "SELECT * FROM members WHERE idx = 42";
			String sql = "SELECT * FROM members WHERE m_name like '%리'";
			
		// 구문 생성
			stmt = conn.createStatement();
			
		// SQL에 담아서 보내고 결과 받기
			rs = stmt.executeQuery(sql);
			
			while (rs.next()) {
				// idx, m_id, m_pw, m_name, m_age, m_reg
				System.out.print(rs.getString("idx") 	+ "\t");
				System.out.print(rs.getString("m_id") 	+ "\t");
				System.out.print(rs.getString("m_pw") 	+ "\t");
				System.out.print(rs.getString("m_name") + "\t");
				System.out.print(rs.getString("m_age") 	+ "\t");
				System.out.println(rs.getString("m_reg").substring(0, 10));  
				// .substring(a, b) : 문자열의 a자리부터 b자리 전까지 출력
			}
			
		} catch (Exception e) {
			System.out.println(e);
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
