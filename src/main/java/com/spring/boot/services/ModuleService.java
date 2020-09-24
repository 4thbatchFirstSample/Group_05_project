package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entities.Module;

public interface ModuleService {
	public void addModule(Module module);
	public List<Module> getAllModule();
	public void deleteModule(Long id);
	public void updateModule(Module module);
	public Module getModuleById(Long id);
	public List<Module> getAllModuleByProjectId(Long projectId);
	public boolean existsModuleId(Long id);
	public boolean existsProjectId(Long id);

}
