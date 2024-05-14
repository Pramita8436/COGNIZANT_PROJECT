package net.pramita.cms.dto;

import java.util.List;




//import net.pramita.cms.entity.NonTechnicalDepartment;
//import net.pramita.cms.entity.TeachingBlock;
import net.pramita.cms.entity.TechnicalDepartment;

public class Studentdto {
	
	

	
	private int id;
	private String firstname;
	private String lastname;
	private String email;
	private int degreeid;
    


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}




	public Studentdto() {
		super();
		// TODO Auto-generated constructor stub
	}



public int getDegreeid() {
	return degreeid;
}

public void setDegreeid(int degreeid) {
	this.degreeid = degreeid;
}
public Studentdto(int id, String firstname, String lastname, String email, int degreeid) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
	this.degreeid = degreeid;
}
	
	

	
	}
	
  
	
	

