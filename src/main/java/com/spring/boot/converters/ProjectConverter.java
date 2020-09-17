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

				listProjectDto.add(projectDto);
			}
			return listProjectDto;
		}
		return null;

	}

}
