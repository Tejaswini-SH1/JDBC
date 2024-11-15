package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.jdbc.constant.ClientRelationshipConstant;

public class AddressByNameRunner {
	
	public static void main(String[] args) {
		String addressQuery = "select address from customer where full_name='Revati A' and phone_number=8475694567";
		try (Connection connection = DriverManager.getConnection(ClientRelationshipConstant.URL.getValue(),
				ClientRelationshipConstant.USERNAME.getValue(), ClientRelationshipConstant.PASSWORD.getValue())) {
			PreparedStatement prst = connection.prepareStatement(addressQuery);
			ResultSet resultSet = prst.executeQuery();
			if (resultSet.next()) {
				String address = resultSet.getString("address");
				System.out.println("address: " + address);
			} else {
				System.out.println("no record found");
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}


}
