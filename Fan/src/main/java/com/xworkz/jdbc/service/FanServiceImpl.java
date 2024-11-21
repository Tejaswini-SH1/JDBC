package com.xworkz.jdbc.service;

import com.xworkz.jdbc.dto.FanDto;
import com.xworkz.jdbc.repo.FanRepoImpl;

public class FanServiceImpl implements FanService{
	@Override
	public boolean save(FanDto dto) {
		
		boolean isValid=true;
		System.out.println("company name==="+dto.getCompanyName());
		System.out.println("material=="+dto.getMaterial());
		System.out.println("color=="+dto.getColor());
		System.out.println("size=="+dto.getSize());
		
		if(isValid) {
		FanRepoImpl impl=new FanRepoImpl();
		impl.update(dto);
			
		}
		
		return false;
	}

}
