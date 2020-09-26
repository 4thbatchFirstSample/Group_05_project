package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Module;
import com.spring.boot.repositories.ModuleRepository;

@Service
public class ModuleServiceImpl implements ModuleService {
	@Autowired
	private ModuleRepository moduleRepository;

	@Override
	public void addModule(Module module) {
		// TODO Auto-generated method stub
		moduleRepository.save(module);
		
	}

	@Override
	public List<Module> getAllModule() {
		// TODO Auto-generated method stub
		return moduleRepository.findAll();
	}

	@Override
	public void deleteModule(Long id) {
		// TODO Auto-generated method stub
		moduleRepository.deleteById(id);
		
	}

	@Override
	public void updateModule(Module module) {
		// TODO Auto-generated method stub
		moduleRepository.save(module);
		
	}

	@Override
	public Module getById(Long id) {
		// TODO Auto-generated method stub
		return moduleRepository.findById(id).get();
	}

}
