package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Module;
import com.spring.boot.entities.SubModule;
import com.spring.boot.repositories.SubModuleRepository;

@Service
public class SubModuleServiceImpl implements SubModuleService {

	@Autowired
	private SubModuleRepository subModuleRepo;
	
	@Override
	public void addSubModule(SubModule subModule) {
		subModuleRepo.save(subModule);
	}

	@Override
	public List<SubModule> getAllModule() {
		return subModuleRepo.findAll();
	}

	@Override
	public void deleteSubModule(Long id) {
		subModuleRepo.deleteById(id);
		
	}

	@Override
	public void updateSubModule(SubModule subModule) {
		subModuleRepo.save(subModule);		
	}

	@Override
	public SubModule getSubModuleById(Long id) {
		return subModuleRepo.findById(id).get();
	}

	@Override
	public List<Module> getAllSubModule(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	
}
