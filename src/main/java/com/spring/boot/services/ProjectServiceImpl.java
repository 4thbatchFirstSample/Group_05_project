package com.spring.boot.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.entities.Project;
import com.spring.boot.repositories.ProjectRepository;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectRepository projectRepository;

	@Override
	public void addProject(Project project) {
		projectRepository.save(project);

	}

	@Override
	public List<Project> getProject() {
		return projectRepository.findAll();
	}

	@Override
	public void deleteProject(Long id) {
		projectRepository.deleteById(id);
		
	}

	@Override
	public void updateProject(Project project) {
		projectRepository.save(project);
		
	}

	@Override
	public Project getProjectById(Long id) {
		return projectRepository.findById(id).get();
	}

	

}
