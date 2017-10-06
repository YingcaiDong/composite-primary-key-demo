package com.Employee.DataManagement.course;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.Employee.DataManagement.topic.Topic;


@Entity
public class Course {
	@EmbeddedId
	private KeyId theId;
	
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	
	public Course(String id, String name, String description, String topicId) {
		super();
		this.name = name;
		this.description = description;
		
		this.theId = new KeyId(id, new Topic(topicId, "", ""));
	}
	
	public Course() {}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	public String getDescription() {
		return this.description;
	}
	public void setDescription(String description) {
		this.description = description;
	}

	public KeyId getTheId() {
		return theId;
	}
	public void setTheId(KeyId id) {
		this.theId = id;
	}
}
