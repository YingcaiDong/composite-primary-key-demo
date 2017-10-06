package com.Employee.DataManagement.course;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepository;	
	
	public List<Course> getAllCourses(String id) {
		List<Course> courses = new ArrayList<>();
		courseRepository.findByTheIdTopicId(id).forEach(courses::add);
		return courses;
	}
	
	public Course getCourse(String id) {
		return courseRepository.findByTheIdCourseId(id);
	}

	public void addCourse(Course course) {
		courseRepository.save(course);
	}

	public void updateCourse(Course course) {
		courseRepository.save(course);
	}

	public void deleteCourse(KeyId id) {
		courseRepository.delete(id);
	}
}