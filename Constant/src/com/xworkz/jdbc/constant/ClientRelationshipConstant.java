package com.xworkz.jdbc.constant;

public enum ClientRelationshipConstant {
URL("jdbc:mysql://127.0.0.1/client_relationship_management"),USERNAME("root"),PASSWORD("Tez@123");
	
	private String value;
	
	private ClientRelationshipConstant(String value) {
		this.value=value;
	}
	public String getValue() {
		return value;
	}

}
