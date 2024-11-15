package com.xworkz.jdbc.runner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.jdbc.constant.ClientRelationshipConstant;
import com.xworkz.jdbc.dto.ClientRelationshipDto;

public class ClientRelationshipRunner {

	public static void main(String[] args) {
		ClientRelationshipDto dto1 = new ClientRelationshipDto(1, "Tez Sh", "password123", "Chicago",
				"tejash@gmail.com", 9996543210L, "US", 50, "Indian", "web");
		ClientRelationshipDto dto2 = new ClientRelationshipDto(2, "Revati", "secure456", "Sydney",
				"Revati@gmail.com", 7665432109L, "Australia", 45, "Indian", "Networking");
		ClientRelationshipDto dto3 = new ClientRelationshipDto(3, "Pooja", "password789",
				"12 RR nagar", "pooja@gmail.com", 7654321098L, "analyst", 45, "Germany", "Berlin");
		ClientRelationshipDto dto4 = new ClientRelationshipDto(4, "Pooja", "password123", "Hamburg",
				"pooja@gmail.com", 6543210987L, "Germany", 32, "Germany", "web");
		ClientRelationshipDto dto5 = new ClientRelationshipDto(5, "keerthi", "mypassword456", "Frankfurt",
				"keerthi@gmail.com", 5432109876L, "China", 38, "Indian", "networking");
		ClientRelationshipDto dto6 = new ClientRelationshipDto(6, "Sushmita", "secure789", "Dresden",
				"sushmita@gmail.com", 4321098765L, "Uk", 33, "Indian", "web");
		ClientRelationshipDto dto7 = new ClientRelationshipDto(7, "Rohini", "pass1234", "Cologne",
				"rohini@gmail.com", 3210987654L, "Southkorea", 29, "Indian", "London");
		ClientRelationshipDto dto8 = new ClientRelationshipDto(8, "Asha", "securepass456", "Munster",
				"asha@gmail.com", 2109876543L, "India", 30, "Indian", "networking");
		ClientRelationshipDto dto9 = new ClientRelationshipDto(9, "Seema", "mypassword789", "Dortmund",
				"seema@gmail.com", 1098765432L, "US", 28, "Indian", "web");
		ClientRelationshipDto dto10 = new ClientRelationshipDto(10, "Rekha", "passwordsecure123",
				"707 HSR Layout", "rekha@gmail.com", 5678543290L, "Designer", 31, "Indian", "Bonn");
		try (Connection connection = DriverManager.getConnection(ClientRelationshipConstant.URL.getValue(),
				ClientRelationshipConstant.USERNAME.getValue(), ClientRelationshipConstant.PASSWORD.getValue())) {
			PreparedStatement prst = connection
					.prepareStatement("insert into client values(?,?,?,?,?,?,?,?,?,?)");
			prst.setInt(1, dto1.getClient_id());
			prst.setString(2, dto1.getFull_name());
			prst.setString(3, dto1.getPassword());
			prst.setString(4, dto1.getAddress());
			prst.setString(5, dto1.getEmail());
			prst.setLong(6, dto1.getPhone_number());
			prst.setString(7, dto1.getOccupation());
			prst.setInt(8, dto1.getAge());
			prst.setString(9, dto1.getNationality());
			prst.setString(10, dto1.getPreferences());
			prst.addBatch();
			prst.setInt(1, dto2.getClient_id());
			prst.setString(2, dto2.getFull_name());
			prst.setString(3, dto2.getPassword());
			prst.setString(4, dto2.getAddress());
			prst.setString(5, dto2.getEmail());
			prst.setLong(6, dto2.getPhone_number());
			prst.setString(7, dto2.getOccupation());
			prst.setInt(8, dto2.getAge());
			prst.setString(9, dto2.getNationality());
			prst.setString(10, dto2.getPreferences());
			prst.addBatch();
			prst.setInt(1, dto3.getClient_id());
			prst.setString(2, dto3.getFull_name());
			prst.setString(3, dto3.getPassword());
			prst.setString(4, dto3.getAddress());
			prst.setString(5, dto3.getEmail());
			prst.setLong(6, dto3.getPhone_number());
			prst.setString(7, dto3.getOccupation());
			prst.setInt(8, dto3.getAge());
			prst.setString(9, dto3.getNationality());
			prst.setString(10, dto3.getPreferences());
			prst.addBatch();
			prst.setInt(1, dto4.getClient_id());
			prst.setString(2, dto4.getFull_name());
			prst.setString(3, dto4.getPassword());
			prst.setString(4, dto4.getAddress());
			prst.setString(5, dto4.getEmail());
			prst.setLong(6, dto4.getPhone_number());
			prst.setString(7, dto4.getOccupation());
			prst.setInt(8, dto4.getAge());
			prst.setString(9, dto4.getNationality());
			prst.setString(10, dto4.getPreferences());
			prst.addBatch();
			prst.setInt(1, dto5.getClient_id());
			prst.setString(2, dto5.getFull_name());
			prst.setString(3, dto5.getPassword());
			prst.setString(4, dto5.getAddress());
			prst.setString(5, dto5.getEmail());
			prst.setLong(6, dto5.getPhone_number());
			prst.setString(7, dto5.getOccupation());
			prst.setInt(8, dto5.getAge());
			prst.setString(9, dto5.getNationality());
			prst.setString(10, dto5.getPreferences());
			prst.addBatch();
			prst.setInt(1, dto6.getClient_id());
			prst.setString(2, dto6.getFull_name());
			prst.setString(3, dto6.getPassword());
			prst.setString(4, dto6.getAddress());
			prst.setString(5, dto6.getEmail());
			prst.setLong(6, dto6.getPhone_number());
			prst.setString(7, dto6.getOccupation());
			prst.setInt(8, dto6.getAge());
			prst.setString(9, dto6.getNationality());
			prst.setString(10, dto6.getPreferences());
			prst.addBatch();
			prst.setInt(1, dto7.getClient_id());
			prst.setString(2, dto7.getFull_name());
			prst.setString(3, dto7.getPassword());
			prst.setString(4, dto7.getAddress());
			prst.setString(5, dto7.getEmail());
			prst.setLong(6, dto7.getPhone_number());
			prst.setString(7, dto7.getOccupation());
			prst.setInt(8, dto7.getAge());
			prst.setString(9, dto7.getNationality());
			prst.setString(10, dto7.getPreferences());
			prst.addBatch();
			prst.setInt(1, dto8.getClient_id());
			prst.setString(2, dto8.getFull_name());
			prst.setString(3, dto8.getPassword());
			prst.setString(4, dto8.getAddress());
			prst.setString(5, dto8.getEmail());
			prst.setLong(6, dto8.getPhone_number());
			prst.setString(7, dto8.getOccupation());
			prst.setInt(8, dto8.getAge());
			prst.setString(9, dto8.getNationality());
			prst.setString(10, dto8.getPreferences());
			prst.addBatch();
			prst.setInt(1, dto9.getClient_id());
			prst.setString(2, dto9.getFull_name());
			prst.setString(3, dto9.getPassword());
			prst.setString(4, dto9.getAddress());
			prst.setString(5, dto9.getEmail());
			prst.setLong(6, dto9.getPhone_number());
			prst.setString(7, dto9.getOccupation());
			prst.setInt(8, dto9.getAge());
			prst.setString(9, dto9.getNationality());
			prst.setString(10, dto9.getPreferences());
			prst.addBatch();
			prst.setInt(1, dto10.getClient_id());
			prst.setString(2, dto10.getFull_name());
			prst.setString(3, dto10.getPassword());
			prst.setString(4, dto10.getAddress());
			prst.setString(5, dto10.getEmail());
			prst.setLong(6, dto10.getPhone_number());
			prst.setString(7, dto10.getOccupation());
			prst.setInt(8, dto10.getAge());
			prst.setString(9, dto10.getNationality());
			prst.setString(10, dto10.getPreferences());
			prst.addBatch();
            prst.executeBatch();
			
			System.out.println("values are inserted");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	}


