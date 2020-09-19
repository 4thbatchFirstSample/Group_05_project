package com.spring.boot.services;

import java.util.List;

import com.spring.boot.entities.Defects;

public interface DefectsService {
	public void addDefects(Defects defects);
	public List<Defects> getDefects();
	public void deleteDefect(Long id);
	public void updateDefect(Defects defects);
	public Defects getDefectById(Long id);
}
