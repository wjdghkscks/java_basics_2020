package com.ict.edu2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 [DAO] (Data Access Object)
- 데이터베이스에 있는 데이터에 접근하기 위한 객체
- CRUC 작업을 처리하는 메소드를 만들어 제공
 (CRUC 작업: INSERT, UPDATE, DELETE, SELECT 작업)
*/ 
 
public class DAO {

	Connection conn;
	Statement stmt;
	ResultSet rs;
	int res;
	
	// [싱글톤 패턴]
	// - 하나의 인스턴스만을 생성하고 사용할 수 있음
	// - 하나의 객체만 생성하고 사용해야 할 때 적용할 수 있는 패턴
	
	private static DAO dao = new DAO();
	
	public static DAO getInstance() {
			return dao;
	}
	
	// 접속
	public Connection getConnection() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			String url = "jdbc:oracle:thin:@203.236.220.76:1521:xe";
			String user = "C##sprite";
			String password = "7963";
			conn = DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
		}
		return conn;
	}
	
	// SELECT문
	public void getSelect() {
		try {
			
			conn = getConnection();
			
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
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
	
	// INSERT문
	public void getInsert(String new_id, String new_pw, String new_name, String new_age) {
		try {
			
			conn = getConnection();
			
			String sql = "INSERT INTO members VALUES(members_seq.nextval, '" + new_id + "', '" + new_pw + "', '" + new_name + "', " + new_age + ", SYSDATE)";
			
			stmt = conn.createStatement();
			
			res = stmt.executeUpdate(sql);
			
			if (res > 0) {
				
				getSelect();
				
			} else {
				System.out.println("데이터 삽입 실패");
			}
			
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
	
	// DELETE문
	public void getDelete(String del_id) {
		try {
			
			conn = getConnection();
			
			String sql = "DELETE FROM members WHERE m_id = '" + del_id + "'";
			
			stmt = conn.createStatement();
			
			res = stmt.executeUpdate(sql);
			
			if (res > 0) {
				System.out.println("데이터 삭제 성공");
				getSelect();
			} else {
				System.out.println("데이터 삭제 실패");
			}
			
		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				stmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
	}
	
	// UPDATE문
	public void getUpdate(String re_age, String re_id) {
		try {
			conn = getConnection();
			String sql = "UPDATE members SET m_age = " + re_age + " WHERE m_id = '" + re_id + "'";
			
			stmt = conn.createStatement();
			
			res = stmt.executeUpdate(sql);
			
			if (res > 0) {
				System.out.println("데이터 갱신 성공");
				getSelect();
			} else {
				System.out.println("데이터 갱신 실패");
			}
			
		} catch (Exception e) {
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
