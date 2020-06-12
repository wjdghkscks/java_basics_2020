package com.ict.edu4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex04 {
	public static void main(String[] args) {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int res = 0;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
									
			String url = "jdbc:oracle:thin:@203.236.220.76:1521:xe";
			String user = "C##sprite";
			String password = "7963";
									
			conn = DriverManager.getConnection(url, user, password);
								
			String sql = "DELETE FROM members WHERE m_name = ?";
			
		// 구문 생성
			pstmt = conn.prepareStatement(sql);
					
		// 바인딩 변수 채우기
			pstmt.setString(1, "박찬호");
			
		// INSERT, UPDATE, DELETE
			res = pstmt.executeUpdate();
			
			if (res > 0) {
				
				System.out.println("삭제 성공");
				
			// SELECT
				sql = "SELECT * FROM members ORDER BY idx";
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
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
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		
	}
}
