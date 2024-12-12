package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class createdatabase {
	private static final String str="com.mysql.cj.jdbc.Driver";
	private static final String url="jdbc:mysql://localhost:3307/";
	private static final  String username="root";
	private static final String password="root";
	private static  Connection conn; 
	private static  PreparedStatement psmt;
	
	public static void main(String[] args) {
		try {
			Class.forName(str);
			Connection conn=DriverManager.getConnection(url,username,password);
			String sql="create database emp";
			PreparedStatement psmt=conn.prepareStatement(sql);
			 int i=psmt.executeUpdate();
			psmt.close();
			conn.close();
			if (i>0) {
			System.out.println("created.");
			}
			else {
			System.out.println("error.");
		}
		}
		catch (Exception e) {
				System.out.println("not created");
			}
		}
}


