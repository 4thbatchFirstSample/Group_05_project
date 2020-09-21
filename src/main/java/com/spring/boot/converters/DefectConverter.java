package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.DefectDto;
import com.spring.boot.entities.Defects;
import com.spring.boot.entities.SubModule;
import com.spring.boot.entities.User;

@Service
public class DefectConverter {
	public static Defects DefectDtoToDefect(DefectDto defectDto) {
		Defects defect = new Defects();
		User user = new User();
		SubModule subModule = new SubModule();
		if(defectDto != null) {
			defect.setId(defectDto.getId());
			defect.setAction(defectDto.getAction());
			defect.setCreated_date(defectDto.getCreated_date());
			defect.setDescription(defectDto.getDescription());
			defect.setPriority(defectDto.getPriority());
			defect.setServerity(defectDto.getServerity());
			defect.setStatus(defectDto.getStatus());
			defect.setEntered_by(defectDto.getEntered_by());
			defect.setUpdated_date(defectDto.getUpdated_date());
			defect.setType(defectDto.getType());
			defect.setName(defectDto.getName());
			user.setId(defectDto.getUserID());
			subModule.setId(defectDto.getSubModuleId());
			
			defect.setSubModule(subModule);
			defect.setUser(user);
			
			return defect;
		}
		return null;
		
	}
	
	public static List<DefectDto> defectToDefectDto(List<Defects> defectList){
		List<DefectDto> listDefectDto = new ArrayList<>();
		if(defectList != null) {
			for(Defects defect : defectList) {
				DefectDto defectDto = new DefectDto();
				defectDto.setId(defect.getId());
				defectDto.setAction(defect.getAction());
				defectDto.setCreated_date(defect.getCreated_date());
				defectDto.setDescription(defect.getDescription());
				defectDto.setPriority(defect.getPriority());
				defectDto.setServerity(defect.getServerity());
				defectDto.setStatus(defect.getStatus());
				defectDto.setEntered_by(defect.getEntered_by());
				defectDto.setUpdated_date(defect.getUpdated_date());
				defectDto.setType(defect.getType());
				defectDto.setName(defect.getName());
				defectDto.setSubModuleId(defect.getSubModule().getId());
				defectDto.setUserID(defect.getUser().getId());
				
				listDefectDto.add(defectDto);
				
			}
			return listDefectDto;
		}
		return null;
	}
	
	public static DefectDto defectToDefectDto(Defects defect){
		DefectDto defectDto = new DefectDto();
		if(defect != null) {
			defectDto.setId(defect.getId());
			defectDto.setAction(defect.getAction());
			defectDto.setCreated_date(defect.getCreated_date());
			defectDto.setDescription(defect.getDescription());
			defectDto.setPriority(defect.getPriority());
			defectDto.setServerity(defect.getServerity());
			defectDto.setStatus(defect.getStatus());
			defectDto.setEntered_by(defect.getEntered_by());
			defectDto.setUpdated_date(defect.getUpdated_date());
			defectDto.setType(defect.getType());
			defectDto.setName(defect.getName());
			defectDto.setSubModuleId(defect.getSubModule().getId());
			defectDto.setUserID(defect.getUser().getId());
			
			return defectDto;
		}
		return null;
		
	}

	
}
