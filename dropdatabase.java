package curdoperations;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class dropdatabase {
	
public static void main(String[] args) {
	try {
		Scanner scr=new Scanner(System.in);
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3307/","root","root");
		String sql="drop database emp";
		PreparedStatement pmst=conn.prepareStatement(sql);
		pmst.executeUpdate();
		pmst.close();
		conn.close();
		System.out.println("dropped database");
		
	} catch (Exception e) {
		System.out.println("error");
	}
}
}
