package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.jdbc.constant.ClientRelationshipConstant;

public class EmailAndPasswordRunner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String emailAndPassword="select email,password from customer where phone_number=8769546789 and full_name='teja sh'";
		try (Connection connection = DriverManager.getConnection(ClientRelationshipConstant.URL.getValue(),
				ClientRelationshipConstant.USERNAME.getValue(), ClientRelationshipConstant.PASSWORD.getValue())) {
			
			PreparedStatement prst =connection.prepareStatement(emailAndPassword);
			ResultSet resultSet=prst.executeQuery();
			
			if(resultSet.next()) {
				String email=resultSet.getString("email");
				String pwd=resultSet.getString("password");
				System.out.println("Email:"+email);
				System.out.println("Password: "+pwd);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


	}

