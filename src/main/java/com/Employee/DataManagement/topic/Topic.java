package com.Employee.DataManagement.topic;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="topic")
public class Topic {

	@Id // @Id set the primary key (used in database)
	private String id;
	private String name;
	private String description;
	
	public Topic(String id, String name, String description) {
		super();
		this.name = name;
		this.id = id;
		this.description = description;
	}
	
	public Topic() {}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getId() {
		return this.id;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
