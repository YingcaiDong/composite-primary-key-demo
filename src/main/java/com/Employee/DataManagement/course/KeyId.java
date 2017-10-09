package com.Employee.DataManagement.course;

import java.io.Serializable;

import com.Employee.DataManagement.topic.Topic;


public class KeyId implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String courseId;
	 
	private Topic topic;
	 public KeyId(String coursId, Topic topic) {
		 this.topic = topic;
		 this.courseId = coursId;
	 }
	 
	 protected KeyId() {}
	 
	public String getCourseId() {
		return courseId;
	}

	public void setCourseId(String courseId) {
		this.courseId = courseId;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
}
