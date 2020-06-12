package com.ict.edu4;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/* 
 [preparedStatement]
 
  
  
  
 */

public class Ex01 {
	public static void main(String[] args) {
		
		Connection conn = null;
		
		/* Statement stmt = null; */
		
		PreparedStatement pstmt = null;
		
		ResultSet rs = null;	
		int result = 0;			
		
		
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@203.236.220.76:1521:xe";
			String user = "C##sprite";
			String password = "7963";
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "SELECT * FROM members ORDER BY idx";
			
			/* 	stmt = conn.createStatement();
				rs = stmt.executeQuery(sql);   */
			
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
			
		} catch (Exception e) {
			
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
