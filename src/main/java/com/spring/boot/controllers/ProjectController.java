package com.spring.boot.controllers;

import java.util.List;
import java.util.Optional;

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
import com.spring.boot.entities.Project;
import com.spring.boot.repositories.ProjectRepository;
import com.spring.boot.services.ProjectService;

@RestController
@RequestMapping(value ="api/v1")
public class ProjectController {

	@Autowired
	private ProjectService projectService;
	
	@Autowired
	private ProjectRepository ProjectRepo;

	
//	@PostMapping(value = "/project")
//	public ResponseEntity<Object> addEmployee(@RequestBody ProjectDto projectDto) {
//		projectService.addProject(ProjectConverter.projectDtoToProject(projectDto));
//		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
//	}
//	
	@PostMapping(value = "/project")
	public String addProjectDetails(@RequestBody Project project) {
		projectService.addProject(project);
		return "Added successfully";
		
	}
	
	@GetMapping(value = "/getall")
	public List<Project> getProjectDetails(){
		return projectService.getProject();
		
	}
	
	@DeleteMapping(value = "/project/{id}")
	public String deleteProjectDetails(@PathVariable Long id) {
		projectService.deleteProject(id);
		return "Deleted Successfully";
		
	}
	
	@PutMapping(value = "/update/{id}")
	public ResponseEntity<Object> updateProject(@RequestBody Project project, @PathVariable Long id){
		Optional<Project> projectOptional = ProjectRepo.findById(id);
		
		if(!projectOptional.isPresent())
			return ResponseEntity.notFound().build();
		
		project.setId(id);
		projectService.addProject(project);
		
		return ResponseEntity.noContent().build();
		
	}
	
	@GetMapping(value = "/getInstance/{id}")
	public Optional<Project> getProjectById(@PathVariable Long id){
		return projectService.getProjectById(id);
		
	}
	
}
