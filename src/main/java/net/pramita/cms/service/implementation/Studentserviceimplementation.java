package net.pramita.cms.service.implementation;

import org.springframework.stereotype.Service;



import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;


import net.pramita.cms.dto.Studentdto;
import net.pramita.cms.entity.Student;
import net.pramita.cms.entity.TechnicalDepartment;
import net.pramita.cms.exception.ResourceNotFoundException;
import net.pramita.cms.mapper.StudentMapper;
import net.pramita.cms.repository.StudentRepository;
import net.pramita.cms.repository.TechnicaldepartmentRepository;
import net.pramita.cms.service.Studentservice;

@Service
public class Studentserviceimplementation implements Studentservice{

	@Autowired
	private StudentRepository studentrepository;
	
@Autowired
private TechnicaldepartmentRepository technicaldepartmentrepository;
	
	public Studentserviceimplementation(StudentRepository studentrepository) {
		super();
		this.studentrepository = studentrepository;
	}



	public Studentserviceimplementation(TechnicaldepartmentRepository technicaldepartmentrepository) {
		super();
		this.technicaldepartmentrepository = technicaldepartmentrepository;
	}



	public Studentserviceimplementation() {
		super();
		// TODO Auto-generated constructor stub
	}



	@Override
	public Studentdto createStudent(Studentdto studentdto) {
		// TODO Auto-generated method stub
		
Student student = StudentMapper.mapToStudent(studentdto);
		
TechnicalDepartment technicaldepartment = technicaldepartmentrepository.findById(studentdto.getDegreeid()).orElseThrow(() -> new ResourceNotFoundException("Status does not exist" + studentdto.getDegreeid()));
	
student.setTechnicalDepartment(technicaldepartment);

Student student_save =	studentrepository.save(student);
	 
		
		return StudentMapper.maptoStudentdto(student_save);
	}
	
	@Override
	public Studentdto getstudentByid(int studentid)
	{
		Student student = studentrepository.findById(studentid)
		.orElseThrow(() -> new ResourceNotFoundException("Student doesn't exist with the given ID:" + studentid));
		return StudentMapper.maptoStudentdto(student);
	}
	
	@Override
	public List<Studentdto> getallstudent()
	{
	List<Student> studentall =	studentrepository.findAll();
	return studentall.stream().map((studentlist)-> StudentMapper.maptoStudentdto(studentlist))
	.collect(Collectors.toList());
	}
	
	@Override
	public Studentdto updatestudent(int studentid, Studentdto updatedstudent) 
	{
	Student student_update =	studentrepository.findById(studentid).orElseThrow(
				() -> new ResourceNotFoundException("Student doesn't exist with given Id:" + studentid));
		
	  student_update.setFirstname(updatedstudent.getFirstname());
	  student_update.setLastname(updatedstudent.getLastname());
	  student_update.setEmail(updatedstudent.getEmail());
	  
	  
	  TechnicalDepartment technicaldepartment = technicaldepartmentrepository.findById(updatedstudent.getDegreeid()).orElseThrow(() -> new ResourceNotFoundException("Status does not exist" + updatedstudent.getDegreeid()));
		
	  student_update.setTechnicalDepartment(technicaldepartment);
	  
	  Student newupdatedstudent = studentrepository.save(student_update);
	  
	  return StudentMapper.maptoStudentdto(newupdatedstudent);
	  
	}
	
	@Override
	public void deletestudent(int studentid)
	{
		Student student_update =	studentrepository.findById(studentid).orElseThrow(
				() -> new ResourceNotFoundException("Student doesn't exist with given Id:" + studentid));
		studentrepository.deleteById(studentid);
		
		
		
	}
}


