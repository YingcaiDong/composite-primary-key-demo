package com.Employee.DataManagement.course;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.Employee.DataManagement.topic.Topic;


@Entity
@IdClass(KeyId.class)
public class Course {
	
	@Id
	@Column(name = "course_id")
	private String courseId;
	 
	@Id
	@ManyToOne
	@JoinColumn(name="id", referencedColumnName="id")
	private Topic topic;
	
	@Column(name = "name")
	private String name;
	@Column(name = "description")
	private String description;
	
	public Course(String id, String name, String description, String topicId) {
		super();
		this.name = name;
		this.description = description;
		this.courseId = id;
		this.topic = new Topic(topicId, "", "");
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

	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(String topic) {
		this.topic = new Topic(topic, "", "");
	}

}
