package com.spring.boot.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Defects;
import com.spring.boot.repositories.DefectsRepository;

@Service
public class DefectsServiceImpl implements DefectsService {
	@Autowired
	private DefectsRepository defectsRepository;
	
	@Override
	public void addDefects(Defects defects) {
		defectsRepository.save(defects);
	}

	@Override
	public List<Defects> getDefects() {
		return defectsRepository.findAll();
	}

	@Override
	public void deleteDefect(Long id) {
		defectsRepository.deleteById(id);
	}

	@Override
	public void updateDefect(Defects defects) {
		defectsRepository.save(defects);
	}

	@Override
	public Defects getDefectById(Long id) {
		return defectsRepository.findById(id).get();
	}

}
