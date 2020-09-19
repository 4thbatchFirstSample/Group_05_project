package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.SubModule;
import com.spring.boot.repositories.SubModuleRepository;

@Service
public class SubModuleServiceImpl implements SubModuleService {
	@Autowired
	private SubModuleRepository subModuleRepository;
	
	@Override
	public void addSubModule(SubModule subModule) {
		subModuleRepository.save(subModule);
		
	}

	@Override
	public List<SubModule> getAllSubModule() {
		return subModuleRepository.findAll();
	}

	@Override
	public void deleteSubModule(Long id) {
		subModuleRepository.deleteById(id);
	}

	@Override
	public void updateSubModule(SubModule subModule) {
		subModuleRepository.save(subModule);
	}

	@Override
	public SubModule getSubModuleById(Long id) {
		return subModuleRepository.findById(id).get();
	}

//	@Override
//	public List<SubModule> getAllSubModuleByModuleId(Long id) {
//		return subModuleRepository.findByModuleId(id);
//	}

}
