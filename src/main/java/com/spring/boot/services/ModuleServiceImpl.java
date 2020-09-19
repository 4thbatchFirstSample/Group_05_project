package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Module;
import com.spring.boot.repositories.ModuleRepository;

@Service
public class ModuleServiceImpl implements ModuleService {

	@Autowired
	private ModuleRepository moduleRepo;
	
	@Override
	public void addModule(Module module) {
		moduleRepo.save(module);
		
	}

	@Override
	public List<Module> getAllModule() {
		return moduleRepo.findAll();
	}

	@Override
	public void deleteModule(Long id) {
		moduleRepo.deleteById(id);
		
	}

	@Override
	public void updateModule(Module module) {
		moduleRepo.save(module);
		
	}

	@Override
	public Module getModuleById(Long id) {
		return moduleRepo.findById(id).get();
	}

	@Override
	public List<Module> getAllModuleByProjectId(Long projectId) {
		return moduleRepo.findByProjectId(projectId);

	}

}
