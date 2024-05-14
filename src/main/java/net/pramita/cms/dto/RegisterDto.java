package net.pramita.cms.dto;

public class RegisterDto {
			
		private String firstName;
	 
		private String lastName;
	 
		private String emailId;
	 
		private String password;
		
		private String role;
		
		
		
		
	 
		public RegisterDto() {
			super();
			// TODO Auto-generated constructor stub
		}

		public RegisterDto(String firstName, String lastName, String emailId, String password, String role) {
			super();
			this.firstName = firstName;
			this.lastName = lastName;
			this.emailId = emailId;
			this.password = password;
			this.role = role;
		}

		public String getFirstName() {
			return firstName;
		}
	 
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
	 
		public String getLastName() {
			return lastName;
		}
	 
		public void setLastName(String lastName) {
			this.lastName = lastName;
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
			return "RegisterDto [firstName=" + firstName + ", lastName=" + lastName + ", emailId=" + emailId + ", password="
					+ password + ", role=" + role + "]";
		}
	 
	}
	 
	

