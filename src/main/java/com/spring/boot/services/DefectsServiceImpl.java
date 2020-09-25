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
	@Override
	public List<Defects> getAllDefectsBySubModuleId(Long id) {
		return defectsRepository.findBySubModuleId(id);
	}
	@Override
	public List<Defects> getAllDefectsByUserId(Long id) {
		return defectsRepository.findByUserId(id);
	}
	@Override
	public boolean existsDefectId(Long id) {
		return defectsRepository.existsById(id);
	}
	@Override
	public boolean existsSubModuleId(Long id) {
		return defectsRepository.existsBySubModuleId(id);
	}
	@Override
	public boolean existsUserId(Long id) {
		return defectsRepository.existsByUserId(id);
	}
	@Override
	public Integer defectCount() {
		return (int) defectsRepository.count();
	}
	@Override
	public Integer defectCountByStatus(String status) {
		return (int) defectsRepository.countByStatus(status);
	}
	@Override
	public Integer defectCountByType(String type) {
		return (int) defectsRepository.countByType(type);
	}
	@Override
	public Integer defectCountByPriority(String priority) {
		return (int) defectsRepository.countByPriority(priority);
	}
	@Override
	public Integer defectCountByServeriry(String serverity) {
		return (int) defectsRepository.countByServerity(serverity);
	}
	
}
