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


import com.spring.boot.entities.Project;
import com.spring.boot.services.ProjectService;

@RestController
@RequestMapping(value ="api/v1")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@PostMapping(value = "/project")
	public ResponseEntity<Object> addEmployee(@RequestBody Project project) {
		projectService.addProject(project);
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}
	
	@GetMapping(value="/project")
	public ResponseEntity<Object> getAllProject(){
		return new ResponseEntity<Object>(projectService.getAllProject(), HttpStatus.OK);
	}
	
	@DeleteMapping(value="/project/{id}")
	public ResponseEntity<Object> deleteById(@PathVariable Long id){
		projectService.deleteProject(id);
		return new ResponseEntity<Object>("Deleted Successfully", HttpStatus.OK);
	}
	
	@PutMapping(value="/project")
	public ResponseEntity<Object> updateProject(@RequestBody Project project) {
		projectService.addProject(project);
		return new ResponseEntity<Object>("Updated Successfully", HttpStatus.CREATED);
	}
	
	@GetMapping(value="/project/{id}")
	public ResponseEntity<Object> getById(@PathVariable Long id){
		return new ResponseEntity<Object>(projectService.getById(id), HttpStatus.OK);
	}
	
}
