package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Ex05 {
	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		
		ResultSet rs = null;
		int res = 0;
		
		try {
			
			Class.forName("oracle.jdbc.OracleDriver");
			
			String url = "jdbc:oracle:thin:@203.236.220.76:1521:xe";
			String user = "C##sprite";
			String password = "7963";
			
			conn = DriverManager.getConnection(url, user, password);
			
			String sql = "UPDATE members SET idx = 3 WHERE idx = 43";
			
			stmt = conn.createStatement();
			
			res = stmt.executeUpdate(sql);
			
			if (res > 0) {
				System.out.println("갱신 성공");
				
			// SELECT문
				sql = "SELECT * FROM members ORDER BY idx";
				rs = stmt.executeQuery(sql);
				while (rs.next()) {
					System.out.print(rs.getString(1) 	+ "\t");
					System.out.print(rs.getString(2) 	+ "\t");
					System.out.print(rs.getString(3) 	+ "\t");
					System.out.print(rs.getString(4) 	+ "\t");
					System.out.print(rs.getString(5) 	+ "\t");
					System.out.println(rs.getString(6).substring(5, 10));
				}
			} else {
				System.out.println("갱신 실패 1");
			}
			
		} catch (Exception e) {
			System.out.println("갱신 실패 2");
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
