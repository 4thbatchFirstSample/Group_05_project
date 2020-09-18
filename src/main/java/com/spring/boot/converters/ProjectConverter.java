package com.spring.boot.converters;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.spring.boot.dto.ProjectDto;
import com.spring.boot.entities.Project;

@Service
public class ProjectConverter {
	// projectDto to Project Entity Converter
	public static Project projectDtoToProject(ProjectDto projectDto) {
		Project project = new Project();
		if (projectDto != null) {
			project.setId(projectDto.getId());
			project.setName(projectDto.getName());
			project.setAbbreviation(projectDto.getAbbreviation());
			project.setType(projectDto.getType());
			project.setStatus(projectDto.getStatus());
			project.setStart_date(projectDto.getStart_date());
			project.setEnd_date(projectDto.getEnd_date());
			return project;
		}
		return null;
	}

	// Project to ProjectDto list converter

	public static List<ProjectDto> projectToProjectDto(List<Project> projectList) {
		List<ProjectDto> listProjectDto = new ArrayList<>();
		if (projectList != null) {
			for (Project project : projectList) {
				ProjectDto projectDto = new ProjectDto();
				projectDto.setId(project.getId());
				projectDto.setName(project.getName());
				projectDto.setAbbreviation(project.getAbbreviation());
				projectDto.setType(project.getType());
				projectDto.setStatus(project.getStatus());
				projectDto.setStart_date(project.getStart_date());
				projectDto.setEnd_date(project.getEnd_date());

				listProjectDto.add(projectDto);
			}
			return listProjectDto;
		}
		return null;

	}
	
	public static ProjectDto projectToProjectDto(Project project) {
		ProjectDto projectDto = new ProjectDto();
		if (project != null) {
			projectDto.setId(project.getId());
			projectDto.setName(project.getName());
			projectDto.setAbbreviation(project.getAbbreviation());
			projectDto.setType(project.getType());
			projectDto.setStatus(project.getStatus());
			projectDto.setStart_date(project.getStart_date());
			projectDto.setEnd_date(project.getEnd_date());
			return projectDto;
		}
		return null;
	}

}
