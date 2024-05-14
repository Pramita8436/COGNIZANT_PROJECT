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

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.security.access.prepost.PreAuthorize;

import net.pramita.cms.dto.Technicaldepartmentdto;
import net.pramita.cms.service.Technicaldepartmentservice;


@CrossOrigin("*")
@RestController
@RequestMapping("/api/technicaldepartment")
public class Technicaldepartmentcontroller {
	
	@Autowired
	private Technicaldepartmentservice technicaldepartmentservice;

	public Technicaldepartmentcontroller(Technicaldepartmentservice technicaldepartmentservice) {
		super();
		this.technicaldepartmentservice = technicaldepartmentservice;
	}
	
	//Add Students credentials in the table
//	@PreAuthorize("hasRole('ADMIN')")
	@PostMapping
		public ResponseEntity<Technicaldepartmentdto> createTechnicaldepartment(@RequestBody Technicaldepartmentdto technicaldepartmentdto){		
		
		Technicaldepartmentdto technicaldepartment_save =	technicaldepartmentservice.createTechnicaldepartment(technicaldepartmentdto);
		return new ResponseEntity<>(technicaldepartment_save,HttpStatus.CREATED);
		}
	
	//Get Student credential individually from the table
//	@PreAuthorize("hasAnyRole('ADMIN','USER')")
	@GetMapping("{id}")
	public ResponseEntity<Technicaldepartmentdto> gettechnicaldepartmentById(@PathVariable("id") int technicaldepartmentdto)
	{
		Technicaldepartmentdto technicaldepartment_dto = technicaldepartmentservice.gettechnicaldepartmentByid(technicaldepartmentdto);
	return ResponseEntity.ok(technicaldepartment_dto);
	}
	
	//Get All Student's List from the table
//	@PreAuthorize("hasAnyRole('ADMIN','USER')")
	@GetMapping
	public ResponseEntity<List<Technicaldepartmentdto>> getalltechnicaldepartment()
	{
		List<Technicaldepartmentdto> technicaldepartmentall = technicaldepartmentservice.getalltechnicaldepartment();
		return ResponseEntity.ok(technicaldepartmentall);
	}
	
	//Updating Student's table
//	@PreAuthorize("hasRole('ADMIN')")
	@PutMapping("{id}")
	public ResponseEntity<Technicaldepartmentdto> updatetechnicaldepartment(@PathVariable("id")int technicaldepartmentid, @RequestBody Technicaldepartmentdto updatedtechnicaldepartment)
	
	{
		Technicaldepartmentdto technicaldepartment_dto2 = technicaldepartmentservice.updatetechnicaldepartment(technicaldepartmentid, updatedtechnicaldepartment);
	return ResponseEntity.ok(technicaldepartment_dto2);
	}
	
	//Deleting of students credentials
//	@PreAuthorize("hasRole('ADMIN')")
	@DeleteMapping("{id}")
	public ResponseEntity<String> deletetechnicaldepartment(@PathVariable("id") int technicaldepartmentid)
	{
		technicaldepartmentservice.deletetechnicaldepartment(technicaldepartmentid);
		return ResponseEntity.ok(" Credentials have been deleted");
	}

	
	

}
