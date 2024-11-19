package com.xworkz.loanService;

import com.xworkz.Repository.LoanRepoImpl;
import com.xworkz.loanCons.LoanDTO;

public class LoanServiceImpl implements LoanService {
	@Override
	public boolean save(LoanDTO dto) {
		boolean verify=true;
		if (dto != null) {
			String id = dto.getId();
			if (!(id.length() == 1 && id.startsWith("1")))
			 {
				System.out.println("In-Valid id");
				verify=false;
			}
			
			
      	String userName = dto.getUserName();
			if (userName == null && userName.length() < 3 && userName.length() > 14) {
				System.out.println("In-Valid User Name");
				verify=false;
			}
			String phone = dto.getPhone();
			if (!(phone.length() == 10 && phone.startsWith("9"))) {
				System.out.println("In-Valid Phone Number");
				verify=false;
			}
			String email= dto.getEmail();
			if(email == null && !(email.contains("@") && email.endsWith(".com") && email.indexOf('@')==8)) {
				System.out.println("In-Valid Email");
				verify=false;
			}
			int exp=dto.getExp();
			if(exp <1) {
				System.out.println("In-Valid Experience");
				verify=false;
			}
			int age= dto.getAge();
			if(age<19) {
				System.out.println("In-Valid Age");
				verify=false;
			}
		}
		if(verify) {
			LoanRepoImpl repoImpl= new LoanRepoImpl();
			return repoImpl.isSaved(dto);
		}else {
			System.err.println("Not Valid Data");
			return false;
		}}
	

}
