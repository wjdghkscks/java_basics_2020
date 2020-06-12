package com.ict.edu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/* JAVA와 Oracle을 연결하기 위한 라이브러리를 프로젝트에 등록하기
[외부 드라이버 가져오기]
- Project 우클릭 > Build Path > Configure Build Path
				 > Add External JARs.. > 다운받은 드라이버 선택 > Apply and Close
*/

public class Ex01 {
	public static void main(String[] args) {
		
// 		1. JAVA를 Oracle에 접속할 수 있도록 도와주는 클래스 (DriverManager)
		Connection conn = null;
		
// 		2. SQL 작성, 구문 생성 (Connection)
		Statement stmt = null;
		
// 		3. SELECT문을 사용할 때 결과를 받는 클래스 (Statement)
		ResultSet rs = null;	// SELECT문의 결과값을 받을 때 사용
		int result = 0;			// INSERT, UPDATE, DELETE문의 결과값을 받을 때 사용
		
		
		try {
//		4. JDBC 드라이버 로딩 >>> Oracle, MySQL 등 각 DBMS마다 내용이 다름			
			Class.forName("oracle.jdbc.OracleDriver");
			
//		- Oracle에 접속하기 위한 정보 저장
			String url = "jdbc:oracle:thin:@203.236.220.76:1521:xe";
			String user = "C##sprite";
			String password = "7963";
			
//		5. Oracle 접속
			conn = DriverManager.getConnection(url, user, password);
			
//		6. SQL 쿼리 만들기
			String sql = "SELECT * FROM members";
			
//		7 SQL 쿼리를 담아서 보낼 구문 생성
			stmt = conn.createStatement();
			
//		8. 구문에 SQL을 담아서 보내고 결과를 받음 (ResultSet)
			
			// SQL문이 SELECT 일 때
			rs = stmt.executeQuery(sql);
				
			/* SQL문이 SELECT가 아닐 때
			*  	result = stmt.executeUpdate(sql);  
			*/
			
			while (rs.next()) {
				System.out.print(rs.getInt(1) 		+ "\t");
				System.out.print(rs.getString(2) 	+ "\t");
				System.out.print(rs.getString(3) 	+ "\t");
				System.out.print(rs.getString(4) 	+ "\t");
				System.out.print(rs.getInt(5) 		+ "\t");
				System.out.println(rs.getString(6));
				
				/*
				System.out.print(rs.getInt("idx") 		+ "\t");
				System.out.print(rs.getString("m_id") 	+ "\t");
				System.out.print(rs.getString("m_pw") 	+ "\t");
				System.out.print(rs.getString("m_name") + "\t");
				System.out.print(rs.getInt("m_age") 	+ "\t");
				System.out.println(rs.getString("m_reg"));  
				 */
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
