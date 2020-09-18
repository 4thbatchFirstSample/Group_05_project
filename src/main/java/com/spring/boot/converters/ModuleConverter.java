package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.ModuleDto;
import com.spring.boot.entities.Module;
import com.spring.boot.entities.Project;

@Service
public class ModuleConverter {
	//ModuleDto to Module Entity Converter
	public static Module moduleDtoToModule(ModuleDto moduleDto) {
		Module module = new Module();
		Project project = new Project();
		if(moduleDto != null) {
			module.setModuleId(moduleDto.getModuleId());
			module.setName(moduleDto.getName());
			project.setId(moduleDto.getProjectId());
			module.setProject(project);
			return module;
		}
		return null;	
	}
	
	public static List<ModuleDto> moduleToModuleDto(List<Module> moduleList){
		List<ModuleDto> listModuleDto = new ArrayList<>();
		Project project = new Project();
		if(moduleList != null) {
			for(Module module : moduleList) {
				ModuleDto moduleDto = new ModuleDto();
				moduleDto.setModuleId(module.getModuleId());
				moduleDto.setName(module.getName());
				moduleDto.setProjectId(module.getProject().getId());
				moduleDto.setProjectName(module.getProject().getName());
				
				listModuleDto.add(moduleDto);
			}
			return listModuleDto;
		}
		return null;
		
	}
	
	public static ModuleDto moduleToModuleDto(Module module) {
		ModuleDto moduleDto = new ModuleDto();
		Project project = new Project();
		if(module != null) {
			moduleDto.setModuleId(module.getModuleId());
			moduleDto.setName(module.getName());
			moduleDto.setProjectId(project.getId());
			return moduleDto;
		}
		return null;
		
	}

}
