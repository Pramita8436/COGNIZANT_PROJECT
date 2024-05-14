package net.pramita.cms.service;


import java.util.List;

import net.pramita.cms.dto.Technicaldepartmentdto;

public interface Technicaldepartmentservice {
	
	Technicaldepartmentdto createTechnicaldepartment(Technicaldepartmentdto technicaldepartmentdto);

	
	Technicaldepartmentdto gettechnicaldepartmentByid(int technicaldepartmentid);

	List<Technicaldepartmentdto> getalltechnicaldepartment();

	Technicaldepartmentdto updatetechnicaldepartment(int technicaldepartmentid, Technicaldepartmentdto updatedtechnicaldepartment );

	void deletetechnicaldepartment(int technicaldepartmentid);
	}

	
	


