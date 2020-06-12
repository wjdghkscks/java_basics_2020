package com.ict.edu4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex02 {
	public static void main(String[] args) {
		
		Connection conn = null;
		/*	Statement stmt = null;	*/
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int res = 0;
				
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@203.236.220.76:1521:xe";
			String user = "C##sprite";
			String password = "7963";
			
			conn = DriverManager.getConnection(url, user, password);
			
			// 바인딩 변수
			// - Prepared Statement 에서 사용되는 변경 가능한 변수
			// - ?(물음표) 로 표시
			String sql = "SELECT * FROM members WHERE idx = ?";
			
			pstmt = conn.prepareStatement(sql);
			
			// 바인딩 변수 채우기
			// pstmt.setString(물음표_순서, 물음표에 들어갈 데이터);
			pstmt.setString(1, "41");
			
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				System.out.print(rs.getString("idx") 	+ "\t");
				System.out.print(rs.getString("m_id") 	+ "\t");
				System.out.print(rs.getString("m_pw") 	+ "\t");
				System.out.print(rs.getString("m_name") + "\t");
				System.out.print(rs.getString("m_age") 	+ "\t");
				System.out.println(rs.getString("m_reg").substring(0, 10));  
			}
			
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		
		
		
		
	}
}
