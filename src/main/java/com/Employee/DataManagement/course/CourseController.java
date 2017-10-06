package com.Employee.DataManagement.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.Employee.DataManagement.topic.Topic;

@RestController
public class CourseController {
	
	@Autowired
	private CourseService courseService;
	
	@RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCrouses(@PathVariable String id) {
		return this.courseService.getAllCourses(id);
	}
	
	// Using @PathVariable("str") in case {id} is not the same as the function argument.
	@RequestMapping("/topics/{TopicId}/courses/{id}")
	public Course getCourse(@PathVariable("id") String id) {
		return this.courseService.getCourse(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="topics/{topicId}/courses")
	public void addCourse(@RequestBody Course course, @PathVariable("topicId") String topicId) {
		course.setTopic(topicId);
		this.courseService.addCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="topics/{topicId}/courses/{id}")
	public void updateCourse(@RequestBody Course course, @PathVariable("id") String id, @PathVariable("topicId") String topicId) {
		course.setTopic(topicId);
		this.courseService.updateCourse(course);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="topics/{topicId}/courses/{id}")
	public void DeleteCourse(@PathVariable String id) {
		this.courseService.deleteCourse(new KeyId(id, null));
	}
}
