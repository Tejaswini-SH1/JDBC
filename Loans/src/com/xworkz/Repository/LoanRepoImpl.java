package com.xworkz.Repository;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.LoanConst.LoanDto.LoanRepo;

public abstract class LoanRepoImpl implements LoanRepo {
	
	private static final String LoanConst = null;

	@Override
	public boolean isSaved(LoanRepo dto) {
		Connection connection = null;
		PreparedStatement statement = null;
		boolean saved=false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("Invoking a Driver class");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		try {
			connection = DriverManager.getConnection(LoanConst.URL.getValue(),
					LoanConst.USER.getValue(), LoanConst.PASSWORD.getValue());
			statement = connection.prepareStatement("INSERT INTO loan_details values (?,?,?,?,?,?,?)");
			statement.setString(1, dto.getId());
			statement.setString(2, dto.getUserName());
			statement.setString(3, dto.getPhone());
			statement.setString(4, dto.getEmail());
			statement.setInt(5, dto.getExp());
			statement.setString(6, dto.getDep());
			statement.setInt(7, dto.getAge());
			int i = statement.executeUpdate();
			if (i > 0) {
				System.out.println("Connected");
				saved=true;
			} else {
				System.out.println("Not Connected");
				saved=false;
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return saved;
	}

	

}
