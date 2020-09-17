package com.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.converters.ProjectConverter;
import com.spring.boot.dto.ProjectDto;
import com.spring.boot.services.ProjectService;

@RestController
@RequestMapping(value ="api/v1")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@PostMapping(value = "/project")
	public ResponseEntity<Object> addEmployee(@RequestBody ProjectDto projectDto) {
		projectService.addProject(ProjectConverter.projectDtoToProject(projectDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}
}
