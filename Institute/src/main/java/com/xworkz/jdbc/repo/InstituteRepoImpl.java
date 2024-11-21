package com.xworkz.jdbc.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.jdbc.constant.InstituteConstant;
import com.xworkz.jdbc.dto.InstituteDto;

public class InstituteRepoImpl implements InstituteRepo{

		@Override
		public boolean save(InstituteDto dto) {
			Connection connection = null;
			PreparedStatement prst = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			try {
				connection = DriverManager.getConnection(InstituteConstant.URL.getValue(),
						InstituteConstant.USERNAME.getValue(), InstituteConstant.PASSWORD.getValue());
				prst = connection.prepareStatement("insert into Institute_table values(?,?,?,?,?,?,?)");
				prst.setInt(1, dto.getId());
				prst.setString(2, dto.getName());
				prst.setString(3, dto.getEmail());
				prst.setString(4, dto.getPassword());
				prst.setString(5, dto.getAddress());
				prst.setLong(6, dto.getPhoneNumber());
				prst.setString(7, dto.getIndustryType());
				int value = prst.executeUpdate();
				if (value > 0) {
					System.out.println("saved");
					return true;
				} else {
					System.out.println("not saved");
					return false;
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return false;
		}
	//-------------------------------------------------
	//listById
		@Override
		public String getListById(int id) {
			String valid = null;
			Connection connection = null;
			PreparedStatement prepared = null;
			try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				e1.printStackTrace();
			}
			try {
				connection = DriverManager.getConnection(InstituteConstant.URL.getValue(),
						InstituteConstant.USERNAME.getValue(), InstituteConstant.PASSWORD.getValue());
				prepared = connection.prepareStatement("SELECT * FROM company_table WHERE id = ?");
				prepared.setInt(1, id);
				ResultSet set = prepared.executeQuery();
				if (set.next()) {
					int id1 = set.getInt("id");
					String name = set.getString("name");
					long phoneNo = set.getLong("phone_number");
					String email = set.getString("email");
					String password = set.getString("password");
					String address = set.getString("address");
					String industry = set.getString("industry_type");
					valid = "ID: " + id1 + ", Name: " + name + ", Phone: " + phoneNo + ", Email: " + email + ", Password: "
							+ password + ", Address: " + address + ", Industry: " + industry;
				} else {
					valid = "No data found for the given ID.";
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return valid;
		}
	//-----------------------------------------------
	//getEmailAndPassword
		@Override
		public String getEMailAndPassword(long phoneNumber) {
			
			String isvalid=null;
			Connection connection=null;
			   PreparedStatement prepared=null;
			 
			   try {
					Class.forName("com.mysql.cj.jdbc.Driver");
				} catch (ClassNotFoundException e1) {
					
					e1.printStackTrace();
				}
			   
			    try {
			    connection=DriverManager.getConnectionInstituteConstant.URL.getValue(),InstituteConstant.USERNAME.getValue(),InstituteConstant.PASSWORD.getValue());
				prepared=connection.prepareStatement("select name, email from Institute_table where phone_number = ?");
			          
				   prepared.setLong(1, phoneNumber);
		         
			        ResultSet set = prepared.executeQuery();
			      while(set.next()) {
			    	  String name = set.getString("name");
			            String email = set.getString("email");
			            isvalid = "Name: " + name + ", Email: " + email;
			    	  
			      }
			         
			    } 
			    catch (SQLException e) {
			        e.printStackTrace();
			    }
			return isvalid;
		}
	//---------------------------
	//email and password match
	public String  checkEmailPassword(String email, String password) {
	    
	    String valid =null;
	    try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			
			e1.printStackTrace();
		}
	    try {
	    Connection connection = DriverManager.getConnection(InstituteConstant.URL.getValue(),InstituteConstant.USERNAME.getValue(),InstituteConstant.PASSWORD.getValue());
	         PreparedStatement statement = connection.prepareStatement("select * from Institute_table where email = ? AND password = ?"); 
	        statement.setString(1, email);
	        statement.setString(2, password);
	        ResultSet resultSet = statement.executeQuery();
	    
	     
	            if (resultSet.next()) {
	            	valid="success";
	                System.out.println("Login successful");
	                
	            } else {
	            	
	                System.out.println("Invalid email or password");
	                
	            }
	        }
	     catch (SQLException e) {
	    	
	        e.printStackTrace();
	    }
	    return valid;
	}
	//--------------------------------------
	@Override
	public String deleteByName(String name) {
	    Connection connection = null;
	    PreparedStatement preparedStatement = null;
	    String message = null; 
	    
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	    } catch (ClassNotFoundException e1) {
	        e1.printStackTrace();
	    }
	    try {
	        connection = DriverManager.getConnection(InstituteConstant.URL.getValue(), 
	        		InstituteConstant.USERNAME.getValue(), 
	        		InstituteConstant.PASSWORD.getValue());
	        preparedStatement = connection.prepareStatement("delete from Institute_table where name = ?");
	        preparedStatement.setString(1, name);
	        int delete = preparedStatement.executeUpdate();
	        if (delete > 0) {
	            message = "Data deleted successfully";
	        } else {
	            message = "No record found with the provided name"; 
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	        message = "Error occurred while deleting data"; 
	    }
	    return message; 
	}
	//---------------------------------------------------
	public String updatedByEmail(String name,String address,String email) {
		String valid=null;
		Connection connection=null;
		PreparedStatement preparedStatement=null;
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
			} catch (ClassNotFoundException e1) {
				
				e1.printStackTrace();
			}
	    
	    try {
	    	connection = DriverManager.getConnection(InstituteConstant.URL.getValue(),InstituteConstant.USERNAME.getValue(),InstituteConstant.PASSWORD.getValue());
	   
	       preparedStatement = connection.prepareStatement("Update Institute_table set name=?, address=?  WHERE email = ?");
	       preparedStatement.setString(1,name);
	       preparedStatement.setString(2,address);
	       preparedStatement.setString(3,email);
	        
	        int update = preparedStatement.executeUpdate();
	        if (update > 0) {
	            System.out.println( " update successfully");
	        } else {
	            System.out.println("update is false");
	        }
	    } catch (SQLException e) {
	        e.printStackTrace();
	    }
	    return valid;
	}

}
