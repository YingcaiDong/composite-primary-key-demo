package com.Employee.DataManagement.course;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.Employee.DataManagement.topic.Topic;;


@Embeddable
public class KeyId implements Serializable {
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Column(name = "course_id")
	private String courseId;
	 
	 @ManyToOne
	 @JoinColumn(name="id", referencedColumnName="id")
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
