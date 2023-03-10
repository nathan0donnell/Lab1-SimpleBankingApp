package model;

public class User {
	private String username;
	private String password;
	private String first_name;
	private String last_name;
	private String mobile_number;
	
	public User(String username, String password, String first_name, String last_name, String mobile_number) {
		super();
		this.username = username;
		this.password = password;
		this.first_name = first_name;
		this.last_name = last_name;
		this.mobile_number = mobile_number;
	}
	
	public String toString() {
		return username + " " + password + " - " + "first name: " + first_name + " last name: " + last_name + " -  ContactNo: " + mobile_number; 
	}

	public String getUsername() {
		return username;
	}
	
	public void setUsername(String username) {
		this.username = username;
	}
	
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getFirstName() {
		return first_name;
	}
	
	public void setFirstName(String first_name) {
		this.first_name = first_name;
	}
	
	public String getLastName() {
		return last_name;
	}
	
	public void setLastName(String last_name) {
		this.last_name = last_name;
	}
	
	public String getMobileNumber() {
		return mobile_number;
	}
	
	public void setMobileNumber(String mobile_number) {
		this.mobile_number = mobile_number;
	}	
}
