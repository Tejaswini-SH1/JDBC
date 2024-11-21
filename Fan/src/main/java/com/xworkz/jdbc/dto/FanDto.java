package com.xworkz.jdbc.dto;

public class FanDto {
	private String companyName;
	private String material;
	private String color;
	private String size;
	public FanDto(String companyName, String material, String color, String size) {
		super();
		this.companyName = companyName;
		this.material = material;
		this.color = color;
		this.size = size;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getMaterial() {
		return material;
	}
	public void setMaterial(String material) {
		this.material = material;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSize() {
		return size;
	}
	public void setSize(String size) {
		this.size = size;
	}

}
