package net.pramita.cms.mapper;

import net.pramita.cms.dto.Studentdto;

import net.pramita.cms.entity.Student;

public class StudentMapper{
	
	public static Studentdto maptoStudentdto(Student student)
	{
		return new Studentdto(
				
				student.getId(),
				student.getFirstname(),
				student.getLastname(),
				student.getEmail(),
//				student.getTdegreeid(),
				student.getTechnicalDepartment().getTdegreeid());
//				student.getNonTechnicalDepartment());
	}
	
	public static Student mapToStudent(Studentdto studentdto)
	{
		Student student = new Student();
student.setId(studentdto.getId());
student.setFirstname(studentdto.getFirstname());
student.setLastname(studentdto.getLastname());
student.setEmail(studentdto.getEmail());
		return student;
	}
}
