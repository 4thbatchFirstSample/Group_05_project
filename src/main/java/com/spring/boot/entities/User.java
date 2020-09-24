package com.spring.boot.entities;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NotBlank(message = "Name is mandatary")
	@Size(min = 2, max = 30)
	private String name;
	
	@NotBlank(message = "Password is mandatary")
	@Size(min = 2, max = 30)
	private String password;
	
	private String role;
	
	@NotBlank(message = "Email is mandatary")
	@Size(min = 2, max = 30)
	private String email;
	
	

	@ManyToMany(mappedBy = "users")
	private List<SubModule> subModules;

	
	
	public List<SubModule> getSubModules() {
		return subModules;
	}
	public void setSubModules(List<SubModule> subModules) {
		this.subModules = subModules;
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
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

	
}
