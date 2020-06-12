package com.ict.edu5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

/*
 [DAO] (Data Access Object)
- 데이터베이스 내 데이터에 접근하기 위한 객체
- CRUC 작업을 처리하는 메소드를 만들어 제공
 (CRUC 작업: INSERT, UPDATE, DELETE, SELECT 작업)
*/
 
public class DAO {

	Connection conn;
	PreparedStatement pstmt;
	ResultSet rs;
	int res;
	
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
	public ArrayList<VO> getSelect() {
		
		// VO를 담을 컬렉션 생성
		ArrayList<VO> list = new ArrayList<VO>();
		
		try {
			
			conn = getConnection();
			String sql = "SELECT * FROM members ORDER BY idx";
			
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				
				VO vo = new VO();
				
				vo.setIdx(rs.getString(1));
				vo.setM_id(rs.getString(2));
				vo.setM_pw(rs.getString(3));
				vo.setM_name(rs.getString(4));
				vo.setM_age(rs.getString(5));
				vo.setM_reg(rs.getString(6).substring(0, 10));
				
				list.add(vo);
			}
			
			return list;
			
			// 출력은 Ex01 main메소드에서 실행

		} catch (Exception e) {
		} finally {
			try {
				rs.close();
				pstmt.close();
				conn.close();
			} catch (Exception e2) {
			}
		}
		
		return list;
		
	}
	
	// INSERT문
	public ArrayList<VO> getInsert(String new_id, String new_pw, String new_name, String new_age) {
		
		Scanner sc = new Scanner(System.in);
		
		ArrayList<VO> list = null;
		
		try {
			
			conn = getConnection();
			String sql = "INSERT INTO members VALUES(members_seq.nextval, new_id, new_pw, new_name, new_age, SYSDATE)";
			
			pstmt = conn.prepareStatement(sql);
			res = pstmt.executeUpdate();
			
			// 변경 내용 확인하기
			if (res > 0) {
				getSelect();
			} else {
				System.out.println("데이터 삽입 실패");
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
		
		return list;
		
	}
	
	// DELETE문
	public ArrayList<VO> getDelete(String del_id) {
		
		ArrayList<VO> list = null;
		
		try {
			
			conn = getConnection();
			String sql = "DELETE FROM members WHERE m_id = '" + del_id + "'";
			
			pstmt = conn.prepareStatement(sql);
			res = pstmt.executeUpdate();
			
			// 변경 내용 확인하기
			if (res > 0) {
				System.out.println("데이터 삭제 성공");
				list = getSelect();
			} else {
				System.out.println("데이터 삭제 실패");
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
		
		return list;
		
	}
	
	// UPDATE문
	public ArrayList<VO> getUpdate(String re_age, String re_idx) {
		
		ArrayList<VO> list = null;
		
		try {
			conn = getConnection();
			String sql = "UPDATE members SET m_age = '" + re_age + "' WHERE idx = '" + re_idx + "'";
			
			pstmt = conn.prepareStatement(sql);
			res = pstmt.executeUpdate();
			
			// 변경 내용 확인하기
			if (res > 0) {
				System.out.println("데이터 갱신 성공");
				list = getSelect();
			} else {
				System.out.println("데이터 갱신 실패");
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
		
		return list;
		
	}
	
}