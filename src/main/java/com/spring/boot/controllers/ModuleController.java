package com.spring.boot.controllers;

import java.util.List;

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

import com.spring.boot.converters.ModuleConverter;
import com.spring.boot.dto.ModuleDto;
import com.spring.boot.services.ModuleService;

@RestController
@RequestMapping(value = "api/v1")
public class ModuleController {
	
	@Autowired
	private ModuleService moduleService;
	
	@PostMapping(value = "/module")
	public ResponseEntity<Object> addModule(@RequestBody ModuleDto moduleDto){
		moduleService.addModule(ModuleConverter.moduleDtoToModule(moduleDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.OK);
	}
	
	@GetMapping(value = "/module")
	public ResponseEntity<Object> getAllModule(){
		return new ResponseEntity<Object>(ModuleConverter.moduleToModuleDto(moduleService.getAllModule()), HttpStatus.OK);
		
	}
	
	@DeleteMapping(value = "/module/{id}")
	public ResponseEntity<Object> deleteModuleDetails(@PathVariable Long id){
		moduleService.deleteModule(id);
		return new ResponseEntity<Object>("Deleted Successfully", HttpStatus.OK);
		
	}
	
	@GetMapping(value = "/module/{id}")
	public ResponseEntity<Object> getModuleById(@PathVariable Long id){
		
		return new ResponseEntity<Object>(ModuleConverter.moduleToModuleDto(moduleService.getModuleById(id)), HttpStatus.OK);
		
	}
	
	@PutMapping(value = "/module")
	public ResponseEntity<Object> updateModule(@RequestBody ModuleDto moduleDto){
		moduleService.addModule(ModuleConverter.moduleDtoToModule(moduleDto));
		return new ResponseEntity<Object>("Updated Successfully", HttpStatus.OK);
	}
	
	@GetMapping(value = "/module/project-id/{id}")
	public List<ModuleDto> getAllModule(@PathVariable Long id){
		return ModuleConverter.moduleToModuleDto(moduleService.getAllModuleByProjectId(id));
		
	}
}
