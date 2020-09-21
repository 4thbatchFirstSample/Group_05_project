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

import com.spring.boot.converters.DefectConverter;
import com.spring.boot.converters.SubModuleConverter;
import com.spring.boot.dto.DefectDto;
import com.spring.boot.entities.Defects;
import com.spring.boot.services.DefectsService;

@RestController
@RequestMapping(value="api/v1")
public class DefectsController {
	@Autowired
	private DefectsService defectsService;
	
	@PostMapping(value="/defect")
	public ResponseEntity<Object> addDefect(@RequestBody DefectDto defectDto){
		defectsService.addDefects(DefectConverter.DefectDtoToDefect(defectDto));
		return new ResponseEntity<Object>("Added SuccessFully", HttpStatus.CREATED);
	}
	
	@GetMapping(value="/defect")
	public ResponseEntity<Object> getDefect(){
		return new ResponseEntity<Object>(DefectConverter.defectToDefectDto(defectsService.getDefects()), HttpStatus.OK);
	}
	
	@DeleteMapping(value="/defect/{id}")
	public ResponseEntity<Object> deleteDefect(@PathVariable Long id){
		defectsService.deleteDefect(id);;
		return new ResponseEntity<Object>("Deleted Successfully", HttpStatus.OK);
	}
	
	@PutMapping(value="/defect")
	public ResponseEntity<Object> updateDefect(@RequestBody DefectDto defectDto){
		defectsService.updateDefect(DefectConverter.DefectDtoToDefect(defectDto));
		return new ResponseEntity<Object>("Updated SuccessFully", HttpStatus.OK);
	}
	
	@GetMapping(value="/defect/{id}")
	public ResponseEntity<Object> getDefectById(@PathVariable Long id){
		return new ResponseEntity<Object>(DefectConverter.defectToDefectDto(defectsService.getDefectById(id)), HttpStatus.OK);
	}
	
	@GetMapping(value="/defect/sumodule-id/{id}")
	public ResponseEntity<Object> getDefectsBySubModuleId(@PathVariable Long id){
		return new ResponseEntity<Object>(DefectConverter.defectToDefectDto(defectsService.getAllDefectsBySubModuleId(id)), HttpStatus.OK) ;
	}
	
	@GetMapping(value="/defect/user-id/{id}")
	public ResponseEntity<Object> getDefectsByUserId(@PathVariable Long id){
		return new ResponseEntity<Object>(DefectConverter.defectToDefectDto(defectsService.getAllDefectsByUserId(id)), HttpStatus.OK) ;
	}
}
