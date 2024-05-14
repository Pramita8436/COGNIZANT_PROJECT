package net.pramita.cms.service.implementation;

import org.springframework.stereotype.Service;


//import net.pramita.cms.entity.TeachingBlock;
import net.pramita.cms.exception.ResourceNotFoundException;
//import net.pramita.cms.mapper.Teachingblockmapper;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;


import net.pramita.cms.dto.Technicaldepartmentdto;
import net.pramita.cms.entity.TechnicalDepartment;
import net.pramita.cms.exception.ResourceNotFoundException;
import net.pramita.cms.mapper.Technicaldepartmentmapper;
import net.pramita.cms.repository.TechnicaldepartmentRepository;
import net.pramita.cms.service.Technicaldepartmentservice;

@Service
public class Technicaldepartmentserviceimplentation implements Technicaldepartmentservice {
	
	@Autowired
	private TechnicaldepartmentRepository technicaldepartmentrepository;
	
	public Technicaldepartmentserviceimplentation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Technicaldepartmentserviceimplentation(TechnicaldepartmentRepository technicaldepartmentrepository) {
		super();
		this.technicaldepartmentrepository = technicaldepartmentrepository;
	}

	@Override
	public Technicaldepartmentdto createTechnicaldepartment(Technicaldepartmentdto technicaldepartmentdto) {
		// TODO Auto-generated method stub
		TechnicalDepartment technicaldepartment = Technicaldepartmentmapper.maptoTechnicalDepartment(technicaldepartmentdto);
		
		TechnicalDepartment technical_department =	technicaldepartmentrepository.save(technicaldepartment);
		
		
		return Technicaldepartmentmapper.maptoTechnicaldepartmentdto(technical_department);
	}

	@Override
	public Technicaldepartmentdto gettechnicaldepartmentByid(int technicaldepartmentid) {
		// TODO Auto-generated method stub
		TechnicalDepartment technicaldepartment = technicaldepartmentrepository.findById(technicaldepartmentid)
				.orElseThrow(() -> new ResourceNotFoundException("This doesn't exist with the given ID:" + technicaldepartmentid));
				return Technicaldepartmentmapper.maptoTechnicaldepartmentdto(technicaldepartment);
	}

	@Override
	public List<Technicaldepartmentdto> getalltechnicaldepartment() {
		// TODO Auto-generated method stub
		
		List<TechnicalDepartment> technicaldepartmentall =	technicaldepartmentrepository.findAll();
		return technicaldepartmentall.stream().map((technicaldepartmentlist)-> Technicaldepartmentmapper.maptoTechnicaldepartmentdto(technicaldepartmentlist))
		.collect(Collectors.toList());
         }

	@Override
	public Technicaldepartmentdto updatetechnicaldepartment(int technicaldepartmentid,
			Technicaldepartmentdto updatedtechnicaldepartment) {
		
		// TODO Auto-generated method stub
		
		TechnicalDepartment technicaldepartment_update =	technicaldepartmentrepository.findById(technicaldepartmentid).orElseThrow(
				() -> new ResourceNotFoundException("This doesn't exist with given Id:" + technicaldepartmentid));
		
		//technicaldepartment_update.setTdegreeid(updatedtechnicaldepartment.getTdegreeid());
		technicaldepartment_update.setTdegreename(updatedtechnicaldepartment.getTdegreename());
	  
		TechnicalDepartment newupdatedtechnicaldepartment = technicaldepartmentrepository.save(technicaldepartment_update);
	  
	  return Technicaldepartmentmapper.maptoTechnicaldepartmentdto(newupdatedtechnicaldepartment);
		
	}

	@Override
	public void deletetechnicaldepartment(int technicaldepartmentid) {
		// TODO Auto-generated method stub
		TechnicalDepartment technicaldepartment_update =	technicaldepartmentrepository.findById(technicaldepartmentid).orElseThrow(
				() -> new ResourceNotFoundException("This doesn't exist with given Id:" + technicaldepartmentid));
		technicaldepartmentrepository.deleteById(technicaldepartmentid);

		
		
	}

}
