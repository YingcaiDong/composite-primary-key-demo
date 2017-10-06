package com.Employee.DataManagement.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
	
	@Autowired
	private TopicService topicService;
	
	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return this.topicService.getAllTopics();
	}
	
	// Using @PathVariable("str") in case {id} is not the same as the function argument.
	@RequestMapping("/topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return this.topicService.getTopic(id);
	}
	
	@RequestMapping(method=RequestMethod.POST, value="/topics")
	public void addTopic(@RequestBody Topic topic) {
		this.topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
		this.topicService.updateTopic(topic, id);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void DeleteTopic(@PathVariable String id) {
		this.topicService.deleteTopic(id);
	}
}
