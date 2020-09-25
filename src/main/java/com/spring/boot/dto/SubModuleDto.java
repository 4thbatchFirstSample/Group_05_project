package com.spring.boot.dto;

import java.util.List;

public class SubModuleDto {
	private Long id;
	private String name;
	private Long moduleId;
	private String moduleName;
	private List<Long> userId;

	public List<Long> getUserId() {
		return userId;
	}
	public void setUserId(List<Long> userId) {
		this.userId = userId;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Long getModuleId() {
		return moduleId;
	}
	public void setModuleId(Long moduleId) {
		this.moduleId = moduleId;
	}
	public String getModuleName() {
		return moduleName;
	}
	public void setModuleName(String moduleName) {
		this.moduleName = moduleName;
	}	
}
