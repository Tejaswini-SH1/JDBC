package com.xworkz.jdbc.EventManagementsConst;

public enum EventManagements {
	
     URL("jdbc:mysql://localhost:3306/EventManagements"),
     USER("root"),
     PASSWORD("root");
	
	private String value;
	
	private Consultancy(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

}
