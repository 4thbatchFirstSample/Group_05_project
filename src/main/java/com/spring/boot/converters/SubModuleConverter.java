package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.SubModuleDto;
import com.spring.boot.entities.Module;
import com.spring.boot.entities.SubModule;

@Service
public class SubModuleConverter {
	public static SubModule subModuleDtotoSubModule(SubModuleDto subModuleDto) {
		SubModule subModule = new SubModule();
		Module module = new Module();
		if(subModuleDto != null) {
			subModule.setId(subModuleDto.getId());
			subModule.setName(subModuleDto.getName());
			module.setId(subModuleDto.getModuleId());
			module.setName(subModuleDto.getModuleName());
			subModule.setModule(module);
			return subModule;
		}
		return null;
		
	}
	
	public static List<SubModuleDto> subModuleToSubModuleDto(List<SubModule> subModuleList ){
		List<SubModuleDto> listSubModuleDto = new ArrayList<>();
		if(subModuleList != null) {
			for(SubModule subModule : subModuleList) {
				SubModuleDto subModuleDto = new SubModuleDto();
				subModuleDto.setId(subModule.getId());
				subModuleDto.setName(subModule.getName());
				subModuleDto.setModuleId(subModule.getModule().getId());
				subModuleDto.setModuleName(subModule.getModule().getName());
				
				listSubModuleDto.add(subModuleDto);
			}
			return listSubModuleDto;
		}
		return null;
		
	}
	
	public static SubModuleDto subModuleTosubModuleDto(SubModule subModule) {
		SubModuleDto subModuleDto = new SubModuleDto();
		if(subModule != null) {
			subModuleDto.setId(subModule.getId());
			subModuleDto.setName(subModule.getName());
			subModuleDto.setModuleId(subModule.getModule().getId());
			subModuleDto.setModuleName(subModule.getModule().getName());
			
			return subModuleDto;
		}
		return null;
	}
}
