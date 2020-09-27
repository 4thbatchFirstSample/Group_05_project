package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entities.Defects;

public interface DefectsService {
	public void addDefects(Defects defects);
	public List<Defects> getDefects();
	public void deleteDefect(Long id);
	public void updateDefect(Defects defects);
	public Defects getDefectById(Long id);
	public List<Defects> getAllDefectsBySubModuleId(Long id);
	public List<Defects> getAllDefectsByUserId(Long id);
	public boolean existsDefectId(Long id);
	public boolean existsSubModuleId(Long id);
	public boolean existsUserId(Long id);
	public Integer defectCount();
	public Integer defectCountByStatus(String status);	
	public Integer defectCountByType(String type);
	public Integer defectCountByPriority(String priority);
	public Integer defectCountByServeriry(String serverity);
}