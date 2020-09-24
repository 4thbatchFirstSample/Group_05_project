package com.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
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
	public ResponseEntity<Object> addProject(@RequestBody ProjectDto projectDto) {
		projectService.addProject(ProjectConverter.projectDtoToProject(projectDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}	
	@GetMapping(value ="/project")
	public ResponseEntity<Object> getProjectDetails(){
		return new ResponseEntity<Object>(ProjectConverter.projectToProjectDto(projectService.getProject()), HttpStatus.OK);
		
	}
	@DeleteMapping(value = "/project/{id}")
	public ResponseEntity<Object> deleteProjectDetails(@PathVariable Long id){
		projectService.deleteProject(id);
		return new ResponseEntity<Object>("Deleted Successfully", HttpStatus.OK);
		
	}
	@GetMapping(value = "/project/{id}")
	public ResponseEntity<Object> getProjectBbyId(@PathVariable Long id){
		if(projectService.existsProjectId(id)) {
			return new ResponseEntity<Object>(ProjectConverter.projectToProjectDto(projectService.getProjectById(id)), HttpStatus.OK) ; 
		}
		return new ResponseEntity<Object>("ProjectID is invalid", HttpStatus.OK) ; 
		
	}
	@PutMapping(value = "/project")
	public ResponseEntity<Object> updateProject(@RequestBody ProjectDto projectDto) {
		if(projectService.existsProjectId(projectDto.getId())) {
			projectService.addProject(ProjectConverter.projectDtoToProject(projectDto));
			return new ResponseEntity<Object>("updated Successfully", HttpStatus.CREATED);
			}
		return new ResponseEntity<Object>("ProjectId is not valid", HttpStatus.CREATED);
	}
}
