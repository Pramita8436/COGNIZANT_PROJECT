package net.pramita.cms.controller;

import org.springframework.web.bind.annotation.CrossOrigin;


import org.springframework.web.bind.annotation.DeleteMapping;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import lombok.Builder;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import net.pramita.cms.dto.Studentdto;
import net.pramita.cms.service.Studentservice;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/student")
public class Studentcontroller {
	
	private Studentservice studentservice;

	public Studentcontroller(Studentservice studentservice) {
		super();
		this.studentservice = studentservice;
	}
	
//	//Add Students credentials in the table
//	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping
		public ResponseEntity<Studentdto> createStudent(@RequestBody Studentdto studentdto){		
		
		Studentdto student_save =	studentservice.createStudent(studentdto);
		return new ResponseEntity<>(student_save,HttpStatus.CREATED);
		}
	
	//Get Student credential individually from the table
//	@PreAuthorize("hasAnyRole('ADMIN','USER')")
	@GetMapping("{id}")
	public ResponseEntity<Studentdto> getstudentid(@PathVariable("id") int studentid)
	{
	Studentdto student_dto =	studentservice.getstudentByid(studentid);
	return ResponseEntity.ok(student_dto);
	}
	
	//Get All Student's List from the table
//	@PreAuthorize("hasAnyRole('ADMIN','USER')")
	@GetMapping
	public ResponseEntity<List<Studentdto>> getallstudent()
	{
		List<Studentdto> studentall = studentservice.getallstudent();
		return ResponseEntity.ok(studentall);
	}
	
	//Updating Student's table
//	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("{id}")
	public ResponseEntity<Studentdto> updatestudent(@PathVariable("id")int studentid, @RequestBody Studentdto updatedstudent)
	
	{
	Studentdto student_dto2 = studentservice.updatestudent(studentid, updatedstudent);
	return ResponseEntity.ok(student_dto2);
	}
	
	//Deleting of students credentials
//	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("{id}")
	public ResponseEntity<String> deletestudent(@PathVariable("id") int studentid)
	{
		studentservice.deletestudent(studentid);
		return ResponseEntity.ok("Student's Credentials have been deleted");
	}
	}
	
	


