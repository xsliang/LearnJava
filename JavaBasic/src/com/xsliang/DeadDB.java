package com.xsliang;

import java.sql.*;

public class DeadDB {

	static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
	static final String DB_URL = "jdbc:mysql://localhost:3306/coreland_eip?useUnicode=true&useSSL=false&characterEncoding=UTF-8&pinGlobalTxToPhysicalConnection=true";

	// 数据库的用户名与密码，需要根据自己的设置
	static final String USER = "root";
	static final String PASS = "password";

	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/coreland_eip?useSSL=false&allowPublicKeyRetrieval=true&serverTimezone=UTC","root","password");

			// 执行查询
			System.out.println(" 实例化Statement对象...");
			stmt = conn.createStatement();
			String sql;
			sql = "select BYTES_ from ACT_GE_BYTEARRAY where id_='980298'";
			ResultSet rs = stmt.executeQuery(sql);
			String blobString ="";
			// 展开结果集数据库
			while (rs.next()) {
				// 通过字段检索
				Blob BYTES = rs.getBlob("BYTES_");
				blobString = new String(BYTES.getBytes(1, (int) BYTES.length()));//blob 转 String
			}
			// 完成后关闭
			rs.close();
			stmt.close();
			conn.close();
		} catch (SQLException se) {
			// 处理 JDBC 错误
			se.printStackTrace();
		} catch (Exception e) {
			// 处理 Class.forName 错误
			e.printStackTrace();
		} finally {
			// 关闭资源
			try {
				if (stmt != null)
					stmt.close();
			} catch (SQLException se2) {
			} // 什么都不做
			try {
				if (conn != null)
					conn.close();
			} catch (SQLException se) {
				se.printStackTrace();
			}
		}
		System.out.println("Goodbye!");
	}
}
