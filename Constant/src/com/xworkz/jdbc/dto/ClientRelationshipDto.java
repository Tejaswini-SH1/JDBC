package com.xworkz.jdbc.dto;

public class ClientRelationshipDto {
	private int customer_id;
	private String full_name;
	private String password;
	private String address;
	private String email;
	private long phone_number;
	private String occupation;
	private int age;
	private String nationality;
	private String preferences;
	public ClientRelationshipDto(int customer_id, String full_name, String password, String address, String email,
			long phone_number, String occupation, int age, String nationality, String preferences) {
		super();
		this.customer_id = customer_id;
		this.full_name = full_name;
		this.password = password;
		this.address = address;
		this.email = email;
		this.phone_number = phone_number;
		this.occupation = occupation;
		this.age = age;
		this.nationality = nationality;
		this.preferences = preferences;
	}
	@Override
	public String toString() {
		return "CustomerRelationshipDto [customer_id=" + customer_id + ", full_name=" + full_name + ", password="
				+ password + ", address=" + address + ", email=" + email + ", phone_number=" + phone_number
				+ ", occupation=" + occupation + ", age=" + age + ", nationality=" + nationality + ", preferences="
				+ preferences + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + customer_id;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((full_name == null) ? 0 : full_name.hashCode());
		result = prime * result + ((nationality == null) ? 0 : nationality.hashCode());
		result = prime * result + ((occupation == null) ? 0 : occupation.hashCode());
		result = prime * result + ((password == null) ? 0 : password.hashCode());
		result = prime * result + (int) (phone_number ^ (phone_number >>> 32));
		result = prime * result + ((preferences == null) ? 0 : preferences.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (!(obj instanceof ClientRelationshipDto)) {
			return false;
		}
		ClientRelationshipDto other = (ClientRelationshipDto) obj;
		if (address == null) {
			if (other.address != null) {
				return false;
			}
		} else if (!address.equals(other.address)) {
			return false;
		}
		if (age != other.age) {
			return false;
		}
		if (customer_id != other.customer_id) {
			return false;
		}
		if (email == null) {
			if (other.email != null) {
				return false;
			}
		} else if (!email.equals(other.email)) {
			return false;
		}
		if (full_name == null) {
			if (other.full_name != null) {
				return false;
			}
		} else if (!full_name.equals(other.full_name)) {
			return false;
		}
		if (nationality == null) {
			if (other.nationality != null) {
				return false;
			}
		} else if (!nationality.equals(other.nationality)) {
			return false;
		}
		if (occupation == null) {
			if (other.occupation != null) {
				return false;
			}
		} else if (!occupation.equals(other.occupation)) {
			return false;
		}
		if (password == null) {
			if (other.password != null) {
				return false;
			}
		} else if (!password.equals(other.password)) {
			return false;
		}
		if (phone_number != other.phone_number) {
			return false;
		}
		if (preferences == null) {
			if (other.preferences != null) {
				return false;
			}
		} else if (!preferences.equals(other.preferences)) {
			return false;
		}
		return true;
	}
	public int getCustomer_id() {
		return customer_id;
	}
	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}
	public String getFull_name() {
		return full_name;
	}
	public void setFull_name(String full_name) {
		this.full_name = full_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhone_number() {
		return phone_number;
	}
	public void setPhone_number(long phone_number) {
		this.phone_number = phone_number;
	}
	public String getOccupation() {
		return occupation;
	}
	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getPreferences() {
		return preferences;
	}
	public void setPreferences(String preferences) {
		this.preferences = preferences;
	}
	public int getClient_id() {
		
		return 0;
	}

}
