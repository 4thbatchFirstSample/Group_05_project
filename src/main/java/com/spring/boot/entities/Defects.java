package com.spring.boot.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Defects {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long defect_id;
	private String defect_name;
	private String status;
	private String action;
	private String type;
	private String assign_to;
	private String priority;
	private String serverity;
	private String description;
	private String entered_by;
	private String sub_module_id;
	
	public Long getDefect_id() {
		return defect_id;
	}
	public void setDefect_id(Long defect_id) {
		this.defect_id = defect_id;
	}
	public String getDefect_name() {
		return defect_name;
	}
	public void setDefect_name(String defect_name) {
		this.defect_name = defect_name;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getAssign_to() {
		return assign_to;
	}
	public void setAssign_to(String assign_to) {
		this.assign_to = assign_to;
	}
	public String getPriority() {
		return priority;
	}
	public void setPriority(String priority) {
		this.priority = priority;
	}
	public String getServerity() {
		return serverity;
	}
	public void setServerity(String serverity) {
		this.serverity = serverity;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEntered_by() {
		return entered_by;
	}
	public void setEntered_by(String entered_by) {
		this.entered_by = entered_by;
	}
	public String getSub_module_id() {
		return sub_module_id;
	}
	public void setSub_module_id(String sub_module_id) {
		this.sub_module_id = sub_module_id;
	}
}
