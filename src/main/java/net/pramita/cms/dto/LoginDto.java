package net.pramita.cms.dto;


public class LoginDto {
	
	private String emailId;
	private String password;
	private String role;
	
	
	
	public LoginDto() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LoginDto(String emailId, String password, String role) {
		super();
		this.emailId = emailId;
		this.password = password;
		this.role = role;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	@Override
	public String toString() {
		return "LoginDto [emailId=" + emailId + ", password=" + password + ", role=" + role + "]";
	}
	
	
}
