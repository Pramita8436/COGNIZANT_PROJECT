package net.pramita.cms.entity;

import java.util.List;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Builder;

@Entity
@Table(name = "Technical_Department")
public class TechnicalDepartment {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int tdegreeid;
	
	@Column(name =  "tdegreename")
	private String tdegreename;


	
	
	public TechnicalDepartment() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	



	public TechnicalDepartment(int tdegreeid, String tdegreename) {
		super();
		this.tdegreeid = tdegreeid;
		this.tdegreename = tdegreename;
//		this.student = student;
	}





//	public List<Student> getStudent() {
//		return student;
//	}
//
//
//
//
//
//	public void setStudent(List<Student> student) {
//		this.student = student;
//	}





	public int getTdegreeid() {
		return tdegreeid;
	}


	public void setTdegreeid(int tdegreeid) {
		this.tdegreeid = tdegreeid;
	}


	public String getTdegreename() {
		return tdegreename;
	}


	public void setTdegreename(String tdegreename) {
		this.tdegreename = tdegreename;
	}
	
	
	
	

//	}
//	
	
	
	
	
	
}
