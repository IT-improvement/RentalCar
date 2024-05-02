package service.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DBConnection {
	public Connection conn;
	public PreparedStatement pstmt;
	public ResultSet rs;
	
	public DBConnection(){
		try {
			Context init = new InitialContext();
			DataSource source = (DataSource) init.lookup("java:comp/env/jdbc/RentServerDB");
			conn = source.getConnection();
			System.out.println("[DB연결 성공]");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[DB연결 실패]");
		}
	}
	
	public void close() {
		try {
			if(rs!=null) rs.close();
			if(pstmt!=null) pstmt.close();
			if(conn!=null) conn.close();
			System.out.println("[DB연결 해제 성공]");
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("[DB연결 해제 실패]");
		}
	}
}
