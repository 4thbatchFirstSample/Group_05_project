package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entities.Module;
import com.spring.boot.entities.SubModule;

public interface SubModuleService {
	public void addSubModule(SubModule subModule);
	public List<SubModule> getAllModule();
	public void deleteSubModule(Long id);
	public void updateSubModule(SubModule subModule);
	public SubModule getSubModuleById(Long id);
	public List<Module> getAllSubModule(Long id);
}
