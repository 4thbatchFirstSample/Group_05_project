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
	
//	@PostMapping(value = "/project")
//	public String addProjectDetails(@RequestBody Project project) {
//		projectService.addProject(project);
//		return "Added successfully";
//		
//	}
	
	@GetMapping(value ="/project")
	public ResponseEntity<Object> getProjectDetails(){
//		ProjectConverter.projectToProjectDto(projectService.getProject());
		return new ResponseEntity<Object>(ProjectConverter.projectToProjectDto(projectService.getProject()), HttpStatus.OK);
		
	}
	
//	@GetMapping(value = "/project")
//	public List<Project> getProjectDetails(){
//		return projectService.getProject();
//		
//	}
	
	@DeleteMapping(value = "/project/{id}")
	public ResponseEntity<Object> deleteProjectDetails(@PathVariable Long id){
		projectService.deleteProject(id);
		return new ResponseEntity<Object>("Deleted Successfully", HttpStatus.OK);
		
	}
	
//	@DeleteMapping(value = "/project/{id}")
//	public String deleteProjectDetails(@PathVariable Long id) {
//		projectService.deleteProject(id);
//		return "Deleted Successfully";
//		
//	}
	
//	@PutMapping(value = "/update/{id}")
//	public ResponseEntity<Object> updateProject(@RequestBody Project project, @PathVariable Long id){
//		Optional<Project> projectOptional = ProjectRepo.findById(id);
//		
//		if(!projectOptional.isPresent())
//			return ResponseEntity.notFound().build();
//		
//		project.setId(id);
//		projectService.addProject(project);
//		
//		return ResponseEntity.noContent().build();
//		
//	}
	
	@GetMapping(value = "/project/{id}")
	public ResponseEntity<Object> getProjectBbyId(@PathVariable Long id){
		return new ResponseEntity<Object>(ProjectConverter.projectToProjectDto(projectService.getProjectById(id)), HttpStatus.OK) ; 
		
	}
	
	@PutMapping(value = "/project")
	public ResponseEntity<Object> updateProject(@RequestBody ProjectDto projectDto) {
		projectService.addProject(ProjectConverter.projectDtoToProject(projectDto));
		return new ResponseEntity<Object>("Updated successfully", HttpStatus.OK);
	}
}
