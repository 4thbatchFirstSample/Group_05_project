package com.spring.boot.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.converters.ModuleConverter;
import com.spring.boot.dto.ModuleDto;
import com.spring.boot.services.ModuleService;

@RestController
@RequestMapping(value = "api/v1")
public class ModuleConroller {
	@Autowired
	private ModuleService moduleService;

	@PostMapping(value = "/module")
	public ResponseEntity<Object> addModule(@RequestBody ModuleDto moduleDto) {
		moduleService.addModule(ModuleConverter.moduleDtoToModule(moduleDto));
		return new ResponseEntity<Object>("Added Successfully", HttpStatus.CREATED);
	}

	@GetMapping(value="/module")
	public ResponseEntity<Object> getAllModule(){
		return new ResponseEntity<Object>(ModuleConverter.moduleToModuleDto(moduleService.getAllModule()), HttpStatus.OK);
	}
//	
//	@DeleteMapping(value="/module/{id}")
//	public ResponseEntity<Object> deleteById(@PathVariable Long id){
//		moduleService.deleteModule(id);
//		return new ResponseEntity<Object>("Deleted Successfully", HttpStatus.OK);
//	}
//	
//	@PutMapping(value="/module")
//	public ResponseEntity<Object> updateModule(@RequestBody Module module) {
//		moduleService.addModule(module);
//		return new ResponseEntity<Object>("Updated Successfully", HttpStatus.CREATED);
//	}
//	
//	@GetMapping(value="/module/{id}")
//	public ResponseEntity<Object> getById(@PathVariable Long id){
//		return new ResponseEntity<Object>(moduleService.getById(id), HttpStatus.OK);
//	}
}
