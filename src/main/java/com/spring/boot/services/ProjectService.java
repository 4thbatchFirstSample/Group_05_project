package com.spring.boot.services;

import com.spring.boot.entities.Project;

import java.util.List;
import java.util.Optional;

public interface ProjectService {
	public void addProject(Project project);
	public List<Project> getProject();
	public void deleteProject(Long id);
	public void updateProject(Project project);
	public Project getProjectById(Long id);
}
