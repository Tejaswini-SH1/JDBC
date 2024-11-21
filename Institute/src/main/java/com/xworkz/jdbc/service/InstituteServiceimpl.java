package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.InstituteDto;
import com.xworkz.jdbc.repo.InstituteRepoImpl;

public class InstituteServiceimpl implements InstituteService {
		@Override
		public boolean validate(InstituteDto dto) {
			InstituteRepoImpl impl = new InstituteRepoImpl();
			impl.save(dto);
			return true;
		}
		@Override
		public String getListById(int id) {
			InstituteRepoImpl repo = new InstituteRepoImpl();
			return repo.getListById(id);
		}
		@Override
		public String getEMailAndPassword(long phoneNumber) {
			InstituteRepoImpl repo = new InstituteRepoImpl();
			return repo.getEMailAndPassword(phoneNumber);
		}
		@Override
		public String checkEmailPassword(String email, String password) {
			String valid = null;
			InstituteRepoImpl InstituteRepoImpl = new InstituteRepoImpl();
			String res = InstituteRepoImpl.checkEmailPassword(email, password);
			return res;
		}
		@Override
		public String deleteByName(String name) {
			InstituteRepoImpl InstituteRepoImpl = new InstituteRepoImpl();
			String res = InstituteRepoImpl.deleteByName(name);
			return res;
		}
		@Override
		public String updatedByEmail(String name,String address,String email) {
			String valid=null;
			InstituteRepoImpl InstituteRepoImpl = new InstituteRepoImpl();
		       String res = InstituteRepoImpl.updatedByEmail(name,address,email);
			return valid;
		
		
		}

}
