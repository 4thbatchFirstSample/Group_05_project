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

import com.spring.boot.entities.Defects;
import com.spring.boot.services.DefectsService;

@RestController
@RequestMapping(value="api/v1")
public class DefectsController {
	@Autowired
	private DefectsService defectsService;
	
	@PostMapping(value="/defect")
	public ResponseEntity<Object> addDefect(@RequestBody Defects defects){
		defectsService.addDefects(defects);
		return new ResponseEntity<Object>("Added SuccessFully", HttpStatus.CREATED);
	}
	
	@GetMapping(value="/defect")
	public ResponseEntity<Object> getDefect(){
		return new ResponseEntity<Object>(defectsService.getDefects(), HttpStatus.OK);
	}
	
	@DeleteMapping(value="/defect/{id}")
	public ResponseEntity<Object> deleteDefect(@PathVariable Long id){
		defectsService.deleteDefect(id);;
		return new ResponseEntity<Object>("Deleted Successfully", HttpStatus.OK);
	}
	
	@PutMapping(value="/defect")
	public ResponseEntity<Object> updateDefect(@RequestBody Defects defects){
		defectsService.updateDefect(defects);
		return new ResponseEntity<Object>("Updated SuccessFully", HttpStatus.OK);
	}
	
	@GetMapping(value="/defect/{id}")
	public ResponseEntity<Object> getDefectById(@PathVariable Long id){
		return new ResponseEntity<Object>(defectsService.getDefectById(id), HttpStatus.OK);
	}
}
