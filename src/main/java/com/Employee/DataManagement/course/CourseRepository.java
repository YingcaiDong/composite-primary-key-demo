package com.Employee.DataManagement.course;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

/* 
 * CrudRepository interface contains common functions (add, get, update, delete)
 * In the generic, the first generic type is the return type
 * The second generic type is the id type (AKA primary key type)
 */
public interface CourseRepository extends CrudRepository<Course, KeyId> {
	public List<Course> findByTheIdTopicId(String topicId);
	public Course findByTheIdCourseId(String courseId);
	
	public void deleteByTheIdCourseId(String id);
	public void deleteByTheIdTopicId(String topicId);
}
