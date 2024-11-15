package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.jdbc.constant.ClientRelationshipConstant;

public class SelectAllRunner {

	public static void main(String[] args) {
		String selectAllQuery = "select * from client";
		try (Connection connection = DriverManager.getConnection(ClientRelationshipConstant.URL.getValue(),
				ClientRelationshipConstant.USERNAME.getValue(), ClientRelationshipConstant.PASSWORD.getValue())) {
			PreparedStatement prst = connection.prepareStatement(selectAllQuery);
			ResultSet resultSet = prst.executeQuery(selectAllQuery);
			while (resultSet.next()) {
				System.out.println("Client_ID: " + resultSet.getInt("client_id"));
				System.out.println("Full Name" + resultSet.getString("full_name"));
				System.out.println("password: " + resultSet.getString("password"));
				System.out.println("address: " + resultSet.getString("address"));
				System.out.println("email: " + resultSet.getString("email"));
				System.out.println("phone_number: " + resultSet.getString("phone_number"));
				System.out.println("occupation: " + resultSet.getString("occupation"));
				System.out.println("age: " + resultSet.getInt("age"));
				System.out.println("nationality: " + resultSet.getString("nationality"));
				System.out.println("preferences: " + resultSet.getString("preferences"));
				System.out.println("-----------------------------");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}


	}

}
