package com.xworkz.jdbc.constant;

public enum FanConstant {
	
     URL("jdbc:mysql://127.0.0.1:3306/FanConstant"),USER("root"),PASSWORD("root");
	 private String value;
	 private FanConstant(String value) {
		 
		 this.value=value;
	}
	public String getValue() {
		return value;
	}

}
