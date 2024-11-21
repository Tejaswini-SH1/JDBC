package com.xworkz.jdbc.repo;

import com.xworkz.jdbc.dto.InstituteDto;

public interface InstituteRepo {
	boolean save(InstituteDto dto);
	String getListById(int id);
	String getEMailAndPassword(long phoneNumber);
	String checkEmailPassword(String email, String password);
	String deleteByName(String name);
	String updatedByEmail(String name,String address,String email);


}
