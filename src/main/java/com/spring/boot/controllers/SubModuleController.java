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

import com.spring.boot.converters.SubModuleConverter;
import com.spring.boot.dto.SubModuleDto;
import com.spring.boot.services.SubModuleService;

@RestController
@RequestMapping(value = "api/v1")
public class SubModuleController {
	@Autowired
	private SubModuleService subModuleService;
	
	@PostMapping(value= "/submodule")
	public ResponseEntity<Object> addSubModule(@RequestBody SubModuleDto subModuleDto){
		subModuleService.addSubModule(SubModuleConverter.subModuleDtotoSubModule(subModuleDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.OK);	
	}
	@GetMapping(value="/submodule")
	public ResponseEntity<Object> getSubModule(){
		return new ResponseEntity<Object>(SubModuleConverter.subModuleToSubModuleDto(subModuleService.getAllSubModule()), HttpStatus.OK);
	}
	@DeleteMapping(value="submodule/{id}")
	public ResponseEntity<Object> deleteSubModule(@PathVariable Long id){
		subModuleService.deleteSubModule(id);
		return new ResponseEntity<Object>("Deleted Successfully", HttpStatus.OK);	
	}
	@GetMapping(value="/submodule/{id}")
	public ResponseEntity<Object> getSubModuleById(@PathVariable Long id){
		return new ResponseEntity<Object>(SubModuleConverter.subModuleTosubModuleDto(subModuleService.getSubModuleById(id)), HttpStatus.OK);	
	}
	@PutMapping(value="/submodule")
	public ResponseEntity<Object> updateSubModule(@RequestBody SubModuleDto subModuleDto){
		subModuleService.updateSubModule(SubModuleConverter.subModuleDtotoSubModule(subModuleDto));
		return new ResponseEntity<Object>("Updated Successfully", HttpStatus.OK);	
	}
	@GetMapping(value="/submodule/module-id/{id}")
	public ResponseEntity<Object> getSubModuleByModuleId(@PathVariable Long id){
		return new ResponseEntity<Object>(SubModuleConverter.subModuleToSubModuleDto(subModuleService.getAllSubModuleByModuleId(id)), HttpStatus.OK) ;
	}
	@GetMapping(value="/submodule/user-id/{id}")
	public ResponseEntity<Object> getSubModuleByUserId(@PathVariable Long id){
		return new ResponseEntity<Object>(SubModuleConverter.subModuleToSubModuleDto(subModuleService.getAllSubModuleByUserId(id)), HttpStatus.OK) ;
	}
}