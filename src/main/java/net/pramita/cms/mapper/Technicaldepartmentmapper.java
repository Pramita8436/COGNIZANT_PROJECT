package net.pramita.cms.mapper;

import net.pramita.cms.dto.Technicaldepartmentdto;
import net.pramita.cms.entity.TechnicalDepartment;

public class Technicaldepartmentmapper {
	
	public static Technicaldepartmentdto maptoTechnicaldepartmentdto(TechnicalDepartment technicaldepartment)
	{
		return new Technicaldepartmentdto(
				technicaldepartment.getTdegreeid(),
				technicaldepartment.getTdegreename());
//				technicaldepartment.getStudent());

}
	
	public static TechnicalDepartment maptoTechnicalDepartment(Technicaldepartmentdto technicaldepartmentdto)
	{
		return new TechnicalDepartment(
				technicaldepartmentdto.getTdegreeid(),
				technicaldepartmentdto.getTdegreename());
//				technicaldepartmentdto.getStudent());
	}
}