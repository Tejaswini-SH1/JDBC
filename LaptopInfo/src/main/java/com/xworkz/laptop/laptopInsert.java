package com.xworkz.laptop;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class laptopInsert {

	public static void main(String[] args) {
		
		
//		load Driver Class
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/laptopinfo";
		String userName="root";
		String psw="root";
		
		 String dataInsert="insert into info_laptop(id,laptopName,price,company)"
		 		+ " values(?,?,?,?)";

		
//		Connection
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		
		try {
			 connection=DriverManager.getConnection(url,userName,psw);
			 preparedStatement=  connection.prepareStatement(dataInsert);
		 preparedStatement.setInt(1, 4);
		 preparedStatement.setString(2, "macBook");
		 preparedStatement.setDouble(3, 255.45);
		 preparedStatement.setString(4, "Apple company");
		 preparedStatement.execute();
		
		System.out.println("Data saved");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				preparedStatement.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		

	}

}
