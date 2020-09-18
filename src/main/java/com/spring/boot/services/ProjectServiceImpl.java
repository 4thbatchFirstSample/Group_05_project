package com.spring.boot.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Project;
import com.spring.boot.repositories.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepository projectRepo;

	@Override
	public void addProject(Project project) {
		projectRepo.save(project);

	}

	@Override
	public List<Project> getProject() {
		return projectRepo.findAll();
	}

	@Override
	public void deleteProject(Long id) {
		projectRepo.deleteById(id);
		
	}

	@Override
	public void updateProject(Project project) {
		projectRepo.save(project);
		
	}

	@Override
	public Project getProjectById(Long id) {
		return projectRepo.findById(id).get();
	}

	

}
