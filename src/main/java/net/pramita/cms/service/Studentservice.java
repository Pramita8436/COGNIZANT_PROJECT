package net.pramita.cms.service;


import java.util.List;


import net.pramita.cms.dto.Studentdto;

public interface Studentservice {
	Studentdto createStudent(Studentdto studentdto);

	
Studentdto getstudentByid(int studentid);

List<Studentdto> getallstudent();

Studentdto updatestudent(int studentid, Studentdto updatedstudent );

void deletestudent(int studentid);
}
	
	


