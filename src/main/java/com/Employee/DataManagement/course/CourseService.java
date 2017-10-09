package com.Employee.DataManagement.course;

import java.util.ArrayList;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;	
	
	public List<Course> getAllCourses(String id) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTopicId(id).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id) {
		return courseRepository.findByCourseId(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	/*
	 * By adding this annotation
	 * Will prevent error:  No EntityManager with actual transaction available for current thread 
	 */
	@Transactional
	public void deleteCourse(String id) {
		courseRepository.deleteByTheIdCourseId(id);
	}
	
	@Transactional
	public void deleteAllCourseUnderTopic(String topicId) {
		courseRepository.deleteByTheIdTopicId(topicId);
	}
}
