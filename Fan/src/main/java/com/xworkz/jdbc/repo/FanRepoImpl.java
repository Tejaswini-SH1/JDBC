package com.xworkz.jdbc.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.jdbc.constant.FanConstant;
import com.xworkz.jdbc.dto.FanDto;

public class FanRepoImpl implements Fanrepo{
		public boolean update(FanDto dto) {
			
			boolean saved=false;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				
				e1.printStackTrace();
			}	
			
			
			try (Connection connection = DriverManager.getConnection(FanConstant.URL.getValue(),
					FanConstant.USER.getValue(), FanConstant.PASSWORD.getValue())) {
			PreparedStatement prst = connection.prepareStatement("insert into Fan_table values(?,?,?,?)");
			prst.setString(1, dto.getCompanyName());
			prst.setString(2, dto.getMaterial());
			prst.setString(3, dto.getColor());
			prst.setString(4, dto.getSize());
			
			int value=prst.executeUpdate();
			if(value>0) {
				System.out.println("saved");
				saved=true;
			}
			else {
				System.out.println("not saved");
				saved=false;
				
			}
		}
		catch (SQLException e) {
			e.printStackTrace();
		}	
			return false;
		}

}
