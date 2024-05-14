package net.pramita.cms.entity;

import java.util.List;





import jakarta.persistence.Column;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Builder;
//import lombok.AllArgsConstructor;
//import lombok.NoArgsConstructor;





@Entity
@Table(name = "Student")
public class Student {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "first_name")
	private String firstname;
	
	@Column(name="last_name")
	private String lastname;
	
	@Column(name = "email-id", nullable =false , unique =true)
	private String email;
    


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "unique_degree")
	private TechnicalDepartment technicalDepartment;

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



	public TechnicalDepartment getTechnicalDepartment() {
		return technicalDepartment;
	}

	public void setTechnicalDepartment(TechnicalDepartment technicalDepartment) {
		this.technicalDepartment = technicalDepartment;
	}



	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

public Student(int id, String firstname, String lastname, String email,
		TechnicalDepartment technicalDepartment) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.email = email;
//	this.tdegreeid = tdegreeid;
	this.technicalDepartment = technicalDepartment;
}

	
	
	

	
	}


